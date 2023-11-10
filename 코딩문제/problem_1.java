package 코딩문제;
// 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
// 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
public class problem_1 {
    public static void main(String[] args) { //메인메서드
        int max = 1000; //최대값 1000
        int sum = 0; //sum 변수는 0
        for(int num=0; num<max; num++){ //자연수 num 변수를 0으로 초기화 & num은 1000미만의 숫자 & num은 1씩 증가
            if (num % 3 == 0 || num % 5 == 0) { //num이 3의 배수이고 5의 배수라면,
                sum += num; //sum = sum + num
                System.out.println(sum); //sum (총합) 출력
            }
        }
    }

}
