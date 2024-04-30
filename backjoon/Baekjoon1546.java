package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjectNumber = sc.nextInt();

        double[] score = new double[subjectNumber];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        double max = Arrays.stream(score).max().getAsDouble();

        int j = 0;
        for (double i : score) {
            score[j] = i / max * 100;
            j++;
        }
        System.out.println(Arrays.stream(score).average().getAsDouble());
    }
}
