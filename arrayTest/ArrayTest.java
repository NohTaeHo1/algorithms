import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("arr 의 길이: "+arr.length);

        for(int i=0;i<arr.length;i++){

        System.out.println(arr[i]*2);
        }

    }
}