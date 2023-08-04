package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Recursive {



    public static void fibonachi(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        if (b == 832040) {
           return;
        }
        a = a + b;
        b = b + a;

        fibonachi(a, b);
    }




    public static void recursive(int n) {
        System.out.println(n);
        if(n == 100) {
            return;
        }
        recursive(n + 1);
    }

    public static int recursiveSum(int n) {
        System.out.println(n);
        if(n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }



    //n = 5
    //5! = 5*4*3*2*1
    //5! = 120

    public static int recursiveFactorial(int n) {
        if (n == 1) return 1;
        return  n * recursiveFactorial(n - 1);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(result);
        }
        return result;
    }



}
