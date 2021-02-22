/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeme.hackerrank.data_structure.arrays.Array_2d_DS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               int m = splitArray(arr, i, j);
                s.add(m);
            }
        }
        return Collections.max(s);
    }

    static int splitArray(int[][] arr, int si, int sj) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 4 && j < 4 && i == si && j == sj) {
                    int sum = 0;
                    for (int k = si; k < si + 3; k++) {
                        for (int l = sj; l < sj + 3; l++) {
                            if ((k == si) || (k == si + 2)) {
                                sum += arr[k][l];
                            } else if (k == si + 1) {
                                if (l == sj + 1) {
                                    sum += arr[k][l];
                                }
                            }
                        }
                    }
                    return sum;
                }
            }
        }
        return 0;
    }

//    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
//        arr[0][0] = 1;
//        arr[0][1] = 1;
//        arr[0][2] = 1;
//        arr[0][3] = 0;
//        arr[0][4] = 0;
//        arr[0][5] = 0;
//
//        arr[1][0] = 0;
//        arr[1][1] = 1;
//        arr[1][2] = 0;
//        arr[1][3] = 0;
//        arr[1][4] = 0;
//        arr[1][5] = 0;
//
//        arr[2][0] = 1;
//        arr[2][1] = 1;
//        arr[2][2] = 1;
//        arr[2][3] = 0;
//        arr[2][4] = 0;
//        arr[2][5] = 0;
//
//        arr[3][0] = 0;
//        arr[3][1] = 0;
//        arr[3][2] = 2;
//        arr[3][3] = 4;
//        arr[3][4] = 4;
//        arr[3][5] = 0;
//
//        arr[4][0] = 0;
//        arr[4][1] = 0;
//        arr[4][2] = 0;
//        arr[4][3] = 2;
//        arr[4][4] = 0;
//        arr[4][5] = 0;
//
//        arr[5][0] = 0;
//        arr[5][1] = 0;
//        arr[5][2] = 1;
//        arr[5][3] = 2;
//        arr[5][4] = 4;
//        arr[5][5] = 0;
  
        arr[0][0] = -1;
        arr[0][1] = -1;
        arr[0][2] = 0;
        arr[0][3] = -9;
        arr[0][4] = -2;
        arr[0][5] = -2;

        arr[1][0] = -2;
        arr[1][1] = -1;
        arr[1][2] = -6;
        arr[1][3] = -8;
        arr[1][4] = -2;
        arr[1][5] = -5;

        arr[2][0] = -1;
        arr[2][1] = -1;
        arr[2][2] = -1;
        arr[2][3] = -2;
        arr[2][4] = -3;
        arr[2][5] = -4;

        arr[3][0] = -1;
        arr[3][1] = -9;
        arr[3][2] = -2;
        arr[3][3] = -4;
        arr[3][4] = -4;
        arr[3][5] = -5;

        arr[4][0] = -7;
        arr[4][1] = -3;
        arr[4][2] = -3;
        arr[4][3] = -2;
        arr[4][4] = -9;
        arr[4][5] = -9;

        arr[5][0] = -1;
        arr[5][1] = -3;
        arr[5][2] = -1;
        arr[5][3] = -2;
        arr[5][4] = -4;
        arr[5][5] = -5;      
        
//        for (int i = 0; i < arr.length; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("");
        }
        int result = hourglassSum(arr);
        System.out.println("Result = " + result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
