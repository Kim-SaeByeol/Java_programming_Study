package chap_04;

public class Pg_192_Circle {
    //하나의 클래스에는 반드시 생성자가 하나 이상 존재해야함
    //자바에서는 아무 생성자를 생성하지 않아도 기본적으로 눈에 보이지 않지만 기본 생성자를 자동으로 생성함.
    //하지만 이는, 클래스에 하나라도 생성자가 없을 경우 자동으로 생성하는 것이기에 하나라도 생성자가 있다면 자동으로 생성하지 않음.
    int radius;
    void set(int r){
        radius = r;
    }
    double getArea(){
        return 3.14*radius*radius;
    }

    public Pg_192_Circle(int r){
        radius = r;
    }

    public static void main(String[] args) {
        Pg_192_Circle pizza = new Pg_192_Circle(10);
        System.out.println(pizza.getArea());

        //Pg_192_Circle 클래스에는 현재 Pg_192_Circle(int r) 이라는 생성자가 있기에
        //자동적으로 생성자가 만들어지지 않아, 생성자가 없는 Pg_192_Circle() 는 오류가 발생함.
//        Pg_192_Circle donut = new Pg_192_Circle();
//        System.out.println(donut.getArea());
    }
}
