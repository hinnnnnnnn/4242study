package 코딩문제;

import java.util.Scanner;
// 이 문제의 핵심은 비트 연산을 얼마나 잘 이해하고 있냐이기 때문에 비트 연산으로 풀어주세요.
//input은 int n을 입력 받아 첫번째 row는 (n-1)의 O와 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 (n-3)의 0와 XXX... n번째 row는 n의 X을 출력하시오.
//입력 예시: 6
//OOOOOX
//OOOOXX
//OOOXXX
//OOXXXX
//OXXXXX
//XXXXXX
public class problem_10 {
    public static void main(String[] args) { //메인메서드
        Scanner scanner = new Scanner(System.in); //사용자 입력값
        System.out.println("숫자를 입력하세요."); //"숫자를 입력하세요" 문구 출력
        int n = scanner.nextInt(); //사용자 입력값 n
        int j; //변수 j 선언

        for(int i=0; i<n; i++) { //반복문 : 사용자가 입력한 n의 개수 만큼 줄 출력
            for (j = 0; j < n - (i + 1); j++) { //반복문 : 사용자가 입력한 개수
                System.out.print("O");
            }
            for (int k = 0; k < n - j; k++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
