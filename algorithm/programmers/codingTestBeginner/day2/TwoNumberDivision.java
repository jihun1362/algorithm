package algorithm.programmers.codingTestBeginner.day2;

public class TwoNumberDivision {

    public static int solution(int num1, int num2) {
        return (int)(num1/(double)num2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 2));
    }
}
