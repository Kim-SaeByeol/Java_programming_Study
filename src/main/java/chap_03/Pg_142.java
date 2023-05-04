package chap_03;

public class Pg_142 {
    public static void main(String[] args) {
        //열은 4개. 행은 설정x
        int intArray[][] = new int[4][];

        //행을 여기서 설정함. 계단식임
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        //intArray.length 는 행의 갯수를 말함.
        for (int i=0; i<intArray.length; i++){
            //intArray.length[] 는 열의 갯수를 말함.
            for (int j=0; j <intArray[i].length;j++){
                intArray[i][j] = (i+1)*10 +j;
            }
        }
        for (int i =0; i<intArray.length; i++){
            for (int j=0; j<intArray[i].length; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
