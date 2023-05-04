package chap_03;
/*
main() 메소드에 대해 알아보자.
특징)
1. 자바 응용프로그램의 실행은 main() 메소드 부터 실행된다.
2. main() 메소드는 public(공개) 속성이다.
3. main() 메소드는 static(정적) 속성이다.
4. main() 메소드의 리턴타입은 void(리턴값을 받지 않음) 이다.
5. main() 메소드에는 문자열 배열(String[] args)이 매개변수로 전달된다.
문자열 배열이 매개변수 이기에 프로그램을 실행할 때 커맨드 라인(command line)에서 전달된 인수(argument)를 받아들일 수 있다.
즉슨, 프로그램이 실행이 될때 (메인함수를 빠져나간다는 것은 프로그램의 종료를 의미) 리턴 값으로 받은 결과가 우리에게 문자열배열로 눈에 보이는 것.
 */


public class Pg_149 {
    public static void main(String[] args) {
        //명령행 인자를 2 20.5 88.1 과 같이 지정해보았다.
        //명령행 인자는 각각 args[] 에 저장이 되어있는 상태이다.
        double sum = 0.0;

        //명령행 인자의 갯수 만큼 반복 된다.(args에 들어간 값)
        for(int i = 0; i < args.length; i++) {

            //문자열을 실수로 변환하여 리턴한다. 문자열 배열이기에 "20" 과 같이 저장되어있음.
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("sum = " + sum);
    }

}
