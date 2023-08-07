package org.example;

public sealed class Employee extends User permits Professor, Director {
    public Employee(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void mail() {

    }
}
