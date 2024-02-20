package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        st.setName(sc.next());
        System.out.println("국어점수 : ");
        st.setKorean(sc.nextInt());
        System.out.println("영어점수 : ");
        st.setEnglish(sc.nextInt());
        System.out.println("수학점수 : ");
        st.setMath(sc.nextInt());
        System.out.println("평균 점수를 구하시오");
        st.createAverage();

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + st.getName());
        System.out.println("국어점수 : " + st.getKorean());
        System.out.println("영어점수 : " + st.getEnglish());
        System.out.println("수학점수 : " + st.getMath());
        System.out.println("평균 점수: " + st.getAverage());
    }
}