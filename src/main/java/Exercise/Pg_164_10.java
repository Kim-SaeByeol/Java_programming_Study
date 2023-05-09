package Exercise;

public class Pg_164_10 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        for(int i = 0; i < 6; i++){
            int a = (int)(Math.random()*4);
            int b = (int)(Math.random()*4);
            if(arr[a][b] != 0)
            arr[a][b] = 0;
            else
                i--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}