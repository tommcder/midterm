package com.company;
import javax.swing.*;
import java.util.Arrays;

public class REVERSE_REVERSE {
    public static void main(String[] args)
    {
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Math.round(Math.random()*100.0);
        }

        double[] temp = new double[10];
        int f = 10;

        for(int i = 0; i<a.length; i++) {
            temp[f-1] = a[i];
            f = f-1;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(temp));
    }
}
