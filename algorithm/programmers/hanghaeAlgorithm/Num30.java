package algorithm.programmers.hanghaeAlgorithm;

class Solution30 {
    public int solution(int n) {
        int answer = 0;

        return answer;
    }
}

public class Num30 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1){
               answer+=i;
               break;
            }
        }
        System.out.println(answer);
    }
}
