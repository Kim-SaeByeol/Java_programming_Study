package chap_03;

import java.util.Scanner;

public class Pg_154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //무한 반복문
        while (true){
            System.out.print("나뉨수를 입력하시오. : ");
            int dividend;
            dividend = sc.nextInt();
            System.out.print("나눗수를 입력하시오 : ");
            int divisor;
            divisor = sc.nextInt();
            // try문에서 에러가 걸리면 catch문 실행,
            // 에러가 아니라면 try 실행. break 문을 통해 반복문도 벗어남.
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
                break;
            }
            catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }
}
