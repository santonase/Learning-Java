package org.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.printf("min random: ");
        int min = scanner.nextInt();

        System.out.printf("Max random: ");
        int max = scanner.nextInt();

        int ran = min +  (int)(Math.random()* max);

        System.out.println(ran);
        out.println(min);
        out.println(max);

        
    }
}
