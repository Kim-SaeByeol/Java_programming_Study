package chap_04;

public class Pg_192_Circle {
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

        Pg_192_Circle donut = new Pg_192_Circle();
        System.out.println(donut.getArea());
    }
}
