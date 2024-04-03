package backjoon;

import java.io.*;

public class Baekjoon1552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            String[] numbers = input.split(" ");
            int sum = Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
            bw.write(sum + "\n");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
