package chap_02;
//자바 프로그래밍 기본 구조
public class Pg_58 {        //{  }는 class Pg_58 의 클래스 영역.
    public static int sum(int n, int m){        //{  }는 sum() 메소드 영역.
        return n + m;
    }
    public static void main(String[] args) {        // { }는 main() 메소드 영역.
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);     //sum() 메소드 호출. i는 int i 를 호출한 것임. 메소드를 호출 하였기에 리턴값으로 11이 도출됨.
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
