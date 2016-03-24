package com.company;

import java.util.Scanner;

public class ConvertFormBaseSevenToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int decimalRepresentation = Integer.valueOf(n, 7);

        System.out.println(decimalRepresentation);


    }
}