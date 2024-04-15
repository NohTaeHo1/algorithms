package backjoon;

import java.io.*;
import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());
        Set<String> input = new HashSet<>();

        for (int i = 0; i < testCase; i++) {
            input.add(br.readLine());
        }

        List<String> inputList = new ArrayList<>(input);

        Collections.sort(inputList);

        for (int j = 0; j < inputList.size() - 1; j++) {
            for (int i = 0; i < inputList.size() - 1; i++) {
                String forward = inputList.get(i);
                String backward = inputList.get(i + 1);

                if (forward.length() > backward.length()) {
                    inputList.set(i, backward);
                    inputList.set(i + 1, forward);
                }
            }
        }
        for (String a : inputList) {
            bw.write(a+"\n");
        }
        bw.flush();

    }
}
