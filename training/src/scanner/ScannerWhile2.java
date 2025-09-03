package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
        //첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
        //프로그램은 반복해서 실행된다.

        while (true) {
            System.out.println("첫 번째 숫자를 입력해주세요");
            int num1 = scanner.nextInt();

            System.out.println("두 번재 숫자를 입력해주세요");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            if (sum == 0) {
                System.out.println("두 숫자 모두 0 입니다.");
                break;
            }
            System.out.println("두 숫자의 합은 " + sum + "입니다.");
        }
    }
}
