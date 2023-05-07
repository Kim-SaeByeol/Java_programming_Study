package OpenChallenge;

import java.util.Scanner;

public class OpenChallenge_Pg_159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100);
        System.out.println(answer);
        System.out.println("수를 결정하였습니다. 맞추어보세요.");
        for (int i = 0; ; i++) {
            System.out.println(i + ">> ");
            int num = sc.nextInt();

            if (num > answer) {
                System.out.println("더 낮게");
            } else if (num < answer) {
                System.out.println("더 높게");
            } else if (num == answer) {
                System.out.println("맞았습니다. 정답은 : " + answer + " 입니다.");
                System.out.println("다시 하시겠습니까? : (y/n) 입력");
                String check = sc.next();
                if (check.equals("y")) {
                    answer = (int) (Math.random() * 100) + 1;
                    i = 0;
                    System.out.println("수를 재결정하였습니다. 맞추어보세요.");
                } else {
                    System.out.println("종료하겠습니다.");
                    break;
                }
            }
        }
    }
}
