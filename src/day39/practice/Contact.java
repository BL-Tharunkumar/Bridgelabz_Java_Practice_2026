package day39.practice;

public class Contact {

    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;

    public Contact() {}

    public Contact(int id,
                   String firstName,
                   String lastName,
                   String city,
                   String state,
                   String zip) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
