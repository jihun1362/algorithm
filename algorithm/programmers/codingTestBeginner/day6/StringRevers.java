package algorithm.programmers.codingTestBeginner.day6;

import java.util.*;

public class StringRevers {
    public static String solution(String my_string) {
        List<String> s = new java.util.ArrayList<>(Arrays.asList(my_string.split("")));
        Collections.reverse(s);
        return String.join("",s);
    }
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }
}
