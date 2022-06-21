package com.malyschewa.lesson4;

import java.util.Scanner;

/*
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class HomeworkTask6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double sideA = sc.nextDouble();
        System.out.println("Enter side b: ");
        double sideB = sc.nextDouble();
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double diagonal = Math.sqrt((sideA*sideA) + (sideB*sideB));
        if (radius >= diagonal/2) {
            System.out.println("Rectangular hole can be completely covered with round cardboard");
        } else {
            System.out.println("Rectangular hole can not be completely covered with round cardboard");
        }
    }
}
