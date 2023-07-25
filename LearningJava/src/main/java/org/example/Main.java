package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //lesson 10 - hw

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(in);
        while(true) {
            out.println("Enter something: ");
            String result = scanner.nextLine();
            if(result.equalsIgnoreCase("stop") || result.equals(""))
                break;
        }


    }
}

