package com.company;

import java.util.Scanner;

public class GetFirstOddOrEvenElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        input = sc.nextLine();
        String[] command = input.split(" ");
        evenOrOdd(command[2], Integer.parseInt(command[1]), intArr);
    }

    public static void evenOrOdd(String str, int count, int[] array) {
        int counter = 1;
        if (str.equals("even")) {

            for (int i = 0; i < array.length; i++) {

                if ((array[i] % 2 == 0) && counter <= count) {

                    System.out.print(array[i] + " ");
                    counter++;
                }
            }
        }
        if (str.equals("odd")) {

            for (int i = 0; i < array.length; i++) {

                if ((array[i] % 2 != 0) && counter <= count) {

                    System.out.print(array[i] + " ");
                    counter++;
                }
            }
        }
    }
}
