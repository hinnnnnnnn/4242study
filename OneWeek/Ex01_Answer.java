package OneWeek;

import java.util.Scanner;

//표준입력으로 입력 받은 내용으로 연산한 결과를 출력하는 문제
//비만도 계산
//사용자의 키와 몸무게 입력 받아 계산
//저체중,정상,과체중,비만,고도비만
//공식 (몸무게/키(m)*키(M))

public class Ex01_Answer { //오류를 올바르게 고치시오.

    public static void main(String[] args) { //메인메서드

        Scanner scanner = new Scanner(System.in); //사용자 입력
        System.out.println("키를 입력하세요"); //"키를 입력하세요" 문구 출력
        int height = scanner.nextInt(); //height = 사용자 입력값
        System.out.println("몸무게를 입력하세요"); //"몸무게를 입력하세요" 문구 출력
        int weight = scanner.nextInt(); //weight = 사용자 입력값

        double heightM = (height * 0.01); //heightM = height * 0.01
        double result = (weight / (heightM * heightM)); //결과값 = weight / (heightM * heightM

        if(result<18.5) { //만약 결과값이 18.5 미만이라면,
            System.out.println("저체중"); //"저체중" 문구 출력
        } else if (result<23) { //만약 결과값이 23 미만이라면,
            System.out.println("정상"); //"정상" 문구 출력
        } else if (result<25) { //만약 결과값이 25 미만이라면,
            System.out.println("과체중"); //"과체중" 문구 출력
        } else if (result<30) { //만약 결과값이 30 미만이라면,
            System.out.println("비만"); //"비만" 문구 출력
        } else { //30 이상이라면,
            System.out.println("고도비만"); //"고도비만" 문구 출력
        }
    }


}
