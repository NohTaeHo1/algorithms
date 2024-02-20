package mamberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        MemberModel mm = new MemberModel();
        System.out.printf("ID: ");
        mm.setUserName(sc.next());

        System.out.printf("비번: ");
        mm.setPassword(sc.next());

        System.out.printf("비번확인: ");
        mm.setPassword2(sc.next());

        System.out.printf("이름: ");
        mm.setName(sc.next());

        System.out.printf("주민번호: ");
        mm.setRegisNumber(sc.nextInt());

        System.out.printf("전화번호: ");
        mm.setPhoneNumber(sc.nextInt());

        System.out.printf("주소: ");
        mm.setAddress(sc.next());

        System.out.printf("직업: ");
        mm.setJob(sc.next());

        System.out.println("ID: "+mm.getUserName());
        System.out.println("비번: "+mm.getPassword());
        System.out.println("비번확인: "+mm.getPassword2());
        System.out.println("이름: "+mm.getName());
        System.out.println("주민번호: "+mm.getRegisNumber());
        System.out.println("전화번호: "+mm.getPhoneNumber());
        System.out.println("주소: "+mm.getAddress());
        System.out.println("직업: "+mm.getJob());

    }
}
