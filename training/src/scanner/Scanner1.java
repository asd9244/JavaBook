package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열 입력해");
        String str = scanner.nextLine();
        System.out.println("str = " + str);

        System.out.println("정수를 입력해");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("실수 입력해");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

    }
}
