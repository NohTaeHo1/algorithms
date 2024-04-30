package backjoon;

import java.util.Scanner;

public class Baekjoon1436 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int input = sc.nextInt();
                int j = 0;

        for(int i=0;i<input;i++){
            while(true){
                j++;
                if(String.valueOf(j).contains("666")){
                    answer = j;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
