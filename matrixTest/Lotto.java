package matrixTest;

import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lotto = new int[6];

        //lotto[0] = (int) (Math.random() * 45 + 1);

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        int a = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (lotto[i] > lotto[i + 1]) {
                    a = lotto[i];
                    lotto[i] = lotto[i + 1];
                    lotto[i + 1] = a;
                }
            }
        }
        System.out.println("-----------------------------");
        System.out.println("로또 번호");
        System.out.println("-----------------------------");

        for (int i = 0; i < 6; i++) {
            System.out.printf(lotto[i] + " ");
        }
    }
}
