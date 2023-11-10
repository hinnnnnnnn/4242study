package 코딩문제;
//입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//출력 : 총페이지수
import java.util.Scanner;
public class problem_3 {
    public static void main(String[] args) { //메인메서드
        Scanner s = new Scanner(System.in); //사용자 입력 값
        System.out.println("총 게시글 수 "); //총 게시글 수
        int m = s.nextInt(); //총 게시글 수 입력 받기
        System.out.println("페이지당 게시글 수 "); //페이지당 게시글 수
        int n = s.nextInt(); //페이지당 게시글 수 입력 받기

        if (m % n == 0) { //m을 n으로 나눈 나머지가 0일 때,
            System.out.println(m / n + " 페이지 필요"); //m을 n으로 나눈 값 출력
        } else { //m을 n으로 나눈 나머지가 0이 아닐 때,
            System.out.println(m / n + 1 + " 페이지 필요"); //m을 n으로 나눈 후 + 1 한 값 출력
        }
    }
}

//나머지로 if문을 쓰는 이유 : 나머지가 0 이면 한 페이지에 딱 들어가기 때문
//나누기로 출력하는 이유 : 나눈 값에 따라 페이지 수가 정해지기 때문, 만약 나머지가 0이 아닐 경우 한 페이지가 더 필요하기에 +1