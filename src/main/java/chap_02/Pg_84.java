package chap_02;

public class Pg_84 {
    public static void main(String[] args) {
        int a=3, b=3, c=3;
        a += 3;     // a = a+3. 를 뜻하는 수식. 현재 a = 3 이기에 다음 줄로 넘어면 a = 3+3 이 된다.
        b *= 3;     // b = b * 3 을 뜻하는 수식.     b = 3 * 3 . b = 9.
        c %= 2;     // c = c % 2 를 뜻하는 수식.     c = 3 % 2 . c = 1.

        // = 앞에 부호는 우선으로 해주고 값을 매긴다는 의미이다. a += d 는 a = a+d 라는 의미. a 는 다시 초기화 되며 값을 받게 된다.

        System.out.println("a=" + a + ", b=" + b + ", c=" + c);     // a = 6, b = 9, c = 1

        int d = 3;
        a = d++;    //d++ 는 계산이 된 후에 +1을 한다는 의미이다. a = 3의 결과가 나오면 d = d+1 으로 d = 3+1 =4 가 된다.
        System.out.println("a=" + a + ", d=" + d);  //a = 3 , d = 4.
        a = ++d;    //++d 는 1+d 를 우선적으로 한다는 의미이다. 현재 d = 4 이므로 ++d = 5. a = d = 5 이다.
        System.out.println("a=" + a + ", d=" + d);  // a = 5 , d = 5.
        a = d--;    //d-- 는 이후에 -1을 한다는 의미이다. d=5 인 시점에서 d-- 이기에 a = d = 5, d = d-1 = 5-1 = 4.
        System.out.println("a=" + a + ", d=" + d);  // a= 5 , d = 4
        a = --d;    //--d 는 우선 -1을 한다는 의미이다. d=4인 시점이기에 --d = d-1 = 4-1 = 3. d=3. a=3 이다.
        System.out.println("a=" + a + ", d= " +d);  // a = 3 d = 3

        // 항상 기억하자. d++ , d-- 는 계산 이후에 값이 증가,감소 하는 것이고 ++d, --d 는 우선적으로 값이 증가, 감소 하고 계산하는 것이다.
    }
}
