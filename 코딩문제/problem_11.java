package 코딩문제;

import java.util.Scanner;

//A씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다.
//버전은 다음처럼 "." 으로 구분된 문자열이다.
//버전 예) 1.0.0, 1.0.23, 1.1
//두 개의 버전을 비교하는 프로그램을 작성하시오.
// 다음은 버전 비교의 예이다.
//0.0.2 > 0.0.1
//1.0.10 > 1.0.3
//1.2.0 > 1.1.99
//1.1 > 1.0.1
public class problem_11 {
    public static void main(String[] args) { //메인메서드
        Scanner scanner = new Scanner(System.in); //사용자 입력값
        String v1 = scanner.nextLine(); //버전1 입력
        String v2 = scanner.nextLine(); //버전2 입력

        String[] v1_arr = v1.split("\\."); //split()을 사용하여 문자열을 배열로 만들어줌, split(“.“)을 하여 문자열을 . 기준으로 나누어 단어로 배열에 저장이된다
        String[] v2_arr = v2.split("\\."); //split()을 사용하여 문자열을 배열로 만들어줌, split(“.“)을 하여 문자열을 . 기준으로 나누어 단어로 배열에 저장이된다

        int len = Math.max(v1_arr.length, v2_arr.length); //Math.max(x,y) ---> x,y중 큰 수를 반환

        for (int i = 0; i < len; i++) { //반복문 (큰 수의 길이만큼 반복)
            if (Integer.parseInt(v1_arr[i]) > Integer.parseInt(v2_arr[i])) { //문자열을 정수형으로 변환 후, 배열 값 비교
                System.out.println(v1 + ">" + v2);
                break; //반복 루트 벗어나기
            } else if (Integer.parseInt(v1_arr[i]) == Integer.parseInt(v2_arr[i])) { //문자열을 정수형으로 변환 후, 배열 값 비교
                System.out.println(v1 + "=" + v2);
            } else { //문자열을 정수형으로 변환 후, 배열 값 비교
                System.out.println(v1 + "<" + v2);
                break; //반복 루트 벗어나기
            }
        }
    }
}

