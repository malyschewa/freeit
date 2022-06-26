package com.malyschewa.lesson4;

import java.util.Scanner;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class HomeworkTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:  ");
        int number = scanner.nextInt();
        if (number / 100 >= 1 && number / 100 <10 ) {
            System.out.println("Number "+ number + " is three-digit number");
        } else {
            System.out.println("Number "+ number + " is not three-digit number");
        }
        if (number % 10 == 7 ) {
            System.out.println("Number "+ number + " ends up with 7");
        } else {
            System.out.println("Number "+ number + " is not ends up with 7");
        }
        if (number % 2 == 0) {
            System.out.println("Number "+ number + " is even");
        } else {
            System.out.println("Number "+ number + " is odd");
        }
    }
}
