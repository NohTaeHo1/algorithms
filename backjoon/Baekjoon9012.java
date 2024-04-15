//package backjoon;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Baekjoon9012 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int testCase = sc.nextInt();
//
//        String[] ans = new String[testCase];
//
//
//        for (int k = 0; k < testCase; k++) {
//
//
//            String input = sc.next();
//            char[] charInput = input.toCharArray();
//
//            int j = 0;
//            while (j < (charInput.length) / 2) {
//                for (int i = 0; i < charInput.length; i++) {
//                    if (charInput[i] == '{' && charInput[i + 1] == '}') {
//                        charInput[i] = 'a';
//                        charInput[i + 1] = 'a';
//                    }
//                }
//                j++;
//            }
//
//            for (int i = 0; i < charInput.length; i++) {
//                if (charInput[i] == '{' || charInput[i] == '}') {
//                    ans
//                    System.out.println("YES");
//                    break;
//                } else if (i == charInput.length-1) {
//                    System.out.println("NO");
//                    break;
//                }
//            }
//        }
//    }
//}
