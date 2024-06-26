package backjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        int[] input = new int[testCase];


        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);

        for(int a:input){
            bw.write(a+"\n");
        }
        bw.flush();
    }
}
