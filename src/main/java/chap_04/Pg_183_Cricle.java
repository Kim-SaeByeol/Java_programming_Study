package chap_04;

public class Pg_183_Cricle {
    //인스턴스 변수 선언.
    //static 을 박지 않으면 메모리에 올라가지 않기 때문에 인스턴스 변수
    // static 을 참조할 경우 메모리에 즉시 올라가있기 때문에 전역변수 즉, 클래스 변수가 된다.
    int radius;
    String name;

    //getArea 를 호출할 시 return 값으로 원의 넓이를 반환한다.
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args){
        //Pg_183_Cricle 클래스를 참조하기 위해 생성자를 생성하였다.
        Pg_183_Cricle pizza = new Pg_183_Cricle();
        //Pg_183_Cricle 클래스의 인스턴스 변수에 값을 지정한다.
        pizza.radius = 10;
        pizza.name = "자바피자";

        //Pg_183_Cricle 클래스의 getArea() 메소드를 호출하여 area에 return 값을 저장한다.
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        //마찬가지로 생성자를 생성하였다.
        Pg_183_Cricle donut = new Pg_183_Cricle();

        //인스턴스 변수에 새로운 값을 지정한다.
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+ "의 면적은 " + area);
    }
}
