package com.malyschewa.lesson7;
/*
Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
 */

import java.util.Arrays;

public class HomeworkTask19 {
    public static void main(String[] args) {
        String str = "  London is  the capital and largest city of England and the United Kingdom with a population of just over nine million. ";
        String[] split = str.trim().split(" +");
        System.out.println(Arrays.toString(split));
        int length = split.length;
        System.out.println(length);
    }
}
