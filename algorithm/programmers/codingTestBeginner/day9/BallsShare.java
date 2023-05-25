package algorithm.programmers.codingTestBeginner.day9;

public class BallsShare {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    //    public static int solution(int balls, int share) {
//        return numExclamationMark(balls).divide(numExclamationMark(balls-share).multiply(numExclamationMark(share))).intValue();
//    }
//    public static BigInteger numExclamationMark(int num){
//        int n = num;
//        BigInteger k = BigInteger.valueOf(1);
//        for (int i = 1; i <= n; i++){
//            k=k.multiply(BigInteger.valueOf(i));
//            System.out.println(k);
//        }
//        return k;
//    }
    public static int solution(int balls, int share) {
        // (1) Math.min(5 - 3, 3) share는 2
        // (2) Math.min(4 - 1, 1) share는 1
        // (3) Math.min(3 - 0, 0) share는 0
        share = Math.min(balls - share, share);

        /**
         재귀 (1) balls=5 , share=2
         재귀 (2) balls=4 , share=1
         */

        // (3) (2)로 리턴 1
        if (share == 0)
            return 1;

        // (1) solution(5 - 1, 2 - 1) (2)로 재귀
        // (2) solution(4 - 1, 1 - 1) (3)으로 재귀
        // (2) result = 재귀(3)에서 1을 리턴 받음
        // (1) result = 재귀(2)에서 4를 리턴 받음
        long result = solution(balls - 1, share - 1);

        // (2) 1*4 = 4
        // (1) 4*5 = 20
        result *= balls;
        // (2) 4/1 = 4
        // (1) 20/2 = 10
        result /= share;

        // (2) 재귀(1)로 4를 리턴
        // result = 10, 경우의 수는 10
        return (int) result;
    }
}
