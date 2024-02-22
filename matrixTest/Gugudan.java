package matrixTest;

public class Gugudan {
    public static void main(String[] args) {

        int k = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                int mul = (j + 2) * k;
                System.out.printf("%3d X%3d =%3d", (j+2), k, mul);
                System.out.print(" ");
            }
            k++;
            System.out.println();
        }
        System.out.println();

        int m = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 4; j < 8; j++) {
                int mul = (j + 2) * m;
                System.out.printf("%3d X%3d =%3d", (j+2), m, mul);
                //System.out.print((j + 2) + "X" + m + "=" + mul);
                System.out.print(" ");
            }
            m++;
            System.out.println();
        }
    }
}
