package org.example;

public class Professor extends User {
    private int experience;
    private int msgSent;
    public String department = "computer science";

    Professor(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;
        msgSent = 0;
    }

    @Override
    public String mail(String message) {
        msgSent++;
        return super.mail(message);
    }

    public  String mail(String message, String studentSurname) {
        return "Professor " + getName() + " send to " + studentSurname + ": " + message;
    }

    public  String mail(double mark, String studentSurname) {
        return "Professor " + getName() + " put the mark to " + studentSurname + ": " + mark;
    }

    public int getMsgSent() {
        return msgSent;
    }
}

