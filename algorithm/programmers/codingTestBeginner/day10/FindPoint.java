package algorithm.programmers.codingTestBeginner.day10;

public class FindPoint {
    public static int solution(int[] dot) {
        int answer = 0;
        if (dot[0] < 0) {
            answer = 2;
            if (dot[1] < 0) answer = 3;
        } else {
            answer = 1;
            if (dot[1] < 0) answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, -9}));
    }
}
