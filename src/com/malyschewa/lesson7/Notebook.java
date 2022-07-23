package com.malyschewa.lesson7;

/*
Создать класс записной книжки, в котором хранятся записи дел. Создать в этом классе метод,
который выводит частотный словарь для определенной записи (запись можно определить по номеру/индексу)
 */

import java.util.Scanner;

public class Notebook {

    static String[] vocab = new String[3];

    public static void notebookFrequency(String s) {
        String[] splited = s.split(" ");
        String unique[] = new String[splited.length];
        int uniqueCount[] = new int[splited.length];
        int i;
        for (int j = 0; j < splited.length; j++) {
            if (j == 0) {
                unique[0] = splited[j];
                uniqueCount[0] = 1;
                continue;
            }
            String current = splited[j];
            boolean alreadyContains = false;
            for (int k = 0; k < j; k++) {
                String currentUnique = unique[k];
                if (current.equals(currentUnique)) {
                    alreadyContains = true;
                    uniqueCount[k] = uniqueCount[k] + 1;
                    break;
                }
            }
            if (alreadyContains) {
                continue;
            }
            for (int k = 0; k < unique.length; k++) {
                if (unique[k] == null) {
                    unique[k] = current;
                    uniqueCount[k] = 1;
                    break;
                }
            }
        }
        for (i = 0; i < unique.length; i++)
            System.out.println(unique[i] + " " + uniqueCount[i]);

    }

    public static void main(String[] args) {
        vocab[0] = "When the going gets tough , the tough get going";
        vocab[1] = "A penny saved is a penny earned.";
        vocab[2] = "He that mischief hatches mischief catches.";
        int i;
        for (i = 0; i < vocab.length; i++) {
            System.out.println(vocab[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number from 1 to 3: ");
        int rowNumber = scanner.nextInt();

        switch (rowNumber) {
            case 1:
                notebookFrequency(vocab[0]);
                break;
            case 2:
                notebookFrequency(vocab[1]);
                break;
            case 3:
                notebookFrequency(vocab[2]);
                break;
        }
    }
}
