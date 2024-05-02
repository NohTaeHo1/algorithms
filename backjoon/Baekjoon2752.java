package backjoon;

import java.util.*;

public class Baekjoon2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        Collections.sort(list);

        list.forEach(System.out::println);

    }
}
