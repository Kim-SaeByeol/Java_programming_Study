package chap_04;

public class Pg_183_Cricle {
    int radius;
    String name;

    public Pg_183_Cricle() {

    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public static void main(String[] args){
        Pg_183_Cricle pizza = new Pg_183_Cricle();
        pizza.radius = 10;
        pizza.name = "자바피자";

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Pg_183_Cricle donut = new Pg_183_Cricle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+ "의 면적은 " + area);
    }
}
