package com.robinsm.interview;

import java.io.Serializable;

/**
 * The Person model.
 *
 * @author montez.robinson robinsm@live.com
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The Email.
     */
    final String email;

    /**
     * The First name.
     */
    final String firstName;

    /**
     * The Last name.
     */
    final String lastName;

    /**
     * Instantiates a new Person.
     *
     * @param email the email
     * @param firstName the first name
     * @param lastName the last name
     */
    public Person(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
}
