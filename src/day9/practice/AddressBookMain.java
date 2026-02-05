package day9.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {

    // ContactPerson class
    static class ContactPerson {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        public ContactPerson(String firstName, String lastName, String address,
                             String city, String state, String zip,
                             String phoneNumber, String email) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void updateDetails(String address, String city, String state,
                                  String zip, String phoneNumber, String email) {
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public void displayContact() {
            System.out.println("\nContact Details:");
            System.out.println("Name    : " + firstName + " " + lastName);
            System.out.println("Address : " + address);
            System.out.println("City    : " + city);
            System.out.println("State   : " + state);
            System.out.println("Zip     : " + zip);
            System.out.println("Phone   : " + phoneNumber);
            System.out.println("Email   : " + email);
        }
    }

    // AddressBook class
    static class AddressBook {
        private ArrayList<ContactPerson> contacts = new ArrayList<>();

        public void addContact(ContactPerson person) {
            contacts.add(person);
            System.out.println("\nContact added successfully!");
        }

        public void editContactByName(String name, Scanner sc) {
            for (ContactPerson person : contacts) {
                if (person.getFirstName().equalsIgnoreCase(name)) {

                    System.out.print("Enter New Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter New City: ");
                    String city = sc.nextLine();

                    System.out.print("Enter New State: ");
                    String state = sc.nextLine();

                    System.out.print("Enter New Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String email = sc.nextLine();

                    person.updateDetails(address, city, state, zip, phone, email);
                    System.out.println("\nContact updated successfully!");
                    return;
                }
            }
            System.out.println("\nContact not found.");
        }

        // DELETE CONTACT BY NAME
        public void deleteContactByName(String name) {
            Iterator<ContactPerson> iterator = contacts.iterator();

            while (iterator.hasNext()) {
                ContactPerson person = iterator.next();
                if (person.getFirstName().equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("\nContact deleted successfully!");
                    return;
                }
            }
            System.out.println("\nContact not found.");
        }

        public void displayAllContacts() {
            if (contacts.isEmpty()) {
                System.out.println("\nAddress Book is empty.");
            }
            for (ContactPerson person : contacts) {
                person.displayContact();
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("START Master Branch");
        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact by Name");
            System.out.println("3. Delete Contact by Name");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter City: ");
                    String city = sc.nextLine();

                    System.out.print("Enter State: ");
                    String state = sc.nextLine();

                    System.out.print("Enter Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    addressBook.addContact(new ContactPerson(
                            firstName, lastName, address, city,
                            state, zip, phone, email
                    ));
                    break;

                case 2:
                    System.out.print("Enter First Name to edit: ");
                    addressBook.editContactByName(sc.nextLine(), sc);
                    break;

                case 3:
                    System.out.print("Enter First Name to delete: ");
                    addressBook.deleteContactByName(sc.nextLine());
                    break;

                case 4:
                    addressBook.displayAllContacts();
                    break;

                case 5:
                    System.out.println("\nExiting Address Book Program...");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
