package com.malyschewa.lesson4;

import java.util.Scanner;

/*
Написать программу, в которой в консоль будет выводится название месяца и сезон,
к которму этот месяц относится (написать с помощью  if  и с помощью switch)
 */

public class HomeworkTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerical expression  of the month:  ");
        int n = scanner.nextInt();
        if (n == 12) {
            System.out.println("December");
        } else if (n == 1) {
            System.out.println("January");
        } else if (n == 2) {
            System.out.println("February");
        } else if (n == 3) {
            System.out.println("March");
        } else if (n == 4) {
            System.out.println("April");
        } else if (n == 5) {
            System.out.println("May");
        } else if (n == 6) {
            System.out.println("June");
        } else if (n == 7) {
            System.out.println("July");
        } else if (n == 8) {
            System.out.println("August");
        } else if (n == 9) {
            System.out.println("September");
        } else if (n == 10) {
            System.out.println("October");
        } else if (n == 11) {
            System.out.println("November");
        } else {
            System.out.println("There is no month with such numerical expression");
        }
        switch (n) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }
    }

