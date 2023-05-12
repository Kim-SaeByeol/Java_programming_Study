package Exercise;

import java.util.Scanner;

public class Pg_166_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10 +1);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
