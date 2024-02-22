package kaupOOP;
import mamberOOP.MemberModel;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        //카우프지수 구하는 객체지향으로 프로그램을 작성해 주세요
        Scanner sc = new Scanner(System.in);
        MemberModel person = new MemberModel(Math.floor((Math.random() * 50) + 150),
                (Math.floor(Math.random() * 100) + 30));

        KaupService service = new KaupServiceImpl();

        double bmi = service.createbmi(); // bmi랑 bodymass 순간값->저장 불필요
        String bodyMass = service.createbodyMass();

        System.out.println("이름 : "+person.getName());
        System.out.println("키 : "+person.getHeight());
        System.out.println("체중 : "+person.getWeight());
        System.out.println("bmi : "+bmi);
        System.out.println("Bodymass :"+bodyMass);

    }
}
