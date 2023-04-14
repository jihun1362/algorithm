package algorithm.programmers.codingTestBeginner.day2;

import java.util.Arrays;

public class ArrayDouble {

    public static int[] solution(int[] numbers) {
        // int[] answer = new int[numbers.length];
        // for(int i=0;i<numbers.length;i++){
        //     answer[i] = numbers[i] * 2;
        // }
        for (int i = 0; i < numbers.length; i++) numbers[i] *= 2;
        return numbers;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(Arrays.toString(solution(a)));
    }
}
