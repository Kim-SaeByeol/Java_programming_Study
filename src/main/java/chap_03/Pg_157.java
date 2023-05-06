package chap_03;

public class Pg_157 {
    public static void main(String[] args) {
        String strNum[] = {"23", "12", "3.141592", "998"};

        int i = 0;
        try {
            for(i=0; i<strNum.length; i++){
                //String 클래스에 있는 메소드
                //문자열의 값을 정수형으로 바꾼다.
                //만일 정수가 아닌 수라면 NumberFormatException 오류 발생.
                int j = Integer.parseInt(strNum[i]);
                System.out.println("정수로 변환된 값은 : " + j);
            }
        }
        catch (NumberFormatException e){
            System.out.println(strNum[i] + "는 정수로 변환할 수 없습니다.");
        }
    }
}
