package mamberOOP;

import java.util.Scanner;
public class MemberView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ID,비번,비번확인,이름,주민번호,전화번호,주소,직업을 순서대로 적으세요 : ");
        MemberModel mm = new MemberModel(sc.next(), sc.next(), sc.next(),
                sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next());

        System.out.println(mm.toString());
    }
}