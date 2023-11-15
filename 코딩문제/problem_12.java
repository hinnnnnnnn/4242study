package 코딩문제;
//이해 조금 안됌
//1~1000에서 각 숫자의 개수 구하기

import java.util.Arrays;

//예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
//10 = 1, 0
//11 = 1, 1
//12 = 1, 2
//13 = 1, 3
//14 = 1, 4
//15 = 1, 5
//그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
public class problem_12 {
    public static void main(String[] args) { //메인메서드
        int num[] = new int[10]; //num - 10만큼 배열 생성

        for (int i = 1; i <= 1000; i++) { //반복문 1~1000까지 실행

            Integer tempNum = i; //int는 변수의 타입(data type)이다.
            // 기본형을 표현해야 하는 경우, 매개변수로 객체를 필요로 할 때, 기본형 값이 아닌 객체로 저장해야할 때, 객체 간 비교가 필요할 때
            String arrNum[] = tempNum.toString().split(""); //배열 arrNum은 기본형 변수 tempNum
            //split()을 사용하여 문자열을 배열로 만들어줌, split(“.“)을 하여 문자열을 . 기준으로 나누어 단어로 배열에 저장이된다
            for (int j = 0; j < arrNum.length; j++) { //반복문 arrNum의 길이만큼 실행
                num[Integer.parseInt(arrNum[j])]++; //이부분이해안감
            }
        }

        for (int i = 0; i < num.length; i++) { //반복문 num의 길이만큼, 즉 0~9까지 실행
            System.out.println("번호==> " + i + "  " + "개수==> " + num[i]); //num[i]값 출력
        }
    }
}
    /*
    int box[] = new int[10];

        for(int i=1; i <=1000;i++){
            box[i%10]++;
            if(i>=10) box[(i/10)%10]++;
            if(i>=100) box[(i/100)%10]++;
            if(i==1000) box[1]++;
        }
        System.out.println(Arrays.toString(box));
    }
        */