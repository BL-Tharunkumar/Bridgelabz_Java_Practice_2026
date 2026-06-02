package day28.practice;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AddressBookCSV {

    public static void writeToCSV(
            List<Contact> contacts,
            String fileName) throws Exception {

        CSVWriter writer =
                new CSVWriter(new FileWriter(fileName));

        for (Contact contact : contacts) {

            String[] data = {
                    contact.getFirstName(),
                    contact.getLastName(),
                    contact.getCity(),
                    contact.getState(),
                    contact.getZip()
            };

            writer.writeNext(data);
        }

        writer.close();

        System.out.println(
                "Contacts saved to CSV file.");
    }

    public static void readFromCSV(
            String fileName) throws Exception {

        CSVReader reader =
                new CSVReader(new FileReader(fileName));

        List<String[]> records =
                reader.readAll();

        System.out.println(
                "\nContacts from CSV:");

        for (String[] row : records) {

            System.out.println(
                    row[0] + " "
                            + row[1] + " "
                            + row[2] + " "
                            + row[3] + " "
                            + row[4]);
        }

        reader.close();
    }
}