package Exercise;

public class Pg_161_8_re {
    public static void main(String[] args) {
        // 1. 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, true로 초기화 하라.
        boolean bool[] = {true, false, true};

        // 2. 5행 4열 크기의 2차원 실수 d를 선언하라.
        double d[][] = new double[4][5];

        // 3. 1에서 12까지 순서대로 초기화되는 4행 3열의 2차원 배열 val을 선언하라.
        int val[][] = new int[3][4];
        int k = 1;
        for(int i = 0; i < val.length; i++){
            for(int j = 0; j < val[i].length; j++){
                val[i][j] = k;
                k++;
            }
        }
        for(int row[] : val){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
