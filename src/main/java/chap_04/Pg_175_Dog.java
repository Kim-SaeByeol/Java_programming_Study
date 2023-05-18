package chap_04;

//부모로 부터 상속을 받았기 때문에 extends 를 쓰고
//어느 부모에게 상속 받았는지 extends 뒤에 클래스 이름을 써준다.
// 해당 Dog 라는 클래스는 Animal 에게 상속 받은 클래스 이다.
// 자손 클래스인 Dog 는 Animal 클래스의 메소드와 인스턴스 변수를 모두 사용할 수 있으며,
// 자손 클래스 내에서 만든 bark() 라는 메소드 처럼 추가로 만들 수도 있다.
public class Pg_175_Dog extends Pg_175_Animal {
    public void bark() {
        System.out.println(name + " is barking. [자식 클래스]");
    }
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on the floor [자식 클래스에서 오버라이딩]");
    }
}
