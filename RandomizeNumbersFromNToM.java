package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int firstNumber = Math.min(n, m);
        int secondNumber = Math.max(n, m);

        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        for (int i = firstNumber; i <= secondNumber; i++){

            numbersList.add(i);
        }

        Collections.shuffle(numbersList);

        for (Integer number: numbersList) {
            System.out.print(number + " ");
        }

    }
}
