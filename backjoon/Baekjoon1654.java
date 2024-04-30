package backjoon;

import java.util.Scanner;

public class Baekjoon1654 {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];

        int sum = 0;

        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i = sum/n;i>0;i--){
                int total = 0;
            for(int j:arr){
                total += j/i;
            }

            if(total>=n){
                System.out.println(i);
                return;
            }
        }
    }
}