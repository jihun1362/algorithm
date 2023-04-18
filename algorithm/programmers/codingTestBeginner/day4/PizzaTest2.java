package algorithm.programmers.codingTestBeginner.day4;

public class PizzaTest2 {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=100;i++) {
            if((n*i) % 6 == 0){
                answer = n*i;
                break;
            }
        }
        return answer/6;
    }
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
