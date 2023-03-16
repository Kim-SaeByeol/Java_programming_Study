package assignment;
public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
             {
                    System.out.print(" ");
                }

            }
            for (int k = 0; k < (i*2)-1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 1; i <=3; i++) {
            for(int j=0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 8; k > (i*2)+1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}