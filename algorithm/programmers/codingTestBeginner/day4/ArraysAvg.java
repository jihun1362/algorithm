package algorithm.programmers.codingTestBeginner.day4;

public class ArraysAvg {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(double n : numbers){
            answer += n;
        }
        return answer/numbers.length;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
