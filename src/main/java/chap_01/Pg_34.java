package chap_01;
public class Pg_34 {
    public static int sum(int i, int j){
        return i + j;
     }
    public static void main(String[] args){
        int i;  //sum() 메소드에서 쓰인 int i 와 int j는 main() 메소드에서 선언한 것이 아니기에 다시 선언함.
        int j;
        char a;
        String b;
        final int TEN = 10;

        i = 1;
        j = sum(i, TEN);
        a = '?';
        b = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(TEN);
        System.out.println(j);
    }
}
