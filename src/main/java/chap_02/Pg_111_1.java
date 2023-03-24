package chap_02;

import java.util.Scanner;

/*
Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
$1 = 1100원으로 가정하고 계산하라.
원화를 입력하세요(단위 원) >>
3300은 $3.0 입니다.
 */
public class Pg_111_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b, result;
        System.out.println("원화를 입력하세요(단위 원) >> ");
        a = sc.nextInt();
        result = a / 1100;
        System.out.println(a + "은" + " $" + result+ "입니다.");
        sc.close();
    }

}
