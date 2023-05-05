package chap_03;

import java.util.Scanner;

/*
예외처리란
컴파일 오류로 걸러지지 않고
예기치 못한 상황(String 인데 int 를 넣는 등)에 의해 오작동이나 결과에 악 영향을 끼치는 상황이다.
ex)
정수를 0으로 나누는 경우
배열의 크기보다 큰 인덱스에 값을 넣으려는 경우
존재하지 않는 파일을 읽으려는 경우
받고자 하는 입력 데이터 타입이 아닌 다른 데이터 타입을 입력하는 경우

예외처리와 실행시간 오류에 대한 관계.
[예외]는 사용자 프로그램에서 try-catch 블록을 이용하여 제어가 가능하지만,

[실행시간 오류]는 반복문이 무한루프가 되거나 recursion을 제어하는 코드가 잘못 작성되어
스택 오버플로 현상이 발생해 JVM(자바가상머신)의 메모리가 부족할때 까지 실행되는 등의
예측이 쉽지 않고 사용자가 강제로 종료하지 않는 이상 실행이 안 끝나는 제어가 불가능한 상태이다.

try-catch 문
try {   ==> 예외가 발생할거 같은 블록
    예외가 발생할 가능성이 있는 실행문(try문)
}
catch (처리할 예외 타입 선언) {  ==> 예외가 발생할 경우 처리할 블록
    예외 처리문(catch블록)
}
finally { ==> 예외가 발생하든 발생 안하든 실행되는 블록 [생략 가능], 보통 안 쓴다.
    예외 발생 여부 상관 없이 무조건 실행되는 문장(finally문)
}

대표적인 예외 타입
NullPointerException : 참조 변수가 null 값을 가지고 있을 때 발생하는 예외
ArrayIndexOutOfBoundsException : 배열 인덱스 범위를 벗어난 접근 시 발생하는 예외
ClassNotFoundException : 클래스를 찾을 수 없을 때 발생하는 예외
FileNotFoundException : 파일을 찾을 수 없을 때 발생하는 예외
IOException : 입출력 작업 시 발생하는 예외입
ArithmeticException : 산술 연산 시 발생하는 예외 (예: 0으로 나누기)
ClassCastException : 객체의 타입 변환 시 발생하는 예외
IllegalArgumentException : 잘못된 인수가 전달될 때 발생하는 예외
InterruptedException : 쓰레드가 인터럽트될 때 발생하는 예외
UnsupportedOperationException : 지원되지 않는 작업을 수행하려고 할 때 발생하는 예외
 */
public class Pg_151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend;
        int divisor;
        try {

            System.out.print("나뉨수를 입력하시오. : ");
            dividend = sc.nextInt();
            System.out.print("나눗수를 입력하시오 : ");
            divisor = sc.nextInt();
            System.out.println(dividend + "를 " + divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
        }
        // 산술 연산시 발생하는 오류로, 해당 try문에서 0으로 나누면 나오기 때문에 작성했다.
        // ArithmeticException 예외 타입이 나올 경우 a 변수에 예외 정보가 넘어온다.
        catch (ArithmeticException a){
            System.out.println(a + " 오류 발생. 발생 이유 : 나눗수에 0 을 입력하셨습니다.");
        }


        sc.close();

    }
}
