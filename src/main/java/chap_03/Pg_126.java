package chap_03;

import java.util.Scanner;

public class Pg_126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료합니다.");
        while (true) {          //무한 반복
            System.out.print(">>");
            String text = sc.nextLine();
            if(text.equals("exit"))     //text.equals()는 () 안에 문자열이 입력되면 true 값을 리턴. 즉슨, exit 를 입력시 if 가 실행됨.
                break;      //반복문을 벗어남.
        }
        System.out.println("종료합니다...");
        sc.close();
    }
}
