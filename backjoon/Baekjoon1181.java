package backjoon;

import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        Set<String> input = new HashSet<>();

        for (int i = 0; i < testCase; i++) {
            input.add(sc.next());
        }

        List<String> inputList = new ArrayList<>(input);

        Collections.sort(inputList);

        for (int j = 0; j < inputList.size() - 1; j++) {
            for (int i = 0; i < inputList.size() - 1; i++) {
                String forward = inputList.get(i);
                String backward = inputList.get(i + 1);

                if (forward.length() > backward.length()) {
                    inputList.set(i, backward);
                    inputList.set(i + 1, forward);
                }
            }
        }
        inputList.forEach((i)-> System.out.println(i));
        //Comparator.compare
    }
}
