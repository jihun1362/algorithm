package algorithm.programmers.codingTestBeginner.day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class jinRuoSoonSer {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sort = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        Map<Integer, Integer> mapper = new HashMap<>();
        for (int i = 1; i <= sort.length; i++) {
            mapper.put(sort[i - 1], i);
        }

        for (int i = 0; i < mapper.size(); i++) {
            answer[i] = mapper.get(emergency[i]);
        }
        return answer;

//        return Arrays.stream(emergency).map(
//                i -> Arrays.stream(emergency)
//                        .boxed()
//                        .sorted(Comparator.reverseOrder())
//                        .collect(Collectors.toList())
//                    .indexOf(i) + 1
//        ).toArray();

//        int[] answer = new int[emergency.length];
//        List<Integer> collect = Arrays.stream(emergency)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        for (int i = 0; i < collect.size(); i++) {
//            answer[i] = collect.indexOf(emergency[i])+1;
//        }
//        return answer;
    }
}

