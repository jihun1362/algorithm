package algorithm.programmers.codingTestBeginner.day2;

import java.util.Arrays;

public class FractionalAddition {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //분모
        int mother = denom1 * denom2;
        //분자1
        int son1 = numer1 * denom2;
        //분자2
        int son2 = numer2 * denom1;
        //분자1 + 분자2
        int totalSon = son1 + son2;
        //분자를 나눌수 있는 최대수로 나누기
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        return new int[]{totalSon, mother};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
    }
}
