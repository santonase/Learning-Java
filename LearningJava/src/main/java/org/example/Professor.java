package org.example;

public class Professor extends User {

    private int experience;

    Professor(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
    }
}

