package org.example;

public non-sealed class Professor extends Employee implements CanTeach {
    private int experience;
    private int msgSent;
    public String department = "computer science";

    Professor(String name, String surname, int experience, AcademicStatus academicStatus) {
        super(name, surname, academicStatus);
        this.experience = experience;
        msgSent = 0;
    }

    @Override
    public void mail() {
        System.out.println("Hello, World");
    }

    @Override
    public String mail(String message) {
        msgSent++;
        return super.mail(message);
    }

    @Override
    public  String mail(String message, String studentSurname) {
        return "Professor " + getName() + " send to " + studentSurname + ": " + message;
    }

    @Override
    public  String mail(double mark, String studentSurname) {
        return "Professor " + getName() + " put the mark to " + studentSurname + ": " + mark;
    }

    public int getMsgSent() {
        return msgSent;
    }
}

