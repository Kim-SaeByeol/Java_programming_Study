package chap_02;

import java.util.Scanner;

/*
Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.

2자리수 정수 입력(10~99)>>77
Yes! 10의 자리와 1의 자리가 같습니다.
 */
public class Pg_111_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99) >> ");
        int a = sc.nextInt();
        if(a%10 == a/10) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
        }
        sc.close();
    }
}
