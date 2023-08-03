package org.example;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Professor professorAlex = new Professor("Alex", "Professor", 10);
        out.println(professorAlex.mail("You need learn"));

        professorAlex.setSurname("AAAlexxx");
        out.println(professorAlex.getSurname());
            }
        }



