package Exercise;

public class Pg_161_3 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 100) {
            if(i%3 != 0){
                i++;
                continue;
            }else
                sum += i;
                i++;
        }
        System.out.println(sum);
    }
}
