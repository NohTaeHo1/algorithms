package backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Baekjoon11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        int[][] arr = new int[testCase][2];

        for(int i=0;i<testCase;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt((a->a[1])));
        Arrays.sort(arr, Comparator.comparingInt((a->a[0])));

        for (int[] point : arr) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
