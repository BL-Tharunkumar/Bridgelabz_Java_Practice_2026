package day24.practice;

public class Contact {

    String firstName;
    String lastName;
    String city;
    String state;
    String zip;

    public Contact(String firstName, String lastName,
                   String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Contact))
            return false;

        Contact person = (Contact) obj;

        return firstName.equals(person.firstName)
                && lastName.equals(person.lastName);
    }

    @Override
    public String toString() {

        return firstName + " " + lastName +
                " | " + city +
                " | " + state +
                " | " + zip;
    }
}
