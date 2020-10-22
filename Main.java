package com.company;
import java.lang.Math.*;
import java.util.Arrays;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        // write your code here
        double[] a = new double[10];
        for (int i = 0; i < 10; i++)
        {
            a[i] = Math.round(Math.random()*100.0);
        }

        double[] temp = new double[10];

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                temp[i] = a[i];
            } else {
                temp[i] = -a[i];
            }
        }


        //CHECKING TO MAKE SURE THE TWO ARE IDENTICAL
        //WITH ALT NEGATIVE SIGNS

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(temp));

        double fin = 0;
        for (int i = 0; i < temp.length; i++)
        {
            fin = fin + temp[i];
        }
        System.out.println((int)fin);

    }


}
