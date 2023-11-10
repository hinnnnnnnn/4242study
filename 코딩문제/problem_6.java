package 코딩문제;
//정답 그대로 - 이해 필요
import java.util.Scanner;

// 피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
// 예) 0, 1, 1, 2, 3, 5, 8, 13
// 인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
public class problem_6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("피보나치 수열을 구할 정수 N을 입력하세요: ");
            int n = scanner.nextInt();

            int i = 0;
            while (problem_6(i) <= n) {
                i++;
            }   //정수n 이하의 피보나치 항수를 계산

            int count = i--;
            for (i = 0; i < count; i++) {
                System.out.print(problem_6(i) + " ");
            }

        }

        public static int problem_6 ( int n){
            if (n <= 1) {
                return n;
            } else {
                return problem_6(n - 2) + problem_6(n - 1);
            }
        }
    }

