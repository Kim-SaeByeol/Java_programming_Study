package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pg_164_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.print("곱하고자 하는 두 수 입력 >> ");
            try {
                int n = sc.nextInt();
                int m = sc.nextInt();
                System.out.print(n + "x" + m + "=" + n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
