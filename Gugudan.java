import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1~9사이 값을 입력하시오: ");
        int num = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
        }
    }
}
