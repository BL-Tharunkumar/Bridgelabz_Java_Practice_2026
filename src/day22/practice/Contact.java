package day22.practice;

public class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Contact(String firstName, String lastName,
                   String address, String city,
                   String state, String zip,
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

    @Override
    public String toString() {

        return firstName + " " + lastName +
                " | " + city +
                " | " + state +
                " | " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {

        Contact person = (Contact) obj;

        return this.firstName.equals(person.firstName) &&
                this.lastName.equals(person.lastName);
    }
}