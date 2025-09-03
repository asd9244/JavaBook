package scanner;
import java.util.Objects;
import java.util.Scanner;
public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자.
        //`exit` 라는 문자가 입력되면 프로그램을 종료한다.
        //프로그램은 반복해서 실행된다.

        while (true) {
            System.out.println("문자를 입력해주세요");
            String str = scanner.nextLine();
            if(str.equals("exit")) {
                System.out.println("작동 중지");
                break;
            }
            System.out.println("입력하신 문자는 " + str + "입니다.");
        }
    }
}
