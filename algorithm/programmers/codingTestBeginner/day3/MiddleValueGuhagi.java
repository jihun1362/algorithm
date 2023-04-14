package algorithm.programmers.codingTestBeginner.day3;

import java.util.Arrays;

public class MiddleValueGuhagi {
    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 10, 2, 11, 7}));
    }
}
