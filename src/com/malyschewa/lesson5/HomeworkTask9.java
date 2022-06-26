package com.malyschewa.lesson5;
/*
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение.
 */

public class HomeworkTask9 {
    public static void main(String[] args){
        double averageProduct = 0;
        double product = 0;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
            product += x;
            n ++;
            x = (int)(Math.random()*20);
        }
        if(n != 0){
            averageProduct = product / n;
        } else {
            averageProduct = 0;
        }
        System.out.println("среднее:" + averageProduct);
    }
}
