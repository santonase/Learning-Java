package org.example;

public class Professor {

    private String name;
    private String surname;
    private int experience;

    Professor(String name, String surname, int experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    String mail(String message) {
        return "My name: " + surname + " " + name + " and I work " + experience + " years. I always say my students: " + message;
        }

        public String getSurname() {
        return surname;
        }

        public void setSurname(String surname) {
        this.surname = surname;
        }
    }

