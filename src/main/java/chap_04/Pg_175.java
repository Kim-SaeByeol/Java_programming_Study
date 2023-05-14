package chap_04;

public class Pg_175 {
    public static void main(String[] args) {
        //클래스명 변수이름 = new 생성자()
        //생성자는 클래스명에 () 을 붙인다.
        //생성자는 메소드와 비슷한 모양을 가지고 있는데 생성자 이름은 클래스 이름과 동일하며, 반환 타입이 없고, 인자를 받을 수 있다.
        Pg_175_Dog myDog = new Pg_175_Dog();

        //Dog 클래스의 인스턴스 변수에 값을 지정하였다.
        myDog.name = "Buddy";
        myDog.age = 3;

        //Dog 클래스의 메소드를 호출하여 실행한다.
        //bark() 는 Dog 클래스가 만들어낸 메소드이며, 그 이외의 메소드는 Animal 클래스로부터 상속 받은 메소드이다.
        myDog.introduction();

        //오버로딩
        myDog.eat();
        //메소드의 값에 따라 넣을 경우 값이 달라짐.
        myDog.eat(3);
        myDog.eat("dog food");

        //자식이 부모의 메소드를 상속 받아 사용함
        myDog.love();
        //자식에서 만들어진 메소드를 호출
        myDog.bark();

        //부모의 메소드를 자식이 상속 받았지만
        //자신이 원하는 것이 아니기에 원하는 것으로 바꿔씀.
        myDog.sleep();
        //오버라이딩은 상속 받은 메소드를 자신이 원하는 모양으로 바꾸는 것으로,
        //메소드 내의 매개변수만 같다면 모양을 바꿀 수 있다.
        //ex: 알약의 모양은 상관 없고(메소드 내용), 알약의 내용물은 같아야됨 (메소드에 들어갈 매개변수)
    }
}
