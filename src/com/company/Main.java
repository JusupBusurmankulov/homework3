package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] java = {-2.7, 5.3, -5.0, 7.3, -9.3, -4.6, 6.2, 1.5, -2.9, 3.4, -9.23, 6.11, -5.9, 4.99, -5.6};
        double sum = 0.0;
        int col = 0;
        boolean isNegative = false;

        for (double value:java) {
            if (value < 0){
                isNegative = true;
            }else if (isNegative){
                sum = sum + value;
                col ++;
            }
        }
        double answer = sum / col;
        System.out.println("Среднее арифметическое число: " + answer);
    }
}