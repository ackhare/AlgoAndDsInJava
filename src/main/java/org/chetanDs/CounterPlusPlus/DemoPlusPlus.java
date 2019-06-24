package org.chetanDs.CounterPlusPlus;

public class DemoPlusPlus {
    public static void main(String[] args) {
        int c = 0;
        int t = c++;
        System.out.println(c);//1
        System.out.println(t);//0
        int r = ++c;
        System.out.println(c);//2
        System.out.println(r);//2

        System.out.println(c);//2
    }
}
