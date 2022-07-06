package com.malyschewa.lesson6;
/*
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
 */

import java.util.Random;

public class HomeworkTask17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomIntegers = new int[8];
        int maxNum = 0;
        int minNum = 0;
        int sum = 0;
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = rand.nextInt(9) + 1;
            System.out.println(randomIntegers[i]);
            if (randomIntegers[i] < randomIntegers[minNum])
                minNum = i;
            if (randomIntegers[i] > randomIntegers[maxNum])
                maxNum = i;
        }
        if(minNum < maxNum){
            for(int i = minNum + 1; i < maxNum; i++)
                sum += randomIntegers[i];
        } else{
            for(int i = maxNum + 1; i < minNum; i++)
                sum += randomIntegers[i];
        }
        System.out.println("Maximum mark is " + randomIntegers[maxNum] + " and it's number is " + (maxNum +1));
        System.out.println("Minimum mark is " + randomIntegers[minNum] + " and it's number is " + (minNum +1));
        System.out.println("Sum of the numbers placed between min and max values is " + sum);
    }
}