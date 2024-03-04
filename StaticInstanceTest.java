
public class StaticInstanceTest {
    static int sta = 3;
    int ins = 1;

    public static void main(String[] args) {

        StaticInstanceTest si = new StaticInstanceTest();

        System.out.println(sta);
        System.out.println(si.ins); //<- 인스턴스 변수는 스태틱 메서드에 참조될 수 없다는 오류. import로 해결
        //print.print2();
        //System.out.println(sta);
        //System.out.println(si.ins);
    }
}
class print {
    public static void print2() {
        StaticInstanceTest si = new StaticInstanceTest();
        System.out.println(si.sta);
        System.out.println(si.ins);
        si.sta = 11;
        si.ins = 13;
    }
}

class print2 extends StaticInstanceTest{
    public static void print2() {
        StaticInstanceTest si = new StaticInstanceTest();
        System.out.println(si.sta);
        System.out.println(si.ins);
        si.sta = 21;
        si.ins = 23;
    }

}

