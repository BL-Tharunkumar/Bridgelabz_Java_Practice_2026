package day28.practice;

public class Contact {

    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;

    public Contact(String firstName,
                   String lastName,
                   String city,
                   String state,
                   String zip) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {

        return firstName + " " + lastName +
                " | " + city +
                " | " + state +
                " | " + zip;
    }
}
