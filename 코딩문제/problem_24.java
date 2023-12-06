package 코딩문제;
//3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요. ex1) 2, 5, 3 => 3 ex2) 4, 6, 4 => 4
import java.util.Arrays;
import java.util.Scanner;
public class problem_24 {
    // 3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요. ex1) 2, 5, 3 => 3 ex2) 4, 6, 4
    // => 4
    public static void main(String[] args) {
        System.out.println("3개의 정수를 입력");
        Scanner sc = new Scanner(System.in);

        int b,c,d;
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int []a = {b,c,d};

        Arrays.sort(a);

        System.out.println(a[1]);

    }
}
