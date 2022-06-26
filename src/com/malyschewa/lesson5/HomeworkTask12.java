package com.malyschewa.lesson5;

/*
Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class HomeworkTask12 {
    public static void main(String args[]) {
        int sum = 0;
        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the first 100 whole numbers that are divided by 3 " + sum);
    }
}
