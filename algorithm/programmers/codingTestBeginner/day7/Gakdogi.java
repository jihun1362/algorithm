package algorithm.programmers.codingTestBeginner.day7;

public class Gakdogi {
    public static int solution(int angle) {
        int answer = 0;
        if(0 < angle && angle < 90){
            answer = 1;
        }else if(angle==90){
            answer = 2;
        }else if(90 < angle && angle < 180){
            answer = 3;
        }else if(angle==180){
            answer = 4;
        }else answer = 0;

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(70));
    }
}
