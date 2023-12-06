package 코딩문제;

//양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자. ex1) 3 > 1자리수, ex2) 649 > 3자리수 ....?
public class problem_25 {
    public static void main(String[] args) {

        int count = 0;
        int number = 10000;

        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);

    }
}
