package backjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon1676 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String factorialResult = String.valueOf(factorial(input));

        System.out.println(zero(factorialResult));

    }

    public static BigInteger factorial(int a){
        BigInteger fac = BigInteger.valueOf(1);
        for(int i =a;i>1;i--){
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }

    public static int zero(String a){
        int j=0;
        int i=a.length()-1;
        while(i >= 0 && a.charAt(i) == '0'){
            i--;
            j++;
        }
        return j;
    }
}
