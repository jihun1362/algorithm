package algorithm.jobda;

import java.util.Arrays;

public class JobDaGuhyeonTest {
    public static int solution(int X, int[][] H) {
        int answer = 0;

        //1월2화3수4목5금6토7일
        if (X == 6 || X == 7) answer = (364 / 7) * 2 + 1 + H.length;
        else answer = 104 + H.length;

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        String[] Xdays = new String[7];

        for (int i = 0; i < 7; i++) {
            Xdays[i] = days[X - 1];
            if (X - 1 == 6) X = 0;
            X++;
        }
        System.out.println(Arrays.toString(Xdays));


        for (int[] i : H) {

            int monthTotalDays = 0;
            int totalDays = 0;

            for (int j = 0; j < i[0] - 1; j++) {
                monthTotalDays += months[j];
            }
            if (i[0] == 1) {
                totalDays += i[1];
            } else
                totalDays += monthTotalDays + i[1];

            int num = (totalDays - 1) % 7;

            String day = Xdays[num];

            System.out.println(day);

            if (day.equals("SAT") || day.equals("SUN")) answer--;

        }

        return answer;
    }

    public static void main(String[] args) {
        solution(7, new int[][]{{1, 1}, {2, 2}});
    }
}
