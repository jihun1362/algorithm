package algorithm.hanghae99.hanghaeAlgorithm;

class Solution25 {
    public int solution(int left, int right) {
        int answer = 0;
        return answer;
    }
}

public class Num25 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count=0;
            for (int j=1; j <= i;j++){
                if (i%j==0) ++count;
            }
            if (count%2==0) answer+=i;
            else answer-=i;
        }
        System.out.println(answer);
    }
}
