package matrixTest;

public class Gugudan2 {
    public static void main(String[] args) {
        for (int m = 0; m < 2; m++) {
            int k = 1;
            int n = m*4;

            for (int i = 0; i < 9; i++) {
                for (int j = n; j < 4+n; j++) {
                    int mul = (j + 2) * k;
                    System.out.printf("%3d X%3d =%3d", (j + 2), k, mul);
                    System.out.print(" ");
                }
                k++;
                System.out.println();
            }
            System.out.println();
        }
    }
}
