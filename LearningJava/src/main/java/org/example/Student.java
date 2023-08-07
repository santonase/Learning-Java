package org.example;

public final class Student extends User {

    int yearOfStudy;
    int groupNumber;

    public Student(String name, String surname, int yearOfStudy, int groupNumber) {
        super(name, surname);
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }

    String mail(String message) {
        return "Student: " + super.getName() + ": " + message;
    }

    @Override
    public void mail() {
        System.out.println("Hello, World");
    }

    @Override
    public String getSurname() {
        return super.getSurname().charAt(0) + ".";
    }
}
