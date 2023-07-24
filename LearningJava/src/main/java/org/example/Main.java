package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number 7");
            number = scanner.nextInt();
        } while (number != 7);
        System.out.println("Number is 7 !!!");
    }
}