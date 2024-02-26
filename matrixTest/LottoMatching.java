package matrixTest;

public class LottoMatching {
    /*로또 1~8번, 1등은 6개, 2등 5개, 3등 4개, 4등 3개, 2개 이하 꽝
    구매로또 번호와 추첨로또 번호 모두 같이 출력
    이하 출력 [1등 - 6개 맞춤, 2등 - 5개 맞춤, 3등 - 4개 맞춤, 4등 - 3개 맞춤, 꽝 - 2개 이하]
     */
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int[] lottoAnswer = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 8 + 1);
            lottoAnswer[i] = (int) (Math.random() * 8 + 1);

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
                else if(lottoAnswer[i] == lottoAnswer[j]){
                    i--;
                }
            }
        }

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (lotto[i] > lotto[i + 1]) {
                    int a = lotto[i];
                    lotto[i] = lotto[i + 1];
                    lotto[i + 1] = a;
                }
                if (lottoAnswer[i] > lottoAnswer[i + 1]) {
                    int b = lottoAnswer[i];
                    lottoAnswer[i] = lottoAnswer[i + 1];
                    lottoAnswer[i + 1] = b;
                }
            }
        }
         // lotto[]와 lottoAns[]에 번호 6개 넣어져있는 상황
        int cNumber =0;
        for(int i=0;i<lotto.length;i++){
            for(int j=0;j<lottoAnswer.length;j++){
                if(lotto[i] == lottoAnswer[j]){
                    cNumber += 1;
                }
            }
        }
        System.out.printf("구매 로또 번호와 추첨 로또 번호\n");
        for(int i=0; i<6; i++) {
            System.out.printf("%d\t", lotto[i]);
        }
        System.out.println();
        for(int i=0; i<6; i++){
            System.out.printf("%d\t", lottoAnswer[i]);
        }
        System.out.println();

        if (cNumber == 6){
            System.out.printf("1등 - 6개 맞춤");
        }else if (cNumber == 5){
            System.out.printf("2등 - 5개 맞춤");
        }else if (cNumber == 4){
            System.out.printf("3등 - 4개 맞춤");
        }else if (cNumber == 3){
            System.out.printf("4등 - 3개 맞춤");
        }else{
            System.out.printf("꽝 - 2개 이하");
        }

            /*로또 1~8번, 1등은 6개, 2등 5개, 3등 4개, 4등 3개, 2개 이하 꽝
    구매로또 번호와 추첨로또 번호 모두 같이 출력
    이하 출력 [1등 - 6개 맞춤, 2등 - 5개 맞춤, 3등 - 4개 맞춤, 4등 - 3개 맞춤, 꽝 - 2개 이하]
     */


    }
}
