package day27.practice;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // UC13 - Write Contacts to File
    public void writeToFile(String fileName)
            throws IOException {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(fileName));

        for (Contact contact : contacts) {

            writer.write(contact.toString());
            writer.newLine();
        }

        writer.close();

        System.out.println(
                "Contacts written to file successfully.");
    }

    // UC13 - Read Contacts from File
    public void readFromFile(String fileName)
            throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(fileName));

        String line;

        System.out.println(
                "\nContacts Read From File:");

        while ((line = reader.readLine()) != null) {

            System.out.println(line);
        }

        reader.close();
    }
}
