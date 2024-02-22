package matrixTest;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
        int numberOfStudent2 = sc.nextInt();

        int[] scores = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int avg = 0;
        int avg2 = 0;

        int max = 0;
        int max2 = 0;

        for (int i = 0; i < scores.length; i++) {
            //System.out.println("점수는? : ");
            scores[i] = (int)(Math.random()*100);
            avg += scores[i];

            scores2[i] = (int)(Math.random()*100);
            avg2 += scores2[i];

            if(scores[i] > max){
                max = scores[i];
            }
            if(scores2[i] > max){
                max2 = scores2[i];
            }
        }
        avg = avg/scores.length;
        avg2 = avg2/scores2.length;

        System.out.println("1반의 평균 점수: " + avg + "이다.");
        System.out.println("2반의 평균 점수: " + avg2 + "이다.");

        System.out.println("1반의 최고점은 "+max+"이다.");
        System.out.println("2반의 최고점은 "+max2+"이다.");

    }

}

