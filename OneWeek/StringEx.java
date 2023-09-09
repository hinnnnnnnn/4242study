package OneWeek; //공통문제 정답

import java.util.Scanner;

//표준입력으로 임의의 문자열을 입력받고 그 문자열에서 숫자만 골라 출력하는 프로그램을 만드시오.

public class StringEx {

    public static void main(String[] args) { //메인메서드

        Scanner scanner = new Scanner(System.in); //사용자 입력

        System.out.println("임의의 문자열을 입력하세요."); //"임의의 문자열을 입력하세요." 문구 출력
        String num1 = scanner.nextLine(); //num1은 사용자가 입력한 값

        System.out.println("문자열 내 숫자는 : "); //"문자열 내 숫자는 : " 문구 출력
        System.out.println(num1.replaceAll("[^0-9]","")); //문자열을 빈칸으로 대체하여금 숫자만 출력하도록
        //0-9가 아닌 문자열은 "" -> 빈칸으로 대체해라
        //replaceAll의 인자값 = String

    }

}
