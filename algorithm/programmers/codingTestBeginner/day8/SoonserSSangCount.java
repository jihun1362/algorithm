package algorithm.programmers.codingTestBeginner.day8;

public class SoonserSSangCount {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                answer++;
            }
        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i * j == n) {
//                    answer++;
//                }
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1000000));
    }
}
