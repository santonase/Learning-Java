package org.example;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        out.println("Your min number: ");
        int min = scanner.nextInt();
        out.println("Your max number: ");
        int max = scanner.nextInt();
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            int result = r.nextInt(max - min) + min;
            out.println(result);
        }
    }
}
