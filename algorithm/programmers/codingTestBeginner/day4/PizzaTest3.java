package algorithm.programmers.codingTestBeginner.day4;

public class PizzaTest3 {
    public static int solution(int slice, int n) {
        return (n + slice - 1) / (slice) ;
    }
    public static void main(String[] args) {
        System.out.println(solution(4,12));
    }
}
