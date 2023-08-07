package org.example;

public abstract class User {
    private String name;
    private String surname;
    static int userCount = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        userCount++;
    }

    public abstract void mail();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    String mail(String message) {
        return name + ": " + message;
    }
}
