package fanur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main mn = new Main();
    System.out.println(sum2d(new String[][]{{"1", "a", "3"}, {"1", "2", "3"}}));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val;
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }

}