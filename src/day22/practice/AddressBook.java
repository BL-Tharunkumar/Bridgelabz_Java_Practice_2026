package day22.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    List<Contact> contacts = new ArrayList<>();

    // Add Contact
    public void addContact(Contact contact) {

        boolean duplicate = contacts.stream()
                .anyMatch(person -> person.equals(contact));

        if (duplicate) {

            System.out.println("Duplicate Contact Found");

        } else {

            contacts.add(contact);

            System.out.println("Contact Added Successfully");
        }
    }

    // View Contacts
    public void viewContacts() {

        contacts.forEach(System.out::println);
    }

    // Edit Contact
    public void editContact(String firstName,
                            String newCity) {

        for (Contact person : contacts) {

            if (person.firstName.equals(firstName)) {

                person.city = newCity;

                System.out.println("Contact Updated");
            }
        }
    }

    // Delete Contact
    public void deleteContact(String firstName) {

        contacts.removeIf(person ->
                person.firstName.equals(firstName));

        System.out.println("Contact Deleted");
    }

    // Search by City
    public void searchByCity(String city) {

        List<Contact> result = contacts.stream()
                .filter(person ->
                        person.city.equals(city))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    // Count by City
    public long countByCity(String city) {

        return contacts.stream()
                .filter(person ->
                        person.city.equals(city))
                .count();
    }
}
