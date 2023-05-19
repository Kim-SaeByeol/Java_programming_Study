package chap_04;

public class Pg_187_Circle {
    //인스턴스 변수 선언
    int radius;
    String name;

    //매개변수가 없는 생성자.
    //호출 시 radius 와 name의 값이 들어간다.
    public Pg_187_Circle() {
        radius = 1;
        name = "";
    }

    //매개변수가 있는 생성자
    // 매개변수에 지정한 값이 인스턴스 변수의 값이 된다.
    //같은 이름의 클래스 함수이지만 매개변수에 들어가는 값에 따라 실행이 다르게 되믄 오버로딩 이다.
    public Pg_187_Circle(int r, String n){
        radius = r;
        name = n;
    }


    //getArea() 메소드를 호출하면 인스턴스변수에 들어간 값들이 리턴되어 원의 넓이로 반환된다.
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        //매개변수를 넣으면서 생성자를 선언한다.
        //인스턴스 변수에 10과 "자바피자" 가 입력되었다.
        Pg_187_Circle pizza = new Pg_187_Circle(10, "자바피자");

        //getArea() 메소드를 호출하여 리턴 값을 받는다.
        //리턴 값은 원의 넓이 이기에 10 * 10 * 3.14 가 리턴되어 결과값으로 반환된다.
        double area = pizza.getArea();
        //pizza.name 은 Pg_187_Cricle 의 매개변수 name 의 값이다.
        //생성자를 선언하면서 매개변수에 "자바피자"를 입력하였기에 "자바피자"가 출력된다.
        System.out.println(pizza.name + "의 면적은 " + area);

        //생성자를 다시 한번 선언한다.
        //이번에는 매개변수가 없는 생성자이다.
        //해당 함수는 실행되면 radius 를 1로, name 을 "" 로 저장한다.
        Pg_187_Circle donut = new Pg_187_Circle();

        //인스턴스 변수에 "도넛피자" 가 저장되었다.
        donut.name = "도넛피자";

        //radius 는 1 이므로 1*1*3.14 가 리턴 값으로 반환된다.
        area = donut.getArea();

        // 도넛피자 와 3.14 가 출력된다.
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
