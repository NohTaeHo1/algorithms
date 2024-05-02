//package backjoon;
//
//import java.io.*;
//import java.util.*;
//
//public class Baekjoon1874 {
//        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//    public static void main(String[] args) throws IOException {
//
//        Queue<Integer> stack = new ArrayDeque<>();
//        int N = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[N];
//        for (int i = 1; i <= N; i++) {
//            arr[i] = i;
//        }
//
//        for(){
//            int input = Integer.parseInt(br.readLine());
//        }
//
//
//
//    }
//
//    public static void first(int[] arr, Queue<Integer> stack, int input) throws IOException {
//
//        for(int i =0;i<arr.length;i++) {
//            if (stack.peek() != input) {
//                stack.add(arr[i]);
//                arr[i] = 0;
//                bw.write("+\n");
//            } else {
//                stack.remove();
//                bw.write("-");
//                break;
//            }
//            if(i==arr.length-1){
//                System.out.println("NO");
//                return;
//            }
//
//        }
//    }
//
//    public static void Bignumber(int[] arr, Queue<Integer> stack) throws IOException {
//        int index = findIndex(arr);
//        if(index==200000){
//            System.out.println("NO");
//            return
//        }
//        stack.add(arr[index]);
//        bw.write("+\n");
//
//        return 200000;
//    }
//
//    public static int findIndex(int[] arr) {
//        int ans = 200000;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                ans = i;
//                break;
//            }
//        }
//        return ans;
//    }
//}
//
//
//
//
