package com.malyschewa.lesson5;

/*
Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
При каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold" в зависимости от того,
 как далеко буква пользователя от загаданной
 */

import java.util.Random;
import java.util.Scanner;

public class HomeworkTask13 {
    public static void main(String args[]) {
        Random rand = new Random();
        char randomizedChar = (char) (rand.nextInt(26) + 'a');
        byte byRand = (byte) randomizedChar;
        int del;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter one character: ");
            char enteredChar = scanner.next().charAt(0);
            byte byEntered = (byte) enteredChar;
            del = (byte) byRand - (byte) byEntered;
            if (del == 0) {
                System.out.println("Bingo!");
            } else if ((del >= 1 && del <=5) || (del <= -1 && del >=-5)) {
                System.out.println("hot");
            } else if ((del >= 6 && del <= 12) || (del <= -6 && del >= -12)) {
                System.out.println("warmly");
            } else if ((del >= 13 && del <= 19) || (del <= -13 && del >= -19)) {
                System.out.println("chilly");
            } else if ((del >= 20 && del <= 25) || (del <= -20 && del >= -25)) {
                System.out.println("cold");
            }
        } while (del != 0);
    }
}





