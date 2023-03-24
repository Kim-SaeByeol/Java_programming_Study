package chap_02;

import java.util.Scanner;

/*
Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
평균 값을 구하는 것이 아님에 주의하라.

 정수 3개 입력>> 20 100 33
 중간 값은 33
 */
public class Pg_111_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력>> ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(b < a && a < c || c < a && a < b  ) {
                System.out.println("중간 값은 " + a);
        } else if (a < b && b < c || c < b && b < a) {
            System.out.println("중간 값은 " + b);
        } else if(a < c && c < b || b < c && c < a){
            System.out.println("중간 값은 " + c);
        }
    }
}
