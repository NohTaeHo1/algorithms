package matrixTest;

import java.util.Scanner;

public class LottoMatching2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lotto;

        //lotto = createRandomNumber();
        //lotto = avoidDiscomfort(lotto);
        lotto = BuyLotto.writeLotto();
        lotto = arrangement(lotto);

        int[] lottoAnswer;

        lottoAnswer = createRandomNumber();
        lottoAnswer = avoidDiscomfort(lottoAnswer);
        lottoAnswer = arrangement(lottoAnswer);

        int cNumber = sameNumber(lotto, lottoAnswer);

        System.out.printf("\n구매 로또 번호와 추첨 로또 번호\n");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d\t", lotto[i]);
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d\t", lottoAnswer[i]);
        }
        System.out.println();

        if (cNumber == 6) {
            System.out.printf("1등 - 6개 맞춤");
        } else if (cNumber == 5) {
            System.out.printf("2등 - 5개 맞춤");
        } else if (cNumber == 4) {
            System.out.printf("3등 - 4개 맞춤");
        } else if (cNumber == 3) {
            System.out.printf("4등 - 3개 맞춤");
        } else {
            System.out.printf("꽝 - 2개 이하");
        }
    }

    public static int sameNumber(int[] lotto, int[] lottoAnswer) {
        int cNumber = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lotto[i] == lottoAnswer[j]) {
                    cNumber += 1;
                }
            }
        }
        return cNumber;
    }

    public static int[] arrangement(int[] lotto) {
        for (int j = 0; j < lotto.length - 1; j++) {
            for (int i = 0; i < lotto.length - 1; i++) {
                if (lotto[i] > lotto[i + 1]) {
                    int space = lotto[i];
                    lotto[i] = lotto[i + 1];
                    lotto[i + 1] = space;
                }
            }
        }
        return lotto;
    }

    public static int[] avoidDiscomfort(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    lotto[i] = (int) ((Math.random() * 8) + 1);
                    i--;
                }
            }
        }
        return lotto;
    }

    public static int[] createRandomNumber() {
        int[] randomNumber = new int[6];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * 8 + 1);
        }
        return randomNumber;
    }

}
    class BuyLotto {
        public static int[] writeLotto() {
            Scanner sc = new Scanner(System.in);
            int[] writeLotto = new int[6];

            for (int i = 0; i < writeLotto.length; i++) {
                writeLotto[i] = sc.nextInt();
            }
            return writeLotto;
        }
    }

class LottoDraw {
    public static void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
    }
}