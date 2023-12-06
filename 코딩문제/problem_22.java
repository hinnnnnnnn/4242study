package 코딩문제;

import java.util.Scanner;

//A씨는 학교숙제로 이차방정식 문제를 풀어야 한다. 하지만 시간이 얼마 없다.
//이 A씨를 도와주기 위한 이차방정식 풀이 프로그램을 작성해라.(단, 일차방정식은 ax^2 + bx + c = 0의 꼴에서 a, b와 c를 입력받아 해를 구하고 해를 구하기 위해 근의 공식을 사용해야 한다.
//또, 해는 정수로 반올림한 값을 구하고 해가 없거나 여러개인 경우도 모두 구해야 한다.)
public class problem_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("\nb= ");
        int b = sc.nextInt();
        System.out.print("\nc= ");
        int c = sc.nextInt();

        if(b*b-4*a*c < 0)
            System.out.println("해가 없습니다.");
        else{

            int result1 = (int)(((-1)*b + Math.sqrt(b*b-4*a*c))/2/a);
            int result2 = (int)(((-1)*b - Math.sqrt(b*b-4*a*c))/2/a);

            if(result1 == 0 && result2 == 0)
                System.out.println("해는 " + result1 + "입니다.");
            else
                System.out.println("해는 " + result1 + "와" + result2 + "입니다.");
        }
    }
}
