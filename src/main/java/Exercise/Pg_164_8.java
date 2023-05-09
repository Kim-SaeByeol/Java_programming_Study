package Exercise;

import java.util.Scanner;

public class Pg_164_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개? : ");
        int num = sc.nextInt();
        for(int i = 0; i< num; i++){
            if(i % 10 == 0)
                System.out.println();
            System.out.print((int)(Math.random()*num+1)+ " ");
        }
    }
}
