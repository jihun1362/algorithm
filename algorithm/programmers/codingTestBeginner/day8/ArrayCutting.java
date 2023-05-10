package algorithm.programmers.codingTestBeginner.day8;

import java.util.Arrays;

public class ArrayCutting {
    public static int[] solution(int[] numbers, int num1, int num2) {
//        String a = Arrays.toString(numbers)
//                .replace("[","")
//                .replace("]","")
//                .replaceAll(" ","")
//                .replaceAll(",","");
//        System.out.println(a);
//        return Arrays.stream(a.substring(num1,num2+1).split("")).mapToInt(Integer::parseInt).toArray();

//        ArrayList<Integer> answer = new ArrayList<>();
//        for (int i=0;i<numbers.length;i++){
//            if (num1 <= i && i <= num2){
//                answer.add(numbers[i]);
//            }
//        }
//        return answer.stream().mapToInt(Integer::intValue).toArray();

//        int[] answer = Arrays.stream(numbers, num1, num2+1).toArray();
//        return answer;

//        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();

        return Arrays.copyOfRange(numbers, num1, num2 + 1);

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }
}