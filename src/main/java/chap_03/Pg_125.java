package chap_03;

import java.util.Scanner;

public class Pg_125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요. ");
        int sum = 0;
        for(int i =0; i<5; i++){        //5번 반복
            int n = sc.nextInt();
            if(n <= 0){
                continue;       //continue는 반복문을 벗어나지 않고 다음 반복으로 넘어가게 한다. 음수, 0의 정수 이면 무시하고 다시 반복.
            }else {
                sum += n;       // 정수의 값을 모두 더하고 초기화 한다.
            }
        }
        System.out.println("양수의 합은 " + sum);     //정수의 값을 모두 더한 sum 을 출력한다.
        sc.close();
    }
}
