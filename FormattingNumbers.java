package com.company;

import java.util.Locale;
import java.util.Scanner;


public class FormattingNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        String hexA = Integer.toHexString(a).toUpperCase();
        String binA = Integer.toBinaryString(a);

        System.out.printf("|%-10s |%010d| %10.2f| %-10.3f|", hexA, Integer.parseInt(binA), b, c);



    }
}
