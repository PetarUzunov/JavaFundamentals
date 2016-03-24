package com.company;

import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double resultFOne = Math.pow((Math.pow(a,2) + Math.pow(b,2))/
                (Math.pow(a,2) - Math.pow(b,2)), ((a + b +c )/ Math.sqrt(c)));

        double resultFTwo = Math.pow(Math.pow(a,2) + Math.pow(b,2) - Math.pow(c, 3), (a-b));

        double difference = Math.abs((a + b + c)/3 - (resultFOne + resultFTwo)/2);

                System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                resultFOne, resultFTwo, difference);
    }
}
