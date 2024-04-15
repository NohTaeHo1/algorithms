package backjoon;

public class Baekjoon1003 {
    public static void main(String[] args) {

    }

    public int fibonacci(int n) {
        if (n == 0) {
            System.out.printf("0");
            return 0;
        } else if (n == 1) {
            System.out.printf("1");
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
