package com.malyschewa.lesson6;

/*
Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

import java.util.Random;

public class HomeworkTask14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomIntegers = new int[8];
        int maxNum = randomIntegers[0];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(9) + 2;
            System.out.println(randomIntegers[i]);

            for (int j : randomIntegers) {
                if (j > maxNum)
                    maxNum = j;
            }
        }
        System.out.println("Maximum number is " + maxNum);
    }
}
