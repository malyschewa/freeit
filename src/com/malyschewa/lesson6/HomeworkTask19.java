package com.malyschewa.lesson6;

/*
Написать частотный словарь - посчитать сколько раз каждое слово встречается в предложении и вывести результат в консоль
 */

public class HomeworkTask19 {
    public static void main(String[] args) {
        String s = "When the going gets tough , the tough get going";
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
    }
