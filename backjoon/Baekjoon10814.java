
///*
//이 코드에서 시간 초과 문제를 해결하기 위한 몇 가지 주요 포인트들이 있습니다. 주어진 문제는 백준 10814번, 나이순 정렬 문제로 보입니다. 이 문제의 핵심은 입력으로 주어진 사람들을 나이가 증가하는 순으로 정렬하는 것인데, 동시에 가입한 순서(=입력 순서)대로 정렬해야 합니다. 이는 안정 정렬(stable sort)이 필요함을 의미합니다. 여기서 개선할 수 있는 부분을 살펴보겠습니다:
//
//비효율적인 정렬 알고리즘: 코드에서 사용된 버블 정렬은 (O(n^2))의 시간 복잡도를 가지며, 매우 큰 입력에 대해서는 매우 비효율적입니다. Java에서 제공하는 정렬 메서드를 사용하거나, 효율적인 정렬 알고리즘(예: 병합 정렬, 퀵 정렬)을 직접 구현해 사용해야 합니다.
//
//자료 구조 선택: 입력된 데이터를 단순히 문자열 배열로 관리하는 대신, 나이와 이름을 함께 관리할 수 있는 클래스를 정의하고, 이를 기반으로 정렬하는 것이 좋습니다. 이렇게 하면 나이를 기준으로 정렬하되, 나이가 같을 경우 입력 순서(=가입 순서)를 유지할 수 있습니다.
//
//Java의 정렬 메서드 활용: Java의 Arrays.sort() 또는 Collections.sort()를 사용하고, Comparator를 커스텀하여 나이를 기준으로 정렬하면 훨씬 효율적입니다. 이 방법은 내부적으로 효율적인 정렬 알고리즘을 사용하며, 안정 정렬을 보장합니다.
//
//다음은 개선된 코드의 예시입니다:
//
//java
//
//
//package backjoon;
//
//import java.io.*;
//import java.util.*;
//
//public class Baekjoon10814 {
//
//    static class Person {
//        int age;
//        String name;
//
//        public Person(int age, String name) {
//            this.age = age;
//            this.name = name;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int testCase = Integer.parseInt(br.readLine());
//        List<Person> people = new ArrayList<>();
//
//        for (int i = 0; i < testCase; i++) {
//            String[] input = br.readLine().split(" ");
//            int age = Integer.parseInt(input[0]);
//            String name = input[1];
//            people.add(new Person(age, name));
//        }
//
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.age - p2.age;
//            }
//        });
//
//        for (Person p : people) {
//            bw.write(p.age + " " + p.name + "\n");
//        }
//        bw.flush();
//    }
//}
//이 코드는 크게 세 부분으로 개선되었습니다:
//
//Person 클래스를 정의하여 나이와 이름을 함께 관리합니다.
//Java의 Collections.sort() 메서드와 커스텀 Comparator를 사용하여 나이를 기준으로 정렬합니다. 이는 안정 정렬을 보장합니다.
//버블 정렬 대신 Collections.sort()를 사용하여 시간 복잡도를 크게 줄였습니다.
// */