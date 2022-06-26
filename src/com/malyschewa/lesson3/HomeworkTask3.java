package com.malyschewa.lesson3;

import java.util.Scanner;

/*        Определить число, полученное выписыванием в обратном порядке цифр
        любого 4-х значного натурального числа n.
*/

public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четыре цифры: ");
        int value = scanner.nextInt();
        int numbOne = value % 10;
        int numbTwo = (value - numbOne)/10 % 10;
        int numbThree = (((value - numbOne)/10 - numbTwo) % 100)/10;
        int numbFour = value /1000;
        System.out.print(numbOne);
        System.out.print(numbTwo);
        System.out.print(numbThree);
        System.out.print(numbFour);
    }
}
