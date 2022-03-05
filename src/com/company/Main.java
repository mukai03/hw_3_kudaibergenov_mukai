package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[] numbers = { 0.5, 5.5, -4.4, 2.0, 4.7, -0.4, -0.7, 0.9, 6.0, -44.4, -11.1, 88.8, 666.6,
        5.7, 6.3 };
        int pog = 0;
        double suv = 0.0;
        boolean chig = false;
        for (double i : numbers) {
            if (i > 0){
                chig = true;
            }
            else if (chig) {
                pog ++;
                suv += i;}
        }
        System.out.println(suv/pog);

    }
}
