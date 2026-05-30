package day24.practice;

import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Address Book Program");

        Map<String, AddressBook> books =
                new HashMap<>();

        AddressBook homeBook =
                new AddressBook();

        books.put("Home", homeBook);

        homeBook.addContact(
                new Contact(
                        "Tharun",
                        "Kumar",
                        "Chennai",
                        "Tamil Nadu",
                        "600001"));

        homeBook.addContact(
                new Contact(
                        "Ajay",
                        "Kumar",
                        "Trichy",
                        "Tamil Nadu",
                        "620001"));

        homeBook.addContact(
                new Contact(
                        "Tharun",
                        "Kumar",
                        "Chennai",
                        "Tamil Nadu",
                        "600001"));

        System.out.println("\nSearch By City:");
        homeBook.searchByCity("Chennai")
                .forEach(System.out::println);

        System.out.println(
                "\nCount By City: "
                        + homeBook.countByCity("Chennai"));

        System.out.println(
                "\nCount By State: "
                        + homeBook.countByState("Tamil Nadu"));

        System.out.println("\nSort By Name:");
        homeBook.sortByName();

        System.out.println("\nSort By City:");
        homeBook.sortByCity();

        System.out.println("\nSort By State:");
        homeBook.sortByState();

        System.out.println("\nSort By Zip:");
        homeBook.sortByZip();
    }
}
