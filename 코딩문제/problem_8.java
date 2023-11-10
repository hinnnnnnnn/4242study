package 코딩문제;
// 프로그램 실행 순서
// 1. 입력할 정수의 개수를 사용자로부터 입력 받는다.
// 2. 입력받은 정수의 개수만큼 정수를 입력받는다.
// 3. 입력받은 정수의 합과 평균 값을 출력한다.
// 4. 할당된 메모리공간을 비운다.

// 요구사항
// 1. 메모리공간은 사용자의 입력 수의 따라 변동된다.
// 2. 사용한 공간은 마지막에 비워야 한다.
// 3. 배열을 사용하면 안된다.
import java.util.Scanner;

public class problem_8 {
    public static void main(String[] args) { //메인메서드
        Scanner scanner = new Scanner(System.in); //사용자 입력값
        int sum = 0; //sum 정수
        int input; //input 정수
        System.out.println("입력할 정수의 개수를 입력하세요."); //"입력할 정수의 개수를 입력하세요." 출력
        int n = scanner.nextInt(); //정수 n은 사용자가 입력한 값
        System.out.println("입력받은 정수의 개수만큼 정수를 입력하세요."); //"입력받은 정수의 개수만큼 정수를 입력하세요." 출력
        for (int i = 0; i < n; i++) { //n의 개수 만큼 반복문 실행
            input = scanner.nextInt(); //사용자 입력값
            sum += input; //사용자가 입력한 값 총합 구하기
        }
        System.out.println("합계: " + sum); //합계 출력
        double avg = ((double) sum /n); //실수 avg 변수 설정 후 평균 계산
        System.out.println("평균: " + avg); //평균 출력
    }
}
