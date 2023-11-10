package 코딩문제;
//정답 그대로- 이해 필요
import java.io.*;
//A씨는 개발된 소스코드를 특정업체에 납품하려고 한다.
//개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다.
//A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
//A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
public class problem_2 {
    public static void main(String[] args) {
        try {
            //파일로부터 입력받음
            File input_file = new File("input.txt");
            FileReader fileReader = new FileReader(input_file);
            BufferedReader reader = new BufferedReader(fileReader);
            //출력 대상 파일 설정
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            int input_ascii;

            while ((input_ascii = reader.read()) != -1) {
                //문자하나하나는 아스키로 받아와서 char형으로 변환하여 사용
                char input_char = (char) input_ascii;

                if (input_char == 9) {
                    //tab의 아스키코드는 9, 공백의 아스키코드는 32
                    input_char = 32;
                    //탭만나면 공백 4번
                    for (int i = 1; i <= 4; i++) {
                        writer.write(input_char);
                        //System.out.print(input_char);
                    }
                } else {   //탭 아닌 다른 문자들은 그냥 그대로 출력
                    writer.write(input_char);
                    //System.out.print(input_char);
                }

            }
            writer.close(); //안닫아주면 안됨
            reader.close();

        } catch (Exception ex) {

        }
    }
}
