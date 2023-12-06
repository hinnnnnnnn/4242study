package 코딩문제;

import java.util.Arrays;

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
public class problem_21 {
    public static void main(String[] args) {
        int number = 0;
        int max = 0;
        String str = null;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                number = i * j;
                str = number + "";

                char[] array1 = new char[str.length()];
                char[] array2 = new char[str.length()];
                for (int k = 0; k < str.length(); k++) {
                    array1[k] = str.charAt(k);
                }
                int idx = 0;
                for (int k = str.length() - 1; k >= 0; k--) {
                    array2[idx] = str.charAt(k);
                    idx++;
                }
                if (Arrays.equals(array1, array2)) {
                    if (number > max) {
                        max = number;
                    }
                    System.out.println(i + " * " + j + " = " + max);
                    System.out.println(Arrays.toString(array1));
                    System.out.println(Arrays.toString(array2));
                }
            }
        }
        System.out.println("가장 튼 대칭수는 :" + max + "입니다");

    }
}

//    public static void main(String[] args) throws Exception {
//
//        int ans = 0;
//        for (int i = 100; i < 1000; i++) {
//            for (int j = 100; j < 1000; j++) {
//                if ((i * j + "").equals(new StringBuffer(i * j + "").reverse().toString()))
//                    ans = Math.max(ans, i * j);
//            }
//        }
//        System.out.println(ans);
//    }
//}