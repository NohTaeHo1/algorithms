import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("ID: ");
        String ID = scanner.next();

        System.out.printf("비번: ");
        String PW = scanner.next();

        System.out.printf("비번확인: ");
        String PW2 = scanner.next();

        System.out.printf("이름: ");
        String name = scanner.next();

        System.out.printf("주민번호: ");
        String SN = scanner.next();

        System.out.printf("전화번호: ");
        String PN = scanner.next();

        System.out.printf("주소: ");
        String adress = scanner.next();

        System.out.printf("직업: ");
        String job = scanner.next();

        System.out.println("ID: "+ID);
        System.out.println("비번: "+PW);
        System.out.println("비번확인: "+PW2);
        System.out.println("이름: "+name);
        System.out.println("주민번호: "+SN);
        System.out.println("전화번호: "+PN);
        System.out.println("주소: "+adress);
        System.out.println("직업: "+job);













    }
}
