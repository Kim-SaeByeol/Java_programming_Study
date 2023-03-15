package chap_01;

public class Pg_72 {
    public static void main(String[] args) {
        int radius;             // 변수로 지정할때는 글자의 길이는 상관이 없다.
        String c1, c2, c3;      //변수는 동시에 선언이 가능하다.

        final double PI = 3.14159265358979;     //final 을 통해 PI 는 원주율 pi 임을 확실히 했다.

        radius = 10;
        c1 = "원의 지름 = ";
        c2 = "원의 둘레 = ";
        c3 = "원의 넓이 = ";
        double circleArea = radius * radius * PI;       // 결과값이 double 로 표현이 가능한 실수 이기에 공식으로 지정이 가능하다.


        System.out.println("반지름이 10인 원의 지름, 둘레, 넓이를 구해보자.");
        System.out.println(c1 + radius * 2);                //원의 지름 공식은 2pi
        System.out.println(c2 + 2 * PI * radius );          //원의 둘레 공식은 2pir
        System.out.println(c3 + circleArea);      // 원의 넓이 공식은 pi * r * r

    }
}
