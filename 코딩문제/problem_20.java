package 코딩문제;
//2진법이란, 어떤 자연수를 0과 1로만 나타내는 것이다.
//예를 들어 73은 64(2^6)+8(2^3)+1(2^0)이기 때문에 1001001으로 표현한다.
//어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오.

import java.util.*;
import java.util.Scanner;

public class problem_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<Integer>();
        System.out.print("2진수로 바꿀 자연수를 입력하세요 :");
        int num = scanner.nextInt();
        int divideNum = 2;

        int value1 = 0;
        int value2 = 0;

        value1 = num / divideNum;
        value2 = num % divideNum;

        list.add(value1);
        list.add(value2);
        while (list.get(0) > 1) {
            value1 = list.get(0) / divideNum;
            value2 = list.get(0) % divideNum;
            list.set(0, value1);
            list.add(1, value2);
        }

        if (list.get(0) == 0) {
            list.remove(0);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}