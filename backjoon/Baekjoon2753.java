package backjoon;

import java.util.Scanner;

public class Baekjoon2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(((input%4==0&&input%100!=0)||input%400==0)?1:0);
    }
}
