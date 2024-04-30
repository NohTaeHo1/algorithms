package backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        Map<Integer, int[]> map = new HashMap<>();

        map.put(0, new int[]{1, 0});
        map.put(1, new int[]{0, 1});

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
            int[] ans = new int[2];

            ans = fibonacci(input, map);

            System.out.println(ans[0]+" "+ans[1]);
        }
    }

    public static int[] fibonacci(int n, Map<Integer, int[]> map) {
        if (map.size() - 1 > n) {
            return map.get(n);
        }
        if (n == 0) {
            return map.get(0);
        } else if (n == 1) {
            return map.get(1);
        } else {
            for (int i = 2; i <= n; i++) {
                int[] a = map.get(i - 2);
                int[] b = map.get(i - 1);
                int[] c = {a[0] + b[0], a[1] + b[1]};
                map.put(i, c);
            }
            return map.get(n);
        }
    }
}
