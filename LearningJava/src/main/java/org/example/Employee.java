package org.example;

public sealed class Employee extends User permits Professor, Director {
    private AcademicStatus academicStatus;
    public Employee(String name, String surname, AcademicStatus academicStatus) {
        super(name, surname);
        this.academicStatus = academicStatus;
    }

    @Override
    public void mail() {

    }

    public AcademicStatus getAcademicStatus() {
        return academicStatus;
    }

    public void setAcademicStatus(AcademicStatus academicStatus) {
        this.academicStatus = academicStatus;
    }
}
