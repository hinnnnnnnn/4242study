package 코딩문제;

import java.util.Scanner;

//DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다.
// (예, 454 => 454, 4546793 => 454*67-9-3) DashInsert 함수를 완성하자.
//        입력 - 화면에서 숫자로 된 문자열을 입력받는다.
//        "4546793"
//        출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
//        "454*67-9-3"

public class problem_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int T = sc.nextInt();

        int a = 0;
        int b = 0;

        for (int test_case = 1; test_case <= T; test_case++) {
            String num = sc.next();
            String Dash = "";
            for (int i = 0; i < num.length() - 1; i++) {
                a = num.charAt(i) - '0';
                b = num.charAt(i + 1) - '0';

                if (a % 2 == 0 && b % 2 == 0) {
                    Dash = Dash + Integer.toString(a) + '*';                //짝수
                } else if (a % 2 == 1 && b % 2 == 1) {
                    Dash = Dash + Integer.toString(a) + '-';               //홀수
                } else {
                    Dash = Dash + Integer.toString(a);
                }

            }
            Dash = Dash + Integer.toString(b);
            System.out.println("최종문자 : " + Dash);
        }
    }
}