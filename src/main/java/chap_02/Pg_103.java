package chap_02;
import java.util.Scanner;
public class Pg_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //입력을 받아야하기에 스캐너 선언.

        System.out.println("무슨 커피 드릴까요? ");
        String order = sc.next();       //주문 읽기. 스트링 타입이기에 next 를 넣었다. next는 공백을 포함하지 않는다.
        int price = 0;                  //가격
        switch (order) {
            case "에스프레소":
            case "카푸치노" :
            case "카페라떼" :
                price = 3500; break;        //케이스에 있는 "에스프레소, 카푸치노, 카페라떼" 중 말한다면 가격 3500을 출력 후 스위치 종료.
            case "아메리카노" :
                price = 2000; break;        //아메리카노일 경우 2000 출력 후 스위치 종료
            default: System.out.println("메뉴에 없습니다!");       //다른 값을 입력하였을 때 출력
        }
        if(price != 0){
            System.out.println(order + "는 " + price + "원입니다.");     //스위치가 작동시 가격이 초기화 되기에 작동되는 로직.
            sc.close();
        }

    }
}
