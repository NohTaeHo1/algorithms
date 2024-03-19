package backjoon;

import java.util.Scanner;

public class Baekjoon5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();

        int rest = 1000 - pay;
        int countBills = 0;

        if (rest >= 500) {
            rest -= 500;
            countBills += 1;
        }

        for (int i = 0; i < 4; i++) {
            if (rest >= 100) {
                rest -= 100;
                countBills += 1;
            }
        }

        if (rest >= 50) {
            rest -= 50;
            countBills += 1;
        }

        for (int i = 0; i < 4; i++) {
            if (rest >= 10) {
                rest -= 10;
                countBills += 1;
            }
        }


        for (int i = 0; i < 9; i++) {
            if (rest >= 5) {
                rest -= 5;
                countBills += 1;
            }

        }

        for (int i = 0; i < 5; i++) {
            if (rest >= 1) {
                rest -= 1;
                countBills += 1;
            }
        }
        System.out.println(countBills);
    }
}
