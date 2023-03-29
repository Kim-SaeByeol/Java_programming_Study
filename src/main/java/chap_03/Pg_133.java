package chap_03;

import java.util.Scanner;

public class Pg_133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intArray[] = new int[5];    //인트 형식의 변수 5개를 하나의 배열로 선언.
        int max = 0;        //변수 선언
        System.out.println("양수 5개를 입력하시오.");
        for (int i = 0; i < 5; i++) {
            intArray[i] = sc.nextInt();     //Scanner를 5번 실행.
            if (intArray[i] > max)      //intArray의 변수 중 가장 큰 값을 max 에 저장.
                max = intArray[i];
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
        sc.close();
    }
}
