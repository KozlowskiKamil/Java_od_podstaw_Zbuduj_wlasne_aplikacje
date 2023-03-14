package com.example.basics.data.types;

public class J11_2dArray {
    public static void main(String[] args) {
        String strArr[][] = {  //[2][3] Dwa wiersze i 3 kolumny

                                // Kolumny  0,   1,   2
                                // Indexy   0,   1,   2
                /* Wiersz 1, index 0 */   {"1", "2", "3"},
                /* Wiersz 2, index 1 */   {"4", "5", "6"}
        };
        System.out.println(strArr[1][2]); // 6
        System.out.println(strArr[1][0]); // 4

        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int[numRows][numCols];
    }
}
