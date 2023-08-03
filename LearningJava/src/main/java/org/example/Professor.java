package org.example;

public class Professor extends User {
    private int experience;
    private int msgSent;

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

    public int getMsgSent() {
        return msgSent;
    }
}

