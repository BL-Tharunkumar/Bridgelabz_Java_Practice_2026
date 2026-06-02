package day26.practice;

import java.time.LocalDate;

public class HotelReservationMain {

    public static void main(String[] args)
            throws Exception {

        System.out.println(
                "Welcome to Hotel Reservation Program");

        HotelReservationService service =
                new HotelReservationService();

        service.addHotel(new Hotel(
                "Lakewood",
                3,
                110,
                90,
                80,
                80));

        service.addHotel(new Hotel(
                "Bridgewood",
                4,
                160,
                60,
                110,
                50));

        service.addHotel(new Hotel(
                "Ridgewood",
                5,
                220,
                150,
                100,
                40));

        LocalDate start =
                LocalDate.of(2020, 9, 11);

        LocalDate end =
                LocalDate.of(2020, 9, 12);

        Hotel hotel =
                service.findCheapestBestRatedHotel(
                        start,
                        end,
                        "Regular");

        System.out.println(
                "Cheapest Best Rated Hotel: "
                        + hotel.getName());

        System.out.println(
                "Rating: "
                        + hotel.getRating());
    }
}
