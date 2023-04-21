package algorithm.programmers.codingTestBeginner.day5;

public class Sale {
    public static int solution(int price) {
        double answer = 0;
        if(price >= 100000) answer = Math.ceil(price * 0.05);
        if(price >= 300000) answer = Math.ceil(price * 0.1);
        if(price >= 500000) answer = Math.ceil(price * 0.2);
        System.out.println(answer);
        return (price-(int)answer);
    }

    public static void main(String[] args) {
        System.out.println(solution(125510));
    }
}
