package programmers.codingTestBeginner.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class JjaxsuNope {
    public static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (i % 2 != 0) arrayList.add(i);
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) answer[i] = arrayList.get(i);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}
