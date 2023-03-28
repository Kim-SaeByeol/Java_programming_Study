package chap_03;

import java.util.Scanner;

public class Pg_120 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int n = sc.nextInt();
        while (n != -1) {           //-1 이 나올때 까지 반복.
            sum += n;               //n의 값을 모두 더한다.
            count ++;               //입력할때마다 카운트의 값이 1개씩 늘어남.
            n = sc.nextInt();       //입력을 받는 스캐너.
        }
        if(count ==0) {             //정수 입력을 안하고 -1을 넣었을 때.
            System.out.println("입력된 수가 없습니다.");
        }else {
            System.out.print("정수의 개수는 " + count + "개이며");       //카운트 (입력 횟수) 값 출력
            System.out.println("평균은 "+ (double)sum/count + "입니다."); //sum(모든 입력 수를 더한 값)에 카운트(입력 횟수) 를 나눠 평균 값을 구한다.
        }
        sc.close();
    }
}
