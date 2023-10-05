package ThreeWeek;

import java.util.*;

//빈칸 넣기
//[문제1] 오름차순으로 정렬되도록 해라.
//[문제2] 내림차순으로 정렬되도록 해라.
//[문제3] 한 번 실행되면 멈추도록 해라.
//[문제4] 값을 제대로 입력하지 않았을 경우 다시 실행되도록 해라.
//[문제5] List에 ArrayList를 이용하여 HashMap 값 넣어라.
    public class KimEx03_Answer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(1, 150);
                map.put(2, 180);
                map.put(3, 190);
                map.put(4, 120);
                map.put(5, 130);
                map.put(6, 160);

                System.out.println("정렬 방식을 선택하세요.(UP = 키 작은 순서대로, DOWN = 키 큰 순서대로)");
                System.out.println("UP/DOWN");

                String updown = scanner.next();

                List<Integer> valueList = new ArrayList<>(map.values());
                valueList.sort(Integer::compareTo);

                if (updown.equals("UP")) {
                    for (int i = 0; i < valueList.size(); i++) { //오름차순 출력
                        System.out.println(valueList.get(i)+"CM");
                    }
                    break;
                } else if (updown.equals("DOWN")) {
                    for (int i = valueList.size() - 1; i >= 0; i--) { //내림차순 출력
                        System.out.println(valueList.get(i)+"CM");
                    }
                    break;
                } else {
                    System.out.println("값을 제대로 입력하세요");
                    System.out.println("========================================");
                }
            }
        }
    }

/* 결과값
정렬 방식을 선택하세요.(UP = 키 작은 순서대로, DOWN = 키 큰 순서대로)
UP/DOWN
UP
120CM
130CM
150CM
160CM
180CM
190CM

정렬 방식을 선택하세요.(UP = 키 작은 순서대로, DOWN = 키 큰 순서대로)
UP/DOWN
DOWN
190CM
180CM
160CM
150CM
130CM
120CM

정렬 방식을 선택하세요.(UP = 키 작은 순서대로, DOWN = 키 큰 순서대로)
UP/DOWN
SDF
값을 제대로 입력하세요
========================================
정렬 방식을 선택하세요.(UP = 키 작은 순서대로, DOWN = 키 큰 순서대로)
UP/DOWN
 */