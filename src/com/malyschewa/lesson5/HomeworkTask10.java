package com.malyschewa.lesson5;

/*
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class HomeworkTask10 {
    public static void main(String args[]) {
        long fact = 1;
        int i, number;
        for (number = 10; number <= 15; number++) {
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + number + " is " + fact);
            fact = 1;
        }
    }
}