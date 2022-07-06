package com.malyschewa.lesson6;

/*
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
 */

import java.util.Random;

public class HomeworkTask16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomIntegers = new int[5];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(9) + 1;
            System.out.print(randomIntegers[i]);
        }
        int n = randomIntegers.length;
        int reverse;
        for (int i = 0; i < n/2; i++) {
            reverse = randomIntegers[n-i-1];
            randomIntegers[n-i-1] = randomIntegers[i];
            randomIntegers[i] = reverse;
            System.out.println();
        }
        for (int i = 0; i < randomIntegers.length; i++) {
            System.out.print(randomIntegers[i]);
        }
    }
}


