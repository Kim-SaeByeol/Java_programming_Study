package Exercise;

import java.util.Scanner;

public class Pg_164_6_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int count[] = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("금액을 입력하시오 >> ");
        int num = sc.nextInt();
        count[0] = num / 50000;
        count[1] = (num % 50000) / 10000;
        count[2] = num % 50000 % 10000 / 1000;
        count[3] = num % 50000 % 10000 % 1000 / 500;
        count[4] = num % 50000 % 10000 % 1000 % 500 / 100;
        count[5] = num % 50000 % 10000 % 1000 % 500 % 100 / 50;
        count[6] = num % 50000 % 10000 % 1000 % 500 % 100 % 50 / 10;
        count[7] = num % 50000 % 10000 % 1000 % 500 % 100 % 50 % 10 / 1;

        for(int i = 0; i < unit.length; i++){
            if(count[i] != 0){
                System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
            }
        }
    }
}
