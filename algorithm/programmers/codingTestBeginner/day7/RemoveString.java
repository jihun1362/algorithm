package algorithm.programmers.codingTestBeginner.day7;

public class RemoveString {
    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
    public static void main(String[] args) {
        System.out.println(solution("BCBdbe","B"));
    }
}
