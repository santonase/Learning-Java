package org.example;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Professor professorAlex = new Professor("Alex", "Professor", 10);
        out.println(professorAlex.mail("You have to learn"));

        Student studentNick = new Student("Nick", "Lee", 1, 2);
        out.println(studentNick.mail("I'm learning"));

        professorAlex.setSurname("AAAlexxx");
        out.println(professorAlex.getSurname());

        out.println(professorAlex.mail("Hello, how are you?", studentNick.getSurname()));
        out.println(professorAlex.mail(5, studentNick.getSurname()));
            }
        }



