package backjoon;

import java.util.Scanner;

public class Baekjoon31712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] damage = new int[3][2];
        for(int i=0;i<3;i++){
            damage[i][0] = sc.nextInt();
            damage[i][1] = sc.nextInt();
        }

        int hp = sc.nextInt();

        int j = 0;
        for(int i = 0; hp>0;i++){
            hp = (j%damage[0][0]==0)? hp-damage[0][1]: hp;
            hp = (j%damage[1][0]==0)? hp-damage[1][1]: hp;
            hp = (j%damage[2][0]==0)? hp-damage[2][1]: hp;
            j++;
        }
        System.out.println(j-1);
    }
}