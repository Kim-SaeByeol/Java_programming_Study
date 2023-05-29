package chap_04;

public class Pg_212_GarbegeEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;

        a = null;
        d = c;
        c = null;

        /*
        코드 실행 전)
        a b c 에는 각각의 String 값에 Good, Bad, Normal 값이 입력되고,
        d e 는 메모리에 선언되지 않았기에 주소만 할당 받고 값은 없다.

        코드 실행 후)
        a의 값이 null 값으로 초기화 되어 가비지가 발생하고,
        b의 경우 아무런 초기화 없이 값이 입력.
        c의 경우 d 의 값에 c의 값을 넣고서 c가 null 값이 되었기에 c는 가비지가 발생한다.
        d의 경우 c의 값으로 초기화 되어 c의 값인 Normal이 입력되었다.
        e의 경우 메모리에 선언 없이 변수 이름만 선언되어 메모리에 주소만 가지고 있고 값은 없다.
         */
    }
}
