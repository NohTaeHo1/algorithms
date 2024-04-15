package backjoon;

import java.io.*;
import java.util.Arrays;

public class Baekjoon13251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double color = Integer.parseInt(br.readLine());
        String N = br.readLine();
        int[] each = Arrays.stream(N.split(" ")).mapToInt(Integer::parseInt).toArray();

        double pick = Integer.parseInt(br.readLine());

        double total = 0;

        for (int i : each) {
            total += i;
        }

        double probability = 0;

        for (int j : each) {
            int i = 0;
            double subProbability = 1;
            while (i < pick) {
                subProbability *= (j - i) / (total - i);
                i++;
            }
            probability += subProbability;
        }

        bw.write(String.valueOf(probability));

        bw.flush();

    }
}
