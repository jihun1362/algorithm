package algorithm.programmers.codingTestBeginner.day7;

public class YangGGoChi {
    public static int solution(int n, int k) {
        return ((n*12000)+(k*2000)-((n/10)*2000));
    }
    public static void main(String[] args) {
        System.out.println(solution(10,3));
    }
}
