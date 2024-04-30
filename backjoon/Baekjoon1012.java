//package backjoon;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Baekjoon1012 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        int testCase = sc.nextInt();
//
//        boolean[][] cabbages = new boolean[1][1];
//
//        for (int i = 0; i < testCase; i++) {
//
//            int rows = sc.nextInt();
//            int columns = sc.nextInt();
//            int cabbagesNumber = sc.nextInt();
//
//            for (int j = 0; j < cabbagesNumber; j++) {
//                cabbages[sc.nextInt()][sc.nextInt()] = true;
//            }
//
//            for (int j = 0; j < rows; j++) {
//                for (int k = 0; k < columns; k++) {
//                    if (cabbages[j][k] = true) {
//                        pickingCabbage(cabbages[j][k]);
//
//                    } ;
//                }
//            }
//        }
//    }
//    public static void pickingCabbage(boolean[][] cabbages, int j, int k, int rows, int columns){
//        if(j+1=rows && k+1=columns){
//
//        }else if(j>rows&&k){
//
//        }
//
//        cabbages[j][k] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j+1][k] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j-1][k] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j][k+1] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j][k-1] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j-1][k-1] = (cabbages[j][k] == true) ? false:true;
//        cabbages[j+1][k+1] = (cabbages[j][k] == true) ? false:true;
//
//
//    }
//}
