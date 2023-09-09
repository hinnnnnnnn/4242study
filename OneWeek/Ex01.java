package OneWeek;

import java.util.Scanner;

//표준입력으로 입력 받은 내용으로 연산한 결과를 출력하는 문제
//비만도 계산
//사용자의 키와 몸무게 입력 받아 계산
//저체중,정상,과체중,비만,고도비만
//공식 (몸무게/키(m)*키(M))
public class Ex01 {

    public void bmi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("키를 입력하세요");
        int height = scanner.nextInt();
        System.out.println("몸무게를 입력하세요");
        int weight = scanner.nextInt();

        double heightM = (height * 0.01);
        double result = (weight / (heightM * heightM));

        if(result<18.5) {
            System.out.println("저체중");
        } else if (result<23) {
            System.out.println("정상");
        } else if (result<25) {
            System.out.println("과체중");
        } else if (result<30) {
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
    }

}
