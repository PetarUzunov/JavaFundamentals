package com.company;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();

        System.out.println(resultSum(firstStr, secondStr));
    }
    private static int resultSum(String srtOne, String strTwo) {

        int sum = 0;

        if (srtOne.length() == strTwo.length()) {

            for (int i = 0; i < srtOne.length(); i++) {
                sum += srtOne.charAt(i) * strTwo.charAt(i);
            }

        } else if (srtOne.length() > strTwo.length()) {

            for (int i = 0; i < strTwo.length(); i++) {
                sum += srtOne.charAt(i) * strTwo.charAt(i);
            }

            for (int i = strTwo.length(); i < srtOne.length(); i++) {
                sum += srtOne.charAt(i);
            }

        } else if (srtOne.length() < strTwo.length()) {

            for (int i = 0; i < srtOne.length(); i++) {
                sum += srtOne.charAt(i) * strTwo.charAt(i);
            }

            for (int i = srtOne.length(); i < strTwo.length(); i++) {
                sum += strTwo.charAt(i);
            }
        }
        return sum;
    }
}


