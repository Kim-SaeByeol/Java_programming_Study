package chap_03;

public class Pg_123 {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {      // 9번 반복
            for (int j = 1; j < 10; j++) {  //9번 반복
                System.out.print(i + "*" + j + "=" + i * j);    // 1의 값이 변할때 마다 j 가 1~9 까지 출력.
                System.out.print('\t');     //tab
            }
            System.out.println();

        }
    }
}
