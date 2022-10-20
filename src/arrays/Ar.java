package arrays;

import java.util.Arrays;

public class Ar {
    public static void main(String[] args) {
        // store a roll no
        int a = 5;
        // store a student's name
        String name = "John";
        // store multiple roll no.
        int[] rollNo = {1, 4, 7, 8};

        int[][] arr = new int[2][];
        int[][] arr2d = {
                {1, 2}, // 0th index
                {4, 5}, // 1st index
        };

        for (int row = 0; row < arr2d.length; row++) {
            System.out.println(Arrays.toString(arr2d[row]) + " " + "index is " + row);
        }

        for (int row = 0; row < arr2d.length ; row++) {
            // for every column in every row
            for (int col = 0; col < arr2d[row].length; col++) {
//                System.out.println(Arrays.toString(arr2d[col]));
                System.out.println(arr2d[row][col] + " ");
            }
        }
    }
}
