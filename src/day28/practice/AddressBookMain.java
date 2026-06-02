package day28.practice;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

    public static void main(String[] args)
            throws Exception {

        List<Contact> contacts =
                new ArrayList<>();

        contacts.add(
                new Contact(
                        "Tharun",
                        "Kumar",
                        "Chennai",
                        "Tamil Nadu",
                        "600001"));

        contacts.add(
                new Contact(
                        "Ajay",
                        "Kumar",
                        "Trichy",
                        "Tamil Nadu",
                        "620001"));

        // UC14 - CSV
        AddressBookCSV.writeToCSV(
                contacts,
                "contacts.csv");

        AddressBookCSV.readFromCSV(
                "contacts.csv");

        // UC15 - JSON
        AddressBookJSON.writeToJSON(
                contacts,
                "contacts.json");

        AddressBookJSON.readFromJSON(
                "contacts.json");
    }
}
