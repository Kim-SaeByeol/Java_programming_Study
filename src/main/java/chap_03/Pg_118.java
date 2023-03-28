package chap_03;

public class Pg_118 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<= 10; i++){        //10번 반복
            sum += i;       //sum 은 i의 변한 값을 모두 더함.
            System.out.print(i);
            if(i<=9){       // 1 ~ 9 사이에 +를 붙입니다.
                System.out.print("+");
            }else {
                System.out.print("=");      //10까지 오면 = 을 붙인다.
                System.out.print(sum);      //1~10 까지 더 한 값을 출력한다.
            }
        }
    }
}
