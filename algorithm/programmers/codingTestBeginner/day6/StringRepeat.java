package algorithm.programmers.codingTestBeginner.day6;

public class StringRepeat {
    public static String solution(String my_string, int n) {
        String answer = "";
        String[] a1 = my_string.split("");
        for(String a2 : a1){
            for(int i=n;i>0;i--){
                answer+=a2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("hello",3));
    }
}
