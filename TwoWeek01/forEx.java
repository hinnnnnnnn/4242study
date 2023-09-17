package TwoWeek01;
//숫자를 입력받아 해당 층의 별표 탑 만들기
import java.util.Scanner;

public class forEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("* 개수를 입력하세요");
        int num = scanner.nextInt();

        for(int i =0; i<num; i++) {

            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}