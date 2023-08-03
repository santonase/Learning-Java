package org.example;

public class Student extends User {

    int yearOfStudy;
    int groupNumber;

    public Student(String name, String surname, int yearOfStudy, int groupNumber) {
        super(name, surname);
        this.yearOfStudy = yearOfStudy;
        this.groupNumber = groupNumber;
    }
}
