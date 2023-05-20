package chap_04;

import java.util.Scanner;

public class Pg_185_RectApp {
    public static void main(String[] args) {
        Pg_185_Rectangle rect = new Pg_185_Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        rect.height = sc.nextInt();
        rect.width = sc.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());
        sc.close();
    }
}
