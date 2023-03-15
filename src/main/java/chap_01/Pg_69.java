package chap_01;
public class Pg_69 {
    public static void main(String[] args) {

        double weight = 75.56;
        weight = weight + 5.0;      //기존에 75.56 이라는 값이 지정된 weight의 값이 5.0을 더한 겂으로 초기화 됨. (다시 지정됨.)
        System.out.println("무게는 " + weight);    //75.56 + 5.0 이 더해진 값이 최종 결과값으로 도출됨.

        int n = 15;     // 십진수 15
        int m = 015;    // 015는 8진수. 십진수로는 13
        int k = 0x15;   // 0x15는 16진수. 십진수로는 21
        int b = 0b0101; // 0b0101은 2진수. 십진수로는 5
        long g = 24l;   // 출력할때는 자동으로 int 타입으로 컴파일 되지만, 뒤에 L을 붙임으로써 g는 long 타입으로 강제됨.
        long h = 24L;   //대문자 L 소문자 l 의미는 같음.
        float f = 0.1234f;  // 실수는 자동으로 double 타입으로 컴파일 되지만, 뒤에 f를 붙임으로써 float 타입으로 강제됨.
        double e = 0.1234d; // d를 붙임으로써 double 타입으로 강제함.

        /*
        l 과 f 를 붙이는 이유는 다음과 같다.
        1. 정수의 기본 변수 저장은 int 로 되고, 실수의 기본 변수 저장은 double 로 된다.
        2. 크기가 다른 두 수가 허용할 수 없는 범위로 저장이 되기 때문에 허용이 안되어서 오류가 나는 것.
        3. 그렇기 때문에 l를 붙임으로써 long 으로 저장이 되게 하고, f 를 붙임으로써 float으로 저장이 되게 바꾸는 것이다.
         */

        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        System.out.println(b);
        System.out.println(g);
        System.out.println(h);
        System.out.println(f);
        System.out.println(e);

        System.out.println();

        boolean a = 10 < 0;     // 참과 거짓을 나타내는 데이터타입인 boolean.
        boolean A = 10 > 0;     // 참일 경우 true. 거짓일 경우 false 를 값으로 도출한다.

        System.out.println(a);     // 거짓이기에 false
        System.out.println(A);     // 참이기에 true.
        /*
        boolean 은 on / off 일때 많이 쓰인다.
        2가지 (true, false) 만을 나타내기에 while 문이나 for문, if 문에 많이 쓰인다.
         */

        System.out.println();

        char z = 'Z';
        char t = '티';
        char w;
        w = 'W';
        System.out.println(z);
        System.out.println(t);
        System.out.println(w);
    }
}
