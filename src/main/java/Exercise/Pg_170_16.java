package Exercise;

import java.util.Scanner;

public class Pg_170_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        for(; ;){
        System.out.print("가위 바위 보! >>");
        String values = sc.next();

        int user = 0;
        if(values.equals("가위")){
            user = 0;
        } else if (values.equals("바위")) {
            user = 1;
        } else if (values.equals("보")) {
            user = 2;
        } else if (values.equals("그만")) {
            System.out.println("종료합니다.");
            break;
        } else {
            System.out.println("다시 입력해주세요.");
            continue;
        }

        String str[] = {"가위", "바위", "보"};
        int n = (int)(Math.random()*3);

        if(user == n){
            values = "비겼습니다.";
        } else if ( (user == 0 && n == 1) || (user == 1 && n == 2) || (user == 2 && n == 0) ) {
            values = "컴퓨터가 이겼습니다.";
        } else if ( (n == 0 && user == 1) || (n == 1 && user == 2) || (n == 2 && user == 0) ) {
            values = "사용자가 이겼습니다.";
        }
        System.out.println("사용자 = " + str[user] + ", 컴퓨터 = " + str[n] + ", " + values);
            System.out.println("그만 두고 싶으시다면 \"그만\" 을 입력해주세요.");
        }
        sc.close();
    }
}
