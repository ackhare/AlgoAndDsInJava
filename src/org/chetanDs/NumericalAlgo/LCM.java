package org.chetanDs.NumericalAlgo;


import static org.chetanDs.NumericalAlgo.GCD.findGCD;

/**
 * Created by chetan on 29/8/16.
 */
public class LCM {

    public static void main(String[] args) {


        int a = 72;
        int b = 30;
        System.out.println(findLCM(a, b));
    }
//this is actually a * b divided by7 gcd but for big numbers it was minimized
    static long findLCM(long a, long b) {
       return (a / findGCD(a, b)) * b;

    }
}
