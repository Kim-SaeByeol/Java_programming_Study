package chap_02;

import java.util.Scanner;

/*
    다음 코드의 실행결과는 무엇인가?
    i가 6의 배수인 경우 "6의 배수"를, i가 홀수인 경우 "홀수"라고 출력하며,
    그 외 경우는 아무것도 출력되지 않게 하고자 한다.
 */
public class Pg_104_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("정수를 입력해주세요. ");
        i = sc.nextInt();
        if(i%2 != 0){
            System.out.println("홀수");
        }
        if(i%6 == 0) {
            System.out.println("6의 배수");
        }
    }
}
