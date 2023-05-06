package chap_03;

public class Pg_155 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 0;
        //예외처리문
        try {
            for(int i = 0; i<5; i++){
                //i가 4가 되면 인덱스의 값이 5가 되기 때문에 오류 발생
                arr[i+1] = i+1 + arr[i];
                System.out.println("arr[" + i + "]" + "=" + arr[i]);
            }
        }
        //i가 4일 때 인덱스의 값을 넘으면 발생하면 오류를 캐치.
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 범위를 벗어났습니다.");
        }
    }
}
