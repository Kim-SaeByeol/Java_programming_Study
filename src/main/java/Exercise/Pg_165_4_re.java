package Exercise;

import java.util.Scanner;

public class Pg_165_4_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
        String st = sc.next();
        char ch = st.charAt(0);
        for(int i = ch; i >= 'a'; i--){
            for(int j = 'a'; j <= i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
