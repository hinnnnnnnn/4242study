package 코딩문제;
//1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
public class problem_23 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i < 21; i++) {
            boolean go = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    go = false;
            if (go)
                sum *= i;
        }
        System.out.println(sum);
    }
}
