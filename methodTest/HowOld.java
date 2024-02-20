package methodTest;

import java.util.Scanner;

public class HowOld {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int old = inputOld(sc);
        System.out.println("나이는 "+ old);
    }

    static int inputOld(Scanner sc)
    {
        System.out.println("학생 나이 : ");

        return sc.nextInt();
    }
}
