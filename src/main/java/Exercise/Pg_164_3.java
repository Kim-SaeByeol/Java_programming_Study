package Exercise;

import java.util.Scanner;

public class Pg_164_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오>> ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
