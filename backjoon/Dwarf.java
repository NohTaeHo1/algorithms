package backjoon;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarf = new int[9];
        int total = 0;

        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = sc.nextInt();
            total += dwarf[i];
        }

        outloop:
        for (int i = 0; i < dwarf.length; i++) {
            for (int j = 0; j < i; j++) {
                if (100 == (total - (dwarf[i] + dwarf[j]))) {
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    break outloop;
                }
            }
        }

        for (int i = 0; i < dwarf.length-1; i++) {
            for (int j = 0; j < dwarf.length - 1; j++) {
                if (dwarf[j] > dwarf[j + 1]) {
                    int space = dwarf[j];
                    dwarf[j] = dwarf[j + 1];
                    dwarf[j + 1] = space;
                }
            }
        }

        for (int i = 2; i < 9; i++) {
            System.out.println(dwarf[i]);
        }
    }
}
