package 코딩문제;
//0123456789 true 그 외 false가 출력 되지만 순서가 바뀔 경우, true가 출력 되지 않음
import java.util.Objects;
import java.util.Scanner;

// 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인 하는 함수를 구하시오.
// sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
// sample outputs: true false false true false
public class problem_9 {
    public static void main(String[] args) {
        String str = "0123456789";
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력 하세요 ");
        String input = scanner.nextLine();

        if(Objects.equals(input, str)){
            boolean b = true;
            System.out.println(b);
        } else {
            boolean b = false;
            System.out.println(b);
        }
    }
}
