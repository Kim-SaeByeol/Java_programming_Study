package chap_02;
import sun.java2d.opengl.OGLRenderQueue;

import java.util.Scanner;           //java.util에 위치한 스캐너를 사용한다고 선언하는 선언문이다.
public class Pg_95_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //System.in 으로 입력을 받아들인다는 뜻인다.

        System.out.print("점수를 입력하시오.");
        int score = sc.nextInt();                   //받아들인 입력의 값을 score 변수에 저장한다.
        {
            if (score >= 80) {                      //입력 받은 값이 80보다 크거나 같으면 true.
                System.out.println("축하합니다! 합격입니다.");
            }
            else {                                  //입력 받은 값이 80보다 작다면 false.
                System.out.println("아쉽게도, 불합격입니다.");
            }
        }
        System.out.println("------------------------------------------- 아래는 Pg_97");
        {
            System.out.print("수를 입력하세요.");
            int number = sc.nextInt();              //입력 받은 값을 number 에 저장한다.
            if (number % 3 == 0) {                  // 나머지 값이 0이라면 true.
                System.out.println(number + "는 3의 배수입니다.");
            }
            else {                                  // 나머지 값이 있다면 false.
                System.out.println(number + "는 3의 배수가 아닙니다.");
             }
            }
        System.out.println("------------------------------------------------아래는 Pg_98");
        {
            char grade;

            System.out.print("점수를 입력하세요 (0 ~ 100): ");
            int score1 = sc.nextInt();
            if (score1 >= 90) {
                grade = 'A';
            }
            else if(score1 >= 80) {
                grade = 'B';
            }
            else if(score1 >= 70) {
                grade = 'C';
            } else if (score1 >= 60) {
                grade = 'D';
            }
            else
                grade = 'F';
            System.out.println("학점은 " + grade + "입니다.");
        }
        System.out.println("-----------------------------------------------아래는 Pg_99");
        System.out.print("점수를 입력하세요 (0 ~ 100): ");
        int score3 = sc.nextInt();
        System.out.print("학년을 입력하세요 (1~4)");
        int year = sc.nextInt();

        if (score3 >= 60) {
            if (year != 4)
                System.out.println("합격!");
            else if (score3 >= 70) {
                System.out.println("합격!");
            } else {
                System.out.println("불합격!");
            }
        }
        else
            System.out.println("불합격!");
        sc.close();
    }
}
