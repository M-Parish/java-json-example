package mparish;

import java.util.Locale;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String fullName() {
        firstName = firstName.substring(0, 1).toUpperCase(Locale.getDefault()) + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase(Locale.getDefault()) + lastName.substring(1);
        return lastName + ", " + firstName;
    }
}
