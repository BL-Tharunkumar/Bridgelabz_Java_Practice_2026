package day10.practice;

import java.util.*;

/*
 UC4: Delete a person using person's name
 UC5: Add multiple persons using Collection
 UC6: Multiple Address Books using Dictionary
*/

public class AddressBookMain {

    // Contact Person class
    static class ContactPerson {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        String zip;
        String phone;
        String email;

        ContactPerson(String firstName, String lastName, String address,
                      String city, String state, String zip,
                      String phone, String email) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phone = phone;
            this.email = email;
        }

        void display() {
            System.out.println(firstName + " " + lastName + " | " +
                    phone + " | " + email + " | " + city);
        }
    }

    // AddressBook class
    static class AddressBook {
        ArrayList<ContactPerson> contacts = new ArrayList<>();

        void addContact(ContactPerson person) {
            contacts.add(person);
            System.out.println("Contact added successfully.");
        }

        // UC4: Delete by name
        void deleteContact(String name) {
            Iterator<ContactPerson> iterator = contacts.iterator();
            while (iterator.hasNext()) {
                ContactPerson person = iterator.next();
                if (person.firstName.equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("Contact deleted successfully.");
                    return;
                }
            }
            System.out.println("Contact not found.");
        }

        void displayContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts available.");
            }
            for (ContactPerson p : contacts) {
                p.display();
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("START Master Branch");
        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        // UC6: Dictionary of Address Books
        HashMap<String, AddressBook> addressBookSystem = new HashMap<>();

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // UC6: Add Address Book
                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String bookName = sc.nextLine();

                    if (addressBookSystem.containsKey(bookName)) {
                        System.out.println("Address Book already exists.");
                    } else {
                        addressBookSystem.put(bookName, new AddressBook());
                        System.out.println("Address Book created.");
                    }
                    break;

                // UC5: Add multiple contacts
                case 2:
                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    AddressBook book = addressBookSystem.get(bookName);
                    if (book == null) {
                        System.out.println("Address Book not found.");
                        break;
                    }

                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    book.addContact(new ContactPerson(
                            firstName, lastName, address,
                            city, state, zip, phone, email
                    ));
                    break;

                // UC4: Delete contact
                case 3:
                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    book = addressBookSystem.get(bookName);
                    if (book == null) {
                        System.out.println("Address Book not found.");
                        break;
                    }

                    System.out.print("Enter First Name to delete: ");
                    String name = sc.nextLine();
                    book.deleteContact(name);
                    break;

                case 4:
                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    book = addressBookSystem.get(bookName);
                    if (book == null) {
                        System.out.println("Address Book not found.");
                    } else {
                        book.displayContacts();
                    }
                    break;

                case 5:
                    System.out.println("Exiting Address Book Program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
