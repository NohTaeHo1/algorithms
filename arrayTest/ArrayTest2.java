import java.util.Scanner;

public class ArrayTest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시험에 응시한 학생수는 몇명입니까?");

        String stu = sc.next();
        int stu1 = Integer.parseInt(stu);

        int[] arr = new int[stu1];
        String[] name = new String[stu1];


        System.out.println("입력된 점수 중에서 1등 점수를 구하시오");

        int max = 0;
        String name2 = "";

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "번째 학생의 이름을 입력하시오");
            name[i] = sc.next();

            System.out.print(i + 1 + "번째 학생의 점수를 입력하시오: ");
            arr[i] = Integer.parseInt(sc.next());

            if (arr[i] > max) {
                max = arr[i];
                name2 = name[i];
            }
        }

        System.out.println("응시생 중에 1등 이름 : " + name2 + ", 점수 : " + max + "이다");

    }
}

