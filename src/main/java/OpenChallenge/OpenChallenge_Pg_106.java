package OpenChallenge;

import java.util.Scanner;

public class OpenChallenge_Pg_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에 선택해주세요 : (가위, 바위, 보) 입력");

        // 철수
        System.out.print("철수 >> ");
        String man = sc.next();

        //영희
        System.out.print("영희 >> ");
        String girl = sc.next();

        if ((man.equals("가위") && girl.equals("가위")) || (man.equals("바위") && girl.equals("바위")) || (man.equals("보") && girl.equals("보"))) {
            System.out.println("비겼습니다.");
        } else if ((man.equals("가위") && girl.equals("보")) || (man.equals("바위") && girl.equals("가위")) || (man.equals("보") && girl.equals("바위"))) {
            System.out.println("철수가 이겼습니다." + "철수 : " + man + " 영희 : " + girl);
        } else if ((man.equals("가위") && girl.equals("바위")) || (man.equals("바위") && girl.equals("보")) || (man.equals("보") && girl.equals("가위"))) {
            System.out.println("영희가 이겼습니다. " + "철수 : " + man + "/ 영희 : " + girl);
        }
    }
}
