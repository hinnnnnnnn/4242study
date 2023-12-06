package 코딩문제;
//세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
//예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로 3, 4, 5는 피타고라스 수입니다.
//a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
public class problem_16 {
    public static void main(String[] args) {

        int a, b, c;
        for (c = 1; c < 1000; c++) {
            for (b = 1; b < c; b++) {
                for (a = 1; a < b; a++) {
                    if ((a + b + c == 1000) && (c * c == (a * a) + (b * b))) {
                        System.out.println("a는 " + a);
                        System.out.println("b는 " + b);
                        System.out.println("c는 " + c);
                        System.out.println("a X b X c =" + (a * b * c));
                    }
                }
            }
        }
    }
}

/*
a는 200
b는 375
c는 425
a X b X c =31875000
 */