package com.company;


import java.util.*;
import java.io.*;

class Main {

    public static String VowelSquare(String[] strArr) {
        // code goes here
        int row = strArr.length;
        char[] vow = {'a', 'e', 'o', 'i', 'u'};
        String sen = new String(vow);
        int col = strArr[0].length();
        char[][] arr2D = new char[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                arr2D[r][c] = strArr[r].charAt(c);
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                System.out.print(arr2D[r][c]+"|");
            }
            System.out.println();
        }
        int num = 0;
        String sol = "";
        int baseRow = 0, baseCol = 0;
        while (baseRow < row - 1) {
            while (baseCol < col - 1) {
                for (int r = baseRow; r < (baseRow + 2); r++) {
                    for (int c = baseCol; c < (baseCol + 2); c++) {
                        char cc = arr2D[r][c];
                        if (sen.contains(cc + "")) {
                            num++;
                        }
                    }

                }
                if (num == 4) {
                    sol = baseRow + "-" + baseCol;
                    break;
                } else {
                    num = 0;
                    baseCol++;
                }
            }
            if (num == 4) {
                sol = baseRow + "-" + baseCol;
                break;
            }
            baseCol = 0;
            baseRow++;
        }
        if (num != 4) {
            sol="not found";
        }


        return sol;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(VowelSquare(new String[] {"eeei", "ffgi", "kkmo"}));
    }

}