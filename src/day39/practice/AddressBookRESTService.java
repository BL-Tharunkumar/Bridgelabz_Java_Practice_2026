package day39.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.Arrays;
import java.util.List;

public class AddressBookRESTService {

    private static final String BASE_URL =
            "http://localhost:3000/contacts";

    // GET
    public List<Contact> getContacts() {

        Contact[] contacts =
                RestAssured.get(BASE_URL)
                        .as(Contact[].class);

        return Arrays.asList(contacts);
    }

    // POST
    public Contact addContact(Contact contact) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(contact)
                .when()
                .post(BASE_URL)
                .then()
                .statusCode(201)
                .extract()
                .as(Contact.class);
    }

    // PUT
    public Contact updateContact(Contact contact) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(contact)
                .when()
                .put(BASE_URL + "/" + contact.getId())
                .then()
                .statusCode(200)
                .extract()
                .as(Contact.class);
    }

    // DELETE
    public void deleteContact(int id) {

        RestAssured.given()
                .when()
                .delete(BASE_URL + "/" + id)
                .then()
                .statusCode(200);
    }
}
