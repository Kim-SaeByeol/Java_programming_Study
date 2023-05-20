package chap_04;

public class Pg_189_Book {
    String title;
    String author;

    //Book 생성자 생성
    //생성자의 이름은 클래스의 이름과 같아야한다.
    public Pg_189_Book(String t){
        title = t;
        author = "작자미상";
    }
    //오버로딩
    //같은 이름의 생성자를 매개변수를 다르게 하여
    //여러개 생성하는 것이 가능하다.
    //대표적 예시는 println()
    public Pg_189_Book(String t, String a){
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        //매개변수 Sring이 2개인 생성자에 값이 들어가
        //생성자의 함수가 실행된다.
        Pg_189_Book littlePrince = new Pg_189_Book("어린왕자", "생텍쥐페리");

        //매개변수 String이 1개인 생성자에 값이 들어가
        //생성자의 함수가 실행된다.
        Pg_189_Book loveStrory = new Pg_189_Book("춘향전");

        //title 은 어린왕자, author 은 생텍쥐페리의 변수값이 들어갔다.
        System.out.println(littlePrince.title + " " + littlePrince.author);

        //title 에는 춘향전이 생성자 생성과 함께 들어갔고,
        //author 은 생성자가 실행되면서 작자미상이 메모리에 올라갔다.
        System.out.println(loveStrory.title + " " + loveStrory.author);
    }
}
