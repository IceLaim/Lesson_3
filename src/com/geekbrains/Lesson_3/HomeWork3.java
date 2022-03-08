package com.geekbrains.Lesson_3;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class HomeWork3 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillMultiArray();
}
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
            arr[i] = 0;
            } else {
            arr[i] = 1;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));
    }
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(arr));
        System.out.println(" ");
    }

    public static void fillMultiArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            int[] innerArr = arr[i];
        for (int j = 0; j < 5; j++) {
            arr[i][arr.length - i - 1] = 1;
            if (i == j) {
                arr[i][j] = 1;
            }
            System.out.print(innerArr[j] + " ");
        }
            System.out.println();
        }
    }
}