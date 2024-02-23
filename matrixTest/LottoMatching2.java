package matrixTest;

public class LottoMatching2 {
    /*로또 1~8번, 1등은 6개, 2등 5개, 3등 4개, 4등 3개, 2개 이하 꽝
    구매로또 번호와 추첨로또 번호 모두 같이 출력
    이하 출력 [1등 - 6개 맞춤, 2등 - 5개 맞춤, 3등 - 4개 맞춤, 4등 - 3개 맞춤, 꽝 - 2개 이하]d
    사는거랑 추첨이랑 따로 구분
     */
    public static void main(String[] args) {

        int[] lotto;
        int[] lottoAnswer;

        lotto = createRandomNumber();
        lotto = avoidDiscomfort(lotto);
        lotto = arrangement(lotto);

        lottoAnswer = createRandomNumber();
        lottoAnswer = avoidDiscomfort(lottoAnswer);
        lottoAnswer = arrangement(lottoAnswer);

        int cNumber = sameNumber(lotto, lottoAnswer);

        System.out.printf("구매 로또 번호와 추첨 로또 번호\n");
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

    private static int sameNumber(int[] lotto, int[] lottoAnswer) {
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

    private static int[] arrangement(int[] lotto) {
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

    private static int[] avoidDiscomfort(int[] lotto) {
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

    private static int[] createRandomNumber() {
        int[] randomNumber = new int[6];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * 8 + 1);
        }
        return randomNumber;
    }
}
