package chap_04;

public class Pg_195_Book {
    //인스턴스 변수 생성
    String title;
    String author;

    //show 함수 생성
    //리턴 값이 없으므로 void 선언
    void show() {
        System.out.println(title + " " + author);
    }

    //생성자 생성. 매개변수가 없다면 호출이 된다.
    //this() 함수는 매개변수가 2개 있으므로, 해당 클래스에서 매개변수가 2개 들어가는
    //Pg_195_Book(String title, String author)가 호출된다.
    public Pg_195_Book(){
        this("", "");
        System.out.println("생성자 호출됨");
    }
    //매개변수가 1개 일때 호출되는 생성자.
    //생성자가 실행되면 매개변수가 2개인 생성자를 다시 호출하기에
    //Pg_195_Book(String title, String author) 생성자가 author이 "작자미상" 인 상태로 호출될 것이다.
    public Pg_195_Book(String title){
        this(title, "작자미상");
    }

    //매개변수의 값에 따라 인스턴스 변수의 값을 받는 생성자.
    public Pg_195_Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        //매개변수가 2개인 생성자가 호출이 된다. 인스턴스 변수는 어린왕자와 생텍쥐패리로 초기화 되었다
        Pg_195_Book littlePrince = new Pg_195_Book("어린왕자", "생텍쥐패리");

        //매개변수가 1개인 생성자가 호출된다. author 값은 없는채로 호출된다.
        Pg_195_Book loveStory = new Pg_195_Book("춘항전");

        //title 값과 author 값에 아무것도 들어가지 않은 채 println 을 출력하는 생성자가 호출된다.
        Pg_195_Book emptyBook = new Pg_195_Book();

        //void show() 함수가 실행이 될 것이다.
        loveStory.show();
    }
}
