package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        String[] repeatInput = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            int repeat = sc.nextInt();
            String input = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.toCharArray().length; j++) {
                String character = "";
                character = String.valueOf(input.charAt(j));
                String repeatChar = character.repeat(repeat);
                sb.append(repeatChar);
            }
            repeatInput[i] = String.valueOf(sb);
        }
        Arrays.stream(repeatInput).forEach((i) -> System.out.println(i));
    }
}
