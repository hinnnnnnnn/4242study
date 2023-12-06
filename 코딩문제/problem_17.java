package 코딩문제;
//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
public class problem_17 {
    private final static int MAX = 4000000;
    public static void main(String[] args) {
        int n = 1;
        int m = 2;
        int tmp = 0;
        int sum = m;

        while ( n + m <= MAX ){
            if ( ( n + m ) % 2 == 0 ){
                sum += n + m;
            }
            tmp = m;
            m = n + m;
            n = tmp;
        }
        System.out.println(sum);
    }
}
//4613732