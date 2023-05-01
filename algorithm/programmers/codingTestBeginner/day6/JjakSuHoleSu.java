package algorithm.programmers.codingTestBeginner.day6;

import java.util.Arrays;

public class JjakSuHoleSu {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i : num_list){
            if(i%2==0)  answer[0] += 1;
            else answer[1] += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }
}
