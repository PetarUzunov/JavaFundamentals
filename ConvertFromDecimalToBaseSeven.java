package com.company;

import java.util.Scanner;

public class ConvertFromDecimalToBaseSeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int baseToConvertTo = 7;

        System.out.println(Integer.toString(n, baseToConvertTo));

    }
}
