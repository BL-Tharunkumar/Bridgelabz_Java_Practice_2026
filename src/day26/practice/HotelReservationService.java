package day26.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HotelReservationService {

    List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Hotel findCheapestBestRatedHotel(
            LocalDate startDate,
            LocalDate endDate,
            String customerType)
            throws HotelReservationException {

        if (startDate.isAfter(endDate)) {
            throw new HotelReservationException(
                    "Invalid Date Range");
        }

        int weekdays = 0;
        int weekends = 0;

        for (LocalDate date = startDate;
             !date.isAfter(endDate);
             date = date.plusDays(1)) {

            DayOfWeek day = date.getDayOfWeek();

            if (day == DayOfWeek.SATURDAY
                    || day == DayOfWeek.SUNDAY) {

                weekends++;
            } else {
                weekdays++;
            }
        }

        int finalWeekdays1 = weekdays;
        int finalWeekends1 = weekends;
        int minimumCost = hotels.stream()
                .mapToInt(h ->
                        h.calculateRate(
                                finalWeekdays1,
                                finalWeekends1,
                                customerType))
                .min()
                .getAsInt();

        int finalWeekdays = weekdays;
        int finalWeekends = weekends;
        return hotels.stream()
                .filter(h ->
                        h.calculateRate(
                                finalWeekdays,
                                finalWeekends,
                                customerType)
                                == minimumCost)
                .max(Comparator.comparing(
                        Hotel::getRating))
                .get();
    }
}
