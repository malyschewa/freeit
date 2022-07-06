package com.malyschewa.lesson6;

/*
Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
*/

import java.util.Random;

public class HomeworkTask15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomIntegers = new int[8];
        int maxNum = 0;
        int minNum = 0;
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(9) + 1;
            System.out.println(randomIntegers[i]);
            if (randomIntegers[i] < randomIntegers[minNum])
                minNum = i;
            if (randomIntegers[i] > randomIntegers[maxNum])
                maxNum = i;
        }

        System.out.println("Maximum mark is " + randomIntegers[maxNum] + " and it's number is " + (maxNum +1));
        System.out.println("Minimum mark is " + randomIntegers[minNum] + " and it's number is " + (minNum +1));
    }
}
