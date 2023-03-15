package chap_01;

import java.sql.SQLOutput;

public class Pg_24 {
    public static int sum(int i, int j){
        /*
        값을 지정하는 함수, 즉 메소드
        sum(int n, int m)은 sum() 메소드를 호출한 것으로, n과 m을 각각 변수로 지정하여 매개변수로써 활용한다.
        */
        return i + j;   // i와 j의 합을 리턴.
    }
    public static void main(String[] args) {
    //main() 메소드. 항상 public static void 타입으로 선언
        int i; // 데이터타입 int의 i라는 변수선언. int 는 정수 만을 나타낼 수 있음.
        int j; // 마찬가지.
        char a; // 데이터타입 char의 a 라는 변수 선언. char 는 문자임 ''.
        String b; //데이터타입 String의 b 라는 변수 선언. String 은 문자열. ""
        final int TEN = 10; // final 은 바꿀 수 없다고 선언한 것과 마찬가지. TEN 이라는 변수는 10 이라고 명확하게 지정함.
        i = 1; // int i = 1.
        j = sum(i, TEN); //sum()메소드 를 가져와 리턴값을 올림. 현재 i = 1 이며, TEN = 10 이기에 return i + j 로 올라가 1 + 10이 됨.
        a = '?';    //''를 쓴 이유는 데이터티입 char이 문자 이기에, a = '?'.
        b = "Hello";    //"" 를 쓴 이유는 데이터타입 String이 문자열 이기에.
        System.out.println(a);  // '?' 출력
        System.out.println(b);  // "Hello" 출력
        System.out.println(TEN); // 10 출력
        System.out.println(j); // 11 출력
    }
}
