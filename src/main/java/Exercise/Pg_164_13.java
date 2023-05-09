package Exercise;
//369 게임
public class Pg_164_13 {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++){
          if(i > 10 &&(i % 30 == 3 || i % 30 == 6 || i % 30 == 9))
              System.out.println(i + "박수 짝짝");
          else if (i % 10 % 3 == 0)
              System.out.println(i + "박수 짝");
          else
              continue;
        }
    }
}
