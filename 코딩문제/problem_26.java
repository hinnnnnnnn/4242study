package 코딩문제;
//네이버 글자수세기 등 특정 글의 글자를 세는 프로그램은 일반적으로 공백을 제외한 글자수만을 세는 기능도 가지고 있다.
//어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
//        입력 예시
//        공백을 제외한
//        글자수만을 세는 코드 테스트
//        출력 예시
//        18

import java.util.Scanner;

public class problem_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 입력 : ");
        String sss = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < sss.length(); i++) {
            if (sss.charAt(i) == ' ') {
                cnt++;
            }
        }
        int sum = sss.length() - cnt;
        System.out.println(sum);
    }
}
