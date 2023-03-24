package chap_02;
import java.util.Scanner;
public class Pg_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.print("점수를 입력하세요 (0~100): ");
        int score = sc.nextInt();
        switch (score / 10) {               //스코어의 입력 값에서 case 로의 범위를 설정함.
            case 10:            //100
            case 9:             //90~99
                grade = 'A';
                break;          //break 값을 넣어야 스위치가 작동을 멈추고 스위치 문을 벗어남. 안 쓰면 계속 내려감.
            case 8:             //80~89
                grade = 'B';
                break;
            case 7:             //70 ~ 79
                grade = 'C';
                break;
            case 6:             // 60 ~ 69
                grade = 'D';
                break;
            default:            // 59 이하
                grade = 'F';
        }
        System.out.println("학점은 "+ grade + "입니다.");
        sc.close();
    }
}
