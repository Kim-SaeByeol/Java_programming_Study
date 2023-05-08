package Exercise;

public class Pg_164_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < 100; i+= 2){
            sum = sum + i;
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i += 2;
        }while (i <100);
        System.out.println(sum);
    }
}
