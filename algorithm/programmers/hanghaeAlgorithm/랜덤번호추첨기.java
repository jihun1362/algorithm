package algorithm.programmers.hanghaeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class 랜덤번호추첨기 {
    public static void main(String[] args) {
        List<Integer> winner = new ArrayList<>();
        while (winner.size() <= 9) {
            int num = (int) (Math.random() * 42);
            //20 42 9 34
            if (!(num == 0 || num == 1 || num == 20 || num == 42 || num == 9 || num == 34)) {
                if (!winner.contains(num)) {
                    winner.add(num);
                }
            }
        }
        System.out.println(winner);
    }
}
