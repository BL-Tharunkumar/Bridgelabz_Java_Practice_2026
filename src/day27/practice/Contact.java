package day27.practice;

public class Contact {

    String firstName;
    String lastName;
    String city;
    String state;
    String zip;

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

    @Override
    public String toString() {

        return firstName + "," +
                lastName + "," +
                city + "," +
                state + "," +
                zip;
    }
}
