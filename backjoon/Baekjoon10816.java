package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String[] inputNumber = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String i:inputNumber){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int num2 = Integer.parseInt(br.readLine());

        String[] findNumber = br.readLine().split(" ");

        for(String i:findNumber){
            bw.write(map.getOrDefault(i, 0)+" ");
        }
        bw.flush();
    }
}
