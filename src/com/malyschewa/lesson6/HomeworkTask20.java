package com.malyschewa.lesson6;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTask20 {
    public static void main(String[] args) {
        char[][] table = {{' ', '|', ' ', '|', ' '},
                {'—', '+', '—', '+', '—'},
                {' ', '|', ' ', '|', ' '},
                {'—', '+', '—', '+', '—'},
                {' ', '|', ' ', '|', ' '}};
        printTable(table);
    }

    public static void printTable(char[][] table) {
        boolean play = true;
        boolean crossPlayer = true;
        while (play) {
            for (char[] row : table) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
            if (crossPlayer == true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Select your position by entering number from 1 to 9");
                int positionNumber = scanner.nextInt();

                switch (positionNumber) {
                    case 1:
                        table[0][0] = 'X';
                        break;
                    case 2:
                        table[0][2] = 'X';
                        break;
                    case 3:
                        table[0][4] = 'X';
                        break;
                    case 4:
                        table[2][0] = 'X';
                        break;
                    case 5:
                        table[2][2] = 'X';
                        break;
                    case 6:
                        table[2][4] = 'X';
                        break;
                    case 7:
                        table[4][0] = 'X';
                        break;
                    case 8:
                        table[4][2] = 'X';
                        break;
                    case 9:
                        table[4][4] = 'X';
                        break;
                }
                crossPlayer = false;
            } else {
                Random zeroPlayer = new Random();
                boolean cellFree = true;
                while (cellFree) {
                    int i = zeroPlayer.nextInt(1, 9);
                    switch (i) {
                        case 1: {
                            if (table[0][0] == ' ') {
                                table[0][0] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 2: {
                            if (table[0][2] == ' ') {
                                table[0][2] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 3: {
                            if (table[0][4] == ' ') {
                                table[0][4] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 4: {
                            if (table[2][0] == ' ') {
                                table[2][0] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 5: {
                            if (table[2][2] == ' ') {
                                table[2][2] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 6: {
                            if (table[2][4] == ' ') {
                                table[2][4] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 7: {
                            if (table[4][0] == ' ') {
                                table[4][0] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 8: {
                            if (table[4][2] == ' ') {
                                table[4][2] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                        case 9: {
                            if (table[4][4] == ' ') {
                                table[4][4] = '0';
                                cellFree = false;
                                break;
                            }
                        }
                    }
                }
                System.out.println();
                crossPlayer = true;
            }
            String line = null;
            for (int a = 0; a < 8; a++) {

                switch (a) {
                    case 0:
                        line = "" + table[0][0] + table[0][2] + table[0][4] + "";
                        break;
                    case 1:
                        line = "" + table[2][0] + table[2][2] + table[2][4] + "";
                        break;
                    case 2:
                        line = "" + table[4][0] + table[4][2] + table[4][4] + "";
                        break;
                    case 3:
                        line = "" + table[0][0] + table[2][0] + table[4][0] + "";
                        break;
                    case 4:
                        line = "" + table[0][2] + table[2][2] + table[4][2] + "";
                        break;
                    case 5:
                        line = "" + table[0][4] + table[4][2] + table[4][4] + "";
                        break;
                    case 6:
                        line = "" + table[0][0] + table[2][2] + table[4][4] + "";
                        break;
                    case 7:
                        line = "" + table[0][4] + table[2][2] + table[4][0] + "";
                        break;
                }
                if (line.equals("XXX")) {
                    System.out.println("X is winner");
                    play = false;
                    for (char[] row : table) {
                        for (char c : row) {
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;
                }
                else if (line.equals("000")) {
                    System.out.println("0 is winner");
                    play = false;
                    for (char[] row : table) {
                        for (char c : row) {
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                    break;
                }
            }
        }
    }
}



