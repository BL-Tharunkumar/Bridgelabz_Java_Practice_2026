package day39.practice;

public class AddressBookRESTMain {

    public static void main(String[] args) {

        AddressBookRESTService service =
                new AddressBookRESTService();

        Contact contact =
                new Contact(
                        1,
                        "Tharun",
                        "Kumar",
                        "Chennai",
                        "Tamil Nadu",
                        "600001");

        // Add
        service.addContact(contact);

        // Get
        service.getContacts()
                .forEach(c ->
                        System.out.println(
                                c.getFirstName()));

        // Delete
        service.deleteContact(1);
    }
}
