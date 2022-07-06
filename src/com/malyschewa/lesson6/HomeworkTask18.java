package com.malyschewa.lesson6;
/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */

public class HomeworkTask18 {
    public static void main(String[] args) {
        int[][] butterfly = new int[5][5];
        for (int i = 0; i < butterfly.length/2+1; i++) {
            for (int j = i; j < butterfly[i].length - i; j++) {
                butterfly[i][j] = 1;
                butterfly[butterfly.length - 1- i][j] = 1;
            }
        }
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j] + " ");
            }
            System.out.println();
        }
    }
}

