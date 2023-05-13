package Exercise;

public class Pg_161_13 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            //십의 자리
            int a = i / 10;
            //일의 자리
            int b = i % 10;

            //일의 자리와 십의 자리가 3의 배수일 경우 짝짝
            if (a > 0 && a % 3 == 0 && b > 0 && b % 3 == 0) {
                System.out.println(i + "짝짝");
            }//일의 자리가 3의 배수일 경우 짝
            else if (b > 0 && b % 3 == 0) {
                System.out.println(i + "짝");

            }//십의 자리가 3의 배수일 경우 짝
            else if (a > 0 && a % 3 == 0) {
                System.out.println(i + "짝");
            }
        }
    }
}
