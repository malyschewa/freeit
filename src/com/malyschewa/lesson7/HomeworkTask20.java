package com.malyschewa.lesson7;
/*
Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */

public class HomeworkTask20 {
    public static void main(String[] args) {
        String str = "London is the capital and largest city of England and the United Kingdom with a population of just over nine million.";
        String lastSymbols = "";
        char symbol;
        char symbolPrevious;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '—' || symbol == ' ') {
                symbolPrevious = str.charAt(i - 1);
                lastSymbols = lastSymbols + symbolPrevious;
            }
        }
        System.out.println(lastSymbols);
    }
}
