package Exercise;

public class Pg_167_11 {
    public static void main(String[] args) {
        System.out.print("명령행 인자 : ");
        for(int i = 0; i < args.length; i++)
            System.out.print(args[i] + " ");
        System.out.println();

        int sum = 0;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("명령행 인자의 평균 값 : " + sum/ args.length);
    }
}
