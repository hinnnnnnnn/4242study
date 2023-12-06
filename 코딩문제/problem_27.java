package 코딩문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//배열 [a, b, c, d]를 입력하면 배열[bcd, acd, abd, abc]를 출력하는 코드를 작성하시오.
//(단, 나눗셈 사용 금지)
//입출력되는 배열은 어떤 형식이든 상관없습니다.
//입력 예시
//2, 6, 4, 7
//출력 예시
//168, 56, 84, 48
public class problem_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(", ");
        int[] num = Arrays.asList(nums).stream().mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<num.length; i++) {
            int a = 1;
            for(int j = 0; j<num.length; j++) {
                if(num[i]!=num[j]) {
                    a=a*num[j];
                }
            }
            list.add(a);
        }
        System.out.println(list);
    }
    //주의!! 입력할 때 ", "처럼 컴마 뒤 공백을 해주어야한다.
}



//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int d = scan.nextInt();
//        System.out.println((b*c*d)+", "+(a*d*c)+", "+(a*b*d)+", "+(a*b*c));