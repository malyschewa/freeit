package com.malyschewa.lesson2;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numbOne = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int numbTwo = scanner.nextInt();

        String result = numbOne > numbTwo ? "Первое число больше второго" : "Первое число меньше второго";
        System.out.println(result);
    }
}
