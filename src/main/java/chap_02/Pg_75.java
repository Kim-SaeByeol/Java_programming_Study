package chap_02;

import java.util.Scanner;
/*
import 는 선언문임.
java.utii 패키지에 있는 'Scanner 클래스' 를 쓰겠다고 선언함.
Scanner 를 쓰기 전에는 반드시 선언해야하며, 선언하지 않으면 사용하지 못함. => 컴파일러가 Scanner 의 위치를 찾지 못함.
 */

public class Pg_75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         스캐너 클래스를 사용할 것이기 때문에 객체를 생성해야한다.
         객체생성 => 클래스이름(여기서는 Scanner) 객체이름(사용할 객체의 이름) = new 클래스이름();
         본래 new 클래스이름(); 으로 객체생성은 끝나지만 스캐너는 입력을 받아야하기 때문에 System.in 이 들어간다.
         System.in 은 입력을 받는다는 뜻. System.out 은 출력을 의미.
         */
        System.out.print("이름은 ");
        String name = scanner.nextLine();

        System.out.println("사는 곳은 ");
        String city = scanner.nextLine();

        System.out.print("나이는 ");
        int age = scanner.nextInt();

        System.out.print("체중은 ");
        double weight = scanner.nextDouble();

        System.out.print("결혼 여부는? ");
        boolean isSingle = scanner.nextBoolean();


        scanner.close();

        /*
        스캐너로 입력 받을 때 입력 메소드는 다음과 같다.
        기본형 - 스캐너클래스를 저장한 객체이름.next();
        scanner.nextByte();     //Byte 형 입력 및 리턴. 입력 받는 값은 1byte 정수의 값.
        scanner.nextShort();    //Short 형 입력 및 리턴. 입력 받은 값은 2byte 정수의 값.
        scanner.nextInt();      //int 형 입력 및 리턴. 입력 받은 값은 4byte 의 정수 값.
        scaaner.nextLong();     //Long 형 입력 및 리턴. 입력 받은 값은 8byte 의 정수 값.

        scanner.nextFloat();    //Float 형 입력 및 리턴. 입력 받은 값은 4byte 의 실수 값.
        scanner.nextDouble();   //Double 형 입력 및 리턴. 입력 받은 값은 8byte 의 실수 값.

        scanner.nextBoolean();  //Boolean 형 입력 및 리턴. 입력은 true 아니면 false 만 받을 수 있다.

        scanner.next();         //String 형 입력 및 리턴. 공백을 기준으로 보기에 글자를 띄어쓸 수 없다. ex) 사랑, 사 랑(x)
        scanner.nextLine();     //String 형 입력 및 리턴. 입력 받은 값은 공백도 포함한다.

        + 하나의 규칙이 보이는데, String 형 입력만 제외하면 next + 데이터타입(); 이라는 것을 알 수 있다.
         */

    }
}
