package day24.practice;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {

    List<Contact> contacts = new ArrayList<>();

    // UC7 - Duplicate Check
    public void addContact(Contact contact) {

        boolean duplicate = contacts.stream()
                .anyMatch(person -> person.equals(contact));

        if (duplicate) {
            System.out.println("Duplicate Contact Found");
        } else {
            contacts.add(contact);
            System.out.println("Contact Added");
        }
    }

    // UC8 - Search by City
    public List<Contact> searchByCity(String city) {

        return contacts.stream()
                .filter(person ->
                        person.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // UC8 - Search by State
    public List<Contact> searchByState(String state) {

        return contacts.stream()
                .filter(person ->
                        person.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // UC10 - Count by City
    public long countByCity(String city) {

        return contacts.stream()
                .filter(person ->
                        person.city.equalsIgnoreCase(city))
                .count();
    }

    // UC10 - Count by State
    public long countByState(String state) {

        return contacts.stream()
                .filter(person ->
                        person.state.equalsIgnoreCase(state))
                .count();
    }

    // UC11 - Sort by Name
    public void sortByName() {

        contacts.stream()
                .sorted(Comparator.comparing(
                        person -> person.firstName))
                .forEach(System.out::println);
    }

    // UC12 - Sort by City
    public void sortByCity() {

        contacts.stream()
                .sorted(Comparator.comparing(
                        person -> person.city))
                .forEach(System.out::println);
    }

    // UC12 - Sort by State
    public void sortByState() {

        contacts.stream()
                .sorted(Comparator.comparing(
                        person -> person.state))
                .forEach(System.out::println);
    }

    // UC12 - Sort by Zip
    public void sortByZip() {

        contacts.stream()
                .sorted(Comparator.comparing(
                        person -> person.zip))
                .forEach(System.out::println);
    }
}
