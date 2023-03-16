package chap_02;

public class Pg_86 {
    public static void main(String[] args) {
        // 비교 연산 (< , > , <= , >= , ==, != )
        System.out.println('문' > '자');      //false. 문자는 비교 연산 불가
        System.out.println(3 >= 2);          //true.
        System.out.println(-1 < 0);          //true. 정수 비교연산.
        System.out.println(3.45 <= 2);      //false. 실수 와 정수의 비교연산 이므로, 정수가 자동으로 실수로 인식되어 연산된다.
        System.out.println(3 == 2);         //false. == 는 서로 같다는 뜻이다. 3==2 는 다르므로 false.
        System.out.println(3 != 2);         //true. != 는 서로 다르다는 뜻이다. 3 = 2가 아니므로 true.

        //논리 연산 (!a)
        System.out.println(!(3 != 2));       //false. 항상 괄호 안 부터 풀기 때문에 3 !=2 는 true 인 상태이기에 !(true) 는 false 가 된다.

        //비교 연산과 논리 연산 복합 (&& 와 || 는 논리연산 이지만 비교연산(true, false의 값)의 값이 있어야 하기에 복합하여 사용한다.)
        System.out.println((3 > 2) && (3 > 4));     //&& 는 and 라는 뜻이다. 둘다 true 이여야 true 값이 나오기 때문에, ture && false 는 서로가 달라 false 가 나온다.
        System.out.println((true) && (false));      // flase.
        System.out.println((true) && (true));       // true. 둘다 true 이기 때문이다.
        System.out.println((false) && (false));     // fales.

        System.out.println((3 != 2) || (-1 > 0));   //|| 는 or 이라는 뜻이다. and 와는 반대로 둘다 false 일 경우에만 false. true 가 하나라도 있다면 true 이다.
        System.out.println((true) || (true));       // or 의 뜻은 '또는' 이라는 뜻으로 하나라도 진실이라면 진실로 생각한다.
        System.out.println((true) || (false));      // true 가 있기에 ture.
        System.out.println((false) || (false));     //둘다 false 이기에 false.

        System.out.println("--------------------------------------------------");
        //Pg_87
        int a = 3, b = 5;

        //조건 연산. ( condition ? opr2 : opr3. )
        //만약 condition 의 값이 true 일 경우 opr2 의 값이 되며, false 일 경우 op3 의 값이 된다.
        //opr2 와 opr3 에 들어가는 값은 '식이 될 수도 있고, 값이 될 수도 있다'.
        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));       //a>d 는 3>5. 즉 false 이므로 opr3 에 해당하는 b-a 가 값이 된다. 5 - 3 = 2. 두 수의 차는 2가 된다.


    }
}
