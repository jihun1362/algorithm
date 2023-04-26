package algorithm.programmers.codingTestBeginner.day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}
