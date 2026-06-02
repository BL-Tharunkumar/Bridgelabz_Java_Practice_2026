package day28.practice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class AddressBookJSON {

    public static void writeToJSON(
            List<Contact> contacts,
            String fileName) throws Exception {

        Gson gson =
                new GsonBuilder()
                        .setPrettyPrinting()
                        .create();

        FileWriter writer =
                new FileWriter(fileName);

        gson.toJson(contacts, writer);

        writer.close();

        System.out.println(
                "Contacts saved to JSON file.");
    }

    public static void readFromJSON(
            String fileName) throws Exception {

        Gson gson = new Gson();

        FileReader reader =
                new FileReader(fileName);

        Type type =
                new TypeToken<List<Contact>>() {
                }.getType();

        List<Contact> contacts =
                gson.fromJson(reader, type);

        System.out.println(
                "\nContacts from JSON:");

        contacts.forEach(System.out::println);

        reader.close();
    }
}
