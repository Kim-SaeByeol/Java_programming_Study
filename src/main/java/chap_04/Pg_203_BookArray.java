package chap_04;

import java.util.Scanner;

public class Pg_203_BookArray {
    public static void main(String[] args) {
        Pg_203_Book book[] = new Pg_203_Book[2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < book.length; i++){
            System.out.println("제목 >> ");
            String title = sc.nextLine();
            System.out.println("저자 >> ");
            String author = sc.nextLine();
            book[i] = new Pg_203_Book(title, author);
        }
        for (int i = 0; i < book.length; i++){
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
        }
        sc.close();
    }
}
