package com.malyschewa.lesson7;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTask22 {
    public static void main(String[] args) {
        String str="0x7FFF <p id=\"p1\"> 0x7AAF <p id=p1> <d = div> kkkk  khg < > gkhjg";
        Pattern p=Pattern.compile("<.+?>");
        Matcher m=p.matcher(str);
        while(m.find()){
            String tag = m.group();
            int spaceIndex = tag.indexOf(" ");
            String tagName = tag.substring(1, spaceIndex);
            str = str.replace(tag, "<" + tagName + ">");
        }
        System.out.println(str);



    }
}
