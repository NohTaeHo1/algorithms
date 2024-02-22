package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int k = 25;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j][i] = k;
                k--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
