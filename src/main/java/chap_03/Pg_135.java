package chap_03;

import java.util.Scanner;

public class Pg_135 {
    public static void main(String[] args) {
        int intArray[] = new int[5];        //intArray 라는 5칸의 배열 생성.
        int sum = 0;        //sum은 0이라고 메모리에 선언.

        Scanner sc = new Scanner(System.in);
        System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
        for (int i =0; i < intArray.length; i++){       //배열 갯수 만큼 실행. 배열은 5개임.
            intArray[i] = sc.nextInt();     //입력한 정수를 배열에 intArray[0] intArray[1] intArray[2] intArray[3] intArray[4] 순서로 넣습니다.
        }
        for (int i = 0; i < intArray.length; i++){      //배열 갯수 만큼 실행. 즉 5번.
            sum += intArray[i];     // i 는 0 1 2 3 4 로 바뀜으로 모든 배열의 변수 값을 sum에 합한다.
        }
        System.out.print("평균은 " + (double)sum/intArray.length);     //모든 더한 값에 배열의 갯수 만큼 나눈다. 평균은 실수 이므로 double 로 강제변환 하였다.
        sc.close();
    }
}
