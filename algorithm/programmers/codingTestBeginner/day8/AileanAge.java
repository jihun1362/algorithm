package algorithm.programmers.codingTestBeginner.day8;

import java.util.stream.Collectors;

public class AileanAge {
    public static String solution(int age) {
//        String answer = "";
//        Map<String, String> converter = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            converter.put(String.valueOf(i), String.valueOf((char) (97 + i)));
//        }
//        List<String> split = List.of(String.valueOf(age).split(""));
//        for (String a : split) {
//            answer += converter.get(a);
//        }
//        return answer;
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution(51));
    }
}
