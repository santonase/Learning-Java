package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 7) {
            System.out.println("Enter number 7 again");
            number = scanner.nextInt();
        }
        System.out.println("Number is 7 !!!");
    }
}