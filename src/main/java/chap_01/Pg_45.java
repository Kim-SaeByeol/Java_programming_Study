package chap_01;

public class Pg_45 {
    public static void main(String[] args) {
        int n = 2030;
        String a = "하이";    //String 은 반드시 s 가 대문자 S 임.
        String b = "하이 ";   // 문자열 String 이기에, "" 로 지정함.
        System.out.println("헬로" + n);
        //print 안에서 + 또한 프로그래밍은 실행이 가능하다. 문자열 헬로와 데이터값인 2030이 합쳐서 헬로2030 으로 출력된 것.
        System.out.println("헬로 " + n);
        //문자열은 뛰어쓰기 조차 인식한다. 헬로_ + n 이기에 헬로 2030 으로 출력된 것.
        System.out.println(a + n);  //문자열 데이터타입인 String도 마찬가지인지 실험.
        System.out.println(b + n); // 마찬가지로 띄어쓰기도 인식함.

    }
}
