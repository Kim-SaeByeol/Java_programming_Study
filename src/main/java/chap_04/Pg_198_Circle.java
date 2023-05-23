package chap_04;

public class Pg_198_Circle {
    int radius;
    public Pg_198_Circle(int radius){
        this.radius = radius;
    }
    public void set(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        Pg_198_Circle ob1 = new Pg_198_Circle(1);
        Pg_198_Circle ob2 = new Pg_198_Circle(2);
        Pg_198_Circle s;

        s = ob2;
        ob1 = ob2;
        System.out.println("ob1.radius= " + ob1.radius);
        System.out.println("ob2.radius= " + ob2.radius);

    }

}
