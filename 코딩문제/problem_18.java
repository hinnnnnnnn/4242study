package 코딩문제;

import java.util.ArrayList;
//1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합)
//1^2 + 2^2 + ... + 10^2 = 385 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다 (합의 제곱)
//(1 + 2 + ... + 10)^2 = 55^2 = 3025 따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는 3025 - 385 = 2640 이 됩니다.
//그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?
public class problem_18 {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      for (int i = 1; ; i++) {//피보나치 수열을 list에 저장 list에 들어간 값이 400만을 넘으면 멈춤
          list.add(list.get(i - 1) + list.get(i));
          if (list.get(i - 1) + list.get(i) > 4000000)
              break;
      }

      list.remove(list.get(list.size() - 1));//list에 마지막 인덱스 값을 제거(400만 넘으니깐)
      int sum = 0;
      for (int i = 0; i < list.size(); i++) {//짝수인 총합
          if (list.get(i) % 2 == 0)
              sum += list.get(i);
      }
      System.out.println(sum);
  }

}

/*
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;

        for(int i=1;i<=100;i++){
            sum+=(i*i);
        }

        for(int i=1;i<=100;i++){
            sum2 += i;
        }


        System.out.println(sum2*sum2-sum);
    }
 */