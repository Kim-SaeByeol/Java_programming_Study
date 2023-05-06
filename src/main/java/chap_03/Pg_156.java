package chap_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pg_156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum=0, num=0;
        //3회 반복.
        for(int i = 0; i<3; i++){
            System.out.print(i + ">>");
            try {
                num = sc.nextInt();
            }
            //만일 정수 입력이 아닐 경우 실행
            catch (InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                //정수가 아닌 값을 입력한 그 입력 값을 지움.
                sc.next();
                //i--를 하여 인덱스가 증가하지 않도록 미리 감소
                i--;
                // 다음 루프로
                continue;
            }
            sum += num;
        }
        System.out.println("합은 " + sum);
        sc.close();
    }
}
