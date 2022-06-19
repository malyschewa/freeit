package com.malyschewa.lesson2;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double numbOne = scanner.nextDouble();

        System.out.print("Enter first number: ");
        double numbTwo = scanner.nextDouble();

        String result = numbOne > numbTwo ? "First number is greater than second" : "First number is less than second";
        System.out.println(result);
    }
}

