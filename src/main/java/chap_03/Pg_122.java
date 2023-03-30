package chap_03;

public class Pg_122 {
    public static void main(String[] args) {
        char c = 'a';       // c 는 문자 a 이다.
        do {
            System.out.print(c);    // c 출력
            c = (char) (c+1);       // 아스키코드로 변환 하여 c+1 을 한 후 char 로 다시 전환 하여 초기화.
        }
        while (c <= 'z');       //z 가 될떄 까지 반복.

    }
}
