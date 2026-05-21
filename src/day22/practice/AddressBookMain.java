package day22.practice;

import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {

    public static void main(String[] args) {

        Map<String, AddressBook> addressBooks =
                new HashMap<>();

        // Create Address Book
        AddressBook homeBook = new AddressBook();

        addressBooks.put("Home", homeBook);

        // Add Contacts
        Contact person1 = new Contact(
                "Tharun",
                "Kumar",
                "Chennai",
                "Chennai",
                "Tamil Nadu",
                "600001",
                "9876543210",
                "tharun@gmail.com"
        );

        Contact person2 = new Contact(
                "Ajay",
                "Kumar",
                "Trichy",
                "Trichy",
                "Tamil Nadu",
                "620001",
                "9123456780",
                "ajay@gmail.com"
        );

        homeBook.addContact(person1);

        homeBook.addContact(person2);

        // Duplicate Check
        homeBook.addContact(person1);

        // View Contacts
        System.out.println("\nAll Contacts:");
        homeBook.viewContacts();

        // Edit Contact
        homeBook.editContact("Ajay", "Madurai");

        // Search by City
        System.out.println("\nSearch By City:");
        homeBook.searchByCity("Madurai");

        // Count By City
        long count =
                homeBook.countByCity("Madurai");

        System.out.println(
                "\nCount in Madurai: " + count);

        // Delete Contact
        homeBook.deleteContact("Ajay");

        // View After Delete
        System.out.println("\nAfter Delete:");
        homeBook.viewContacts();
    }
}
