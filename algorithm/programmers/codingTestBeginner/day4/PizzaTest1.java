package algorithm.programmers.codingTestBeginner.day4;

public class PizzaTest1 {
    public static int solution(int n) {
        int answer = (int) Math.round((double) n / 7 * 1);
        if (n % 7 < 4 && n % 7 > 0) answer = n / 7 + 1;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(16));
    }
}
