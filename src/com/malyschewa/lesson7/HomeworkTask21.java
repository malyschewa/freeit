package com.malyschewa.lesson7;
/*
Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask21 {
    public static void main(String[] args) {
        String pattern = "0x([a-fA-F0-9]{4}|[a-fA-F0-9]{3})";
        String str = "dmsd;ak 0x6GA lsmdk &*( 392430 dsfjsj 0x7FFF wdaws32 0x6DAF";
        Pattern regexp = Pattern.compile(pattern);
        Matcher matcher = regexp.matcher(str);
        int i;
        while(matcher.find()){
            for (i = matcher.start(); i < matcher.end(); i++ ){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
