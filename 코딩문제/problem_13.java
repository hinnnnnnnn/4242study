package 코딩문제;

//10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
//예로, 10~15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.
//        10 = 1 * 0 = 0
//        11 = 1 * 1 = 1
//        12 = 1 * 2 = 2
//        13 = 1 * 3 = 3
//        14 = 1 * 4 = 4
//        15 = 1 * 5 = 5
//        그러므로, 이 경우의 답은 0+1+2+3+4+5 = 15

public class problem_13 {
    public static void main(String[] args) { //메인메서드
        int sum = 0; //변수 초기화
        for (int i = 10; i <= 1000; i++) { //10~1000까지 반복
            int result = 1;
            // i값이 내부에서 변하면 안된다.
            // 임시변수 n에 대입하고 n으로 계산
            int n = i;
            while (n > 0) {
                result *= n % 10;
                n /= 10; // 1의자리 버리기
            }
            sum += result;
        }
        System.out.println("답 : " + sum);
    }
}