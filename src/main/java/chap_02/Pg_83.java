package chap_02;

import java.util.Scanner;       //Scanner 를 사용하기 위한 선언문. Scanner 의 위치를 알려준다.

public class Pg_83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //Scanner 를 객체변수로 바꾸었다.

        System.out.println("정수를 입력해주세요.");
        int time, second, minute, hour;
        time = scanner.nextInt();                       // 스캐너로 입력 받은 값을 time 변수에 저장한다.
        second = time % 60;                             //나머지만을 구하는 수식인 %를 사용함으로써, 몇초인지 나타낸다.
        minute = (time / 60) % 60;
        hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.println(second + "초 입니다.");
        scanner.close();
    }
}
