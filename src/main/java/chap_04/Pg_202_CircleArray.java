package chap_04;

public class Pg_202_CircleArray {
    public static void main(String[] args) {
        Pg_202_Circle[] c = new Pg_202_Circle[5];

        for(int i = 0; i < c.length; i++){
            c[i] = new Pg_202_Circle(i);
        }

        for(int i = 0; i < c.length; i++){
            System.out.print((int)(c[i].getArea()) + " ");
        }
    }
}
