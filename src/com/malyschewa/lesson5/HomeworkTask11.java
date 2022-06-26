package com.malyschewa.lesson5;

/*
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */
public class HomeworkTask11 {

    public static void main(String args[]) {
        int number;
        boolean isPrime;
        number = 7;
        if (number < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= number / i; i++) {
            if ((number % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Is a prime number");
        else System.out.println("Not a prime number");

    }
}