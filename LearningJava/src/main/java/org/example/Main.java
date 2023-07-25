package org.example;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //Task-1:
        Scanner scanner = new Scanner(in);
        out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 13) {
            out.println("You have not access");
        } else if (age >= 14 && age <= 17) {
            out.println("You have part access");
        } else {
            out.println("You have full access");
        }

        //TASK-2:
        Scanner scanner1 = new Scanner(in);
        out.println("Enter first number: ");
        double firstNumber = scanner1.nextDouble();
        out.println("Enter second number: ");
        double secondNumber = scanner1.nextDouble();
        out.println("Enter operator");
        char operator = scanner1.next().charAt(0);

        switch (operator) {
            case '+':
            out.println(firstNumber + secondNumber);
            break;

            case '-':
                out.println(firstNumber - secondNumber);
                break;

            case '*':
                out.println(firstNumber * secondNumber);
                break;

            case '/':
                out.println(firstNumber / secondNumber);
                break;

            case '%':
                out.println(firstNumber % secondNumber);
                break;

            default:
                out.println("Error");
        }






    }
}
