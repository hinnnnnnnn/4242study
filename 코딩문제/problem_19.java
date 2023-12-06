package 코딩문제;
// 시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데, 예를 들어 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다.
// 예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
// 어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
import java.util.Scanner;

public class problem_19 {
    public static void main(String[] args) {
            String A="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String ans="";
            int adress;

            Scanner s= new Scanner(System.in);

            System.out.println("문자열 입력 : ");
            String word=s.nextLine();
            System.out.println("n값을 입력 :");
            int n=s.nextInt();
            n=n%26;      // 한바퀴 돌 경우 대비

            for(int i=0;i<word.length();i++) {
                String cnt=word.substring(i,i+1);
                if(cnt.equals(" ")) {
                    ans=ans+" ";
                    continue;
                }
                adress=A.indexOf(cnt);
                ans=ans+A.substring(adress+n,adress+(n+1));
            }
            System.out.println(ans);

        }

}
