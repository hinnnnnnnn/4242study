package 코딩문제;
//조금 헷갈림
import java.util.Scanner;
// n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
// 정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
// 예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
public class problem_5 {
    public static void main(String[] args) { //메인메서드
        Scanner scanner = new Scanner(System.in); //사용자 입력값
        String str = scanner.nextLine(); //str 문자열 생성
        String arr[] = null; //arr 문자열 배열 생성
        arr = str.split(" "); //split()을 사용하여 문자열을 배열로 만들어줌, split(“  “)을 하여 문자열을 “ “ 기준으로 나누어 단어로 배열에 저장이된다

        for(String sort : arr) //
            if( sort.startsWith("-") )
                System.out.print(sort + " ");
        for(String sort : arr)
            if( !sort.startsWith("-") )
        System.out.print(sort + " ");
    }



}

