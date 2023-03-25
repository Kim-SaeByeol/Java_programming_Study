package chap_02;

public class Pg_122 {
    public static void main(String[] args) {
        char c = 'a';
        do {
            System.out.print(c);
            c = (char) (c+1);
        }
        while (c <= 'z');
    }
}
