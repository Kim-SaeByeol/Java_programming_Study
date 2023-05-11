package Exercise;
//369 게임
public class Pg_164_13_re {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int a = i / 10;
            int b = i % 10;
            if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
                System.out.println(i + "박수 짝짝");
            } else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 || b != 9)) {
                System.out.println(i + "박수 짝");
            } else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 || b == 9)) {
                System.out.println(i + "박수 짝");
            }
        }
    }
}
