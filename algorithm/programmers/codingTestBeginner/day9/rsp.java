package algorithm.programmers.codingTestBeginner.day9;

public class rsp {
    public static String solution(String rsp) {
        String answer = "";
        String[] rsps = rsp.split("");
        for (String s : rsps) {
            if (s.equals("0")) answer += 5;
            else if (s.equals("2")) answer += 0;
            else answer += 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("205"));
    }
}
