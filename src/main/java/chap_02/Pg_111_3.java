package chap_02;

import java.util.Scanner;

/*
    Scanner 클래스를 이용하여 2정수로 된 돈의 액수를 입력받아
   오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
   
   금액을 입력하시오 >> 65376 
   오만원권 1매
   만원권 1매
   천원권 5매 
   백원 3개
   오십원 1개
   십원 2개
   일원 6개
 */
public class Pg_111_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int a = sc.nextInt();
        System.out.println("오만원권 " + a/50000 + "매");
        a %= 50000;
        System.out.println("만원권 " + a/10000 + "매");
        a %= 10000;
        System.out.println("천원권 " + a/1000 + "매");
        a %= 1000;
        System.out.println("백원 " + a/100 + "개");
        a %= 100;
        System.out.println("오십원 "+ a/50 + "개");
        a %= 50;
        System.out.println("십원 " + a/10 + "개");
        a %= 10;
        System.out.println("일원" + a + "개");
    }
}
