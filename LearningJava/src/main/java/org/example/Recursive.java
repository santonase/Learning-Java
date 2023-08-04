package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Recursive {



    public static void recursive(int n) {
        if(n == 11) {
            return;
        }
        System.out.println(n);
        recursive(n + 1);
    }

    //n = 5
    //5! = 5*4*3*2*1
    //5! = 120

    public static int recursiveFactorial(int n) {
        if (n == 1) return 1;
        return  n * recursiveFactorial(n - 1);
    }

}
