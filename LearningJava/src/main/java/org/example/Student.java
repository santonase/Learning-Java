package org.example;

public class Student extends Professor {
    String name;
    String surname;
    int yearOfStudy;
    int groupNumber;

    public Student(String name, String surname, int experience, int yearOfStudy, int groupNumber) {
        super(name, surname, experience);
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }

    //    @Override
    String mail(String message) {

        return super.mail(message);
    }
}
