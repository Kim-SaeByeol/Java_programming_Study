package Exercise;

public class Pg_164_2 {
    public static void main(String[] args) {
        int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        for(int i = 0; i < n.length; i++){
            for(int j = 1; j < n[i].length+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
