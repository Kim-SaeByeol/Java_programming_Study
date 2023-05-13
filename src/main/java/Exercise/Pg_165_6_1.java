package Exercise;

import java.util.Scanner;

public class Pg_165_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();

        for(int i=0;i<unit.length;i++) {
            int zero_number = money/unit[i];

            if(zero_number!=0) {
                System.out.printf("%d원 짜리 : %d개\n", unit[i], zero_number);
                money = money%unit[i];
            }
        }
    }
}