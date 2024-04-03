package backjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Backjoon11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int k = sc.nextInt();
        List num = new ArrayList();

        for (int i = 0; i < testCase; i++) {
            num.add(i, i + 1);
        }

        int j = 0;
        System.out.printf("<");

        while (num.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                j += 1;
                j = (num.size()-1 < j) ? 0 : j;
            }
            System.out.printf(num.get(j)+", ");
            num.remove(j);
            j = (num.size() == j) ? 0 : j;
        }
        System.out.printf(num.get(0)+">");
    }
}
