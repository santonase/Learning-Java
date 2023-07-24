package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(" Your age: ");
        int age = scanner.nextInt();

        System.out.printf("Name: %s, Age: %d", name, age);

    }
}
