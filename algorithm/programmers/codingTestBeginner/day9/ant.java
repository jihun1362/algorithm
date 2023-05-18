package algorithm.programmers.codingTestBeginner.day9;

public class ant {
    public static int solution(int hp) {
        return hp/5 + ((hp%5)/3) + ((hp%5)%3);
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
    }
}
