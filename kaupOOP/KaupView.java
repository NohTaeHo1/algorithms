package kaupOOP;
import kaupOOP.Person;
import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {
        //카우프지수 구하는 객체지향으로 프로그램을 작성해 주세요
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.print("이름을 적으세요 : ");

        person.setName(sc.next());

        person.setHeight();
        person.setWeight();

        person.createbmi();
        person.createbodyMass();

        System.out.println("이름 : "+person.getName());
        System.out.println("키 : "+person.getHeight());
        System.out.println("체중 : "+person.getWeight());
        System.out.println("bmi : "+person.getbmi());
        System.out.println("Bodymass :"+person.getBodyMass());

    }
}
