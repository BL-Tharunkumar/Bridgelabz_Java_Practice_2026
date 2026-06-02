package day27.practice;

public class AddressBookMain {

    public static void main(String[] args)
            throws Exception {

        System.out.println(
                "Welcome to Address Book Program");

        AddressBook addressBook =
                new AddressBook();

        addressBook.addContact(
                new Contact(
                        "Tharun",
                        "Kumar",
                        "Chennai",
                        "Tamil Nadu",
                        "600001"));

        addressBook.addContact(
                new Contact(
                        "Ajay",
                        "Kumar",
                        "Trichy",
                        "Tamil Nadu",
                        "620001"));

        // Write Contacts
        addressBook.writeToFile(
                "AddressBook.txt");

        // Read Contacts
        addressBook.readFromFile(
                "AddressBook.txt");
    }
}
