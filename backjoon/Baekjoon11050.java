package backjoon;

import java.util.Scanner;

public class Baekjoon11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] fValue = new int[3];
        fValue[0] = n;
        fValue[1] = k;
        fValue[2] = n - k;

        int[] x = new int[3];
        int j = 0;

        for (int a : fValue) {
            int y = 1;
            for (int i = a; i > 1; i--) {
                y *= i;
            }
            x[j] = y;
            j++;
        }
        System.out.println(x[0] / (x[1] * x[2]));
    }
}
