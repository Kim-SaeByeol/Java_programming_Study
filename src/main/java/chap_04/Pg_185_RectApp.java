package chap_04;

import java.util.Scanner;

//default 가 기본값이기에 클래스 앞에 접근제어자를 선언하지 않아도 된다.
// 클래스 생성.
class Pg_185_Rectangle{
    //인스턴스 변수를 생성한다.
    //호출이 되지 않는다면 메모리에 올라가지 않는다.
    int width;
    int heigh;

    //getArea() 메소드를 호출 시 리턴 값을 반환한다.
    public int getArea(){
        return width * heigh;
    }
}
public class Pg_185_RectApp {
    public static void main(String[] args) {
        //클래스를 참조하기 위해 생성자를 선언한다.
        Pg_185_Rectangle rect = new Pg_185_Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");
        //인스턴스 변수에 값을 지정해준다.
        //변수에 값을 넣었기에 인스턴스 변수는 메모리에 올라간다.
        rect.width = sc.nextInt();
        rect.heigh = sc.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());
        sc.close();
    }
}
