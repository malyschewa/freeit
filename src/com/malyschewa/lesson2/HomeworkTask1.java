package com.malyschewa.lesson2;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double numbOne = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double numbTwo = scanner.nextDouble();

        String result = numbOne > numbTwo ? "Первое число больше второго" : "Первое число меньше второго";
        System.out.println(result);
    }
}

