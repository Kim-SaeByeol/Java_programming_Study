package Exercise;

public class Pg_167_12_re {
    public static void main(String[] args) {
        System.out.print("명령행 인자 : ");
        for(int i = 0; i < args.length; i++)
            System.out.print(args[i] + " ");
        int sum = 0;
        for(int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println();
        System.out.print("정수 만을 골라 합을 구한다면 : " + sum);
    }
}
