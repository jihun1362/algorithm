package algorithm.programmers.codingTestBeginner.day3;

import java.util.HashSet;
import java.util.Set;

public class ChoiBinGabGuhagi {
    public static int solution(int[] array) {
        int answer = 0;
        int countA = 0;
        Set<Integer> setArray = new HashSet<>();
        for (int a : array) {
            setArray.add(a);
        }

        for (int a : setArray) {
            int countB = 0;
            for (int b : array) {
                if (a == b) {
                    countB++;
                }
                System.out.println("countA"+countA);
                System.out.println("countB"+countB);
            }

            if (countB > countA) {
                answer = a;
                countA = countB;
            }else if (countB == countA)
                answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
    }
}
