package chap_03;

public class Pg_144 {

    //makeArray 메소드를 선언함.
    //배열인 temp 를 리턴하며 temp[]는 사라지지만 배열의 값은 레퍼런스 값으로써 사라지지 않음.
    static int[] makeArray(){
            int temp[] = new int[4];
            for (int i=0; i<temp.length; i++){
                temp[i] = i;
            }
        return temp;
    }
    public static void main(String[] args) {
        int intArray[];
        //레퍼런스 치환을 통해 intArray는 makeArray() 의 주소를 참고함.
        //이로 인해 temp가 리턴되어 temp가 사라지더라도 intArray를 통해 배열의 값을 가져올 수 있음.
        intArray = makeArray();
        for (int i =0; i<intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
