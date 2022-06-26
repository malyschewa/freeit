package com.malyschewa.lesson3;

/*
Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.
*/

public class HomeworkTask2 {
    public static void main(String[] args) {
        int secondsOverall = 4500;
        int seconds = secondsOverall % 60;
        int minutes = (secondsOverall - seconds) / 60;
        int minutesWithHours = minutes % 60;
        int hours = (minutes - minutesWithHours) / 60;
        int hoursWithDays = hours % 24;
        int days = hours / 24;
        int daysWithWeeks = days % 7;
        int weeks = (days - daysWithWeeks) / 7;

        System.out.println("A)" + minutes + "минут" + seconds + "секунд");
        System.out.println("B)" + hours + "часов" + minutesWithHours + "минут" + seconds + "секунд");
        System.out.println("C)" + days + "дней" + hoursWithDays + "часов" + minutesWithHours + "минут" + seconds + "секунд");
        System.out.println("D)" + weeks + "недель" + daysWithWeeks + "дней" + hoursWithDays + "часов" + minutesWithHours + "минут" + seconds + "секунд");
    }
}
