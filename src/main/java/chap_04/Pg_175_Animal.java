package chap_04;

public class Pg_175_Animal {
    //인스턴스 변수. 값을 메모리에 올리지 않았기에 사용하지 않으면 사라진다.
    String name;
    int age;

    //메소드를 선언하였고, 메소드를 호출하면 메소드가 실행되며 메소드 내부의 무언가가 실행될 것이다.
    public void eat() {
        System.out.println(name + " is eating. [부모 클래스]");
    }

    // 같은 이름의 메소드 이지만, 메소드에 들어가는 매개변수에 따라 출력되는 값이 달라짐.
    // 이것을 "오버로딩" 이라고 하며, 대표적인 예로는 println() 함수가 있음.
    // println 함수는 안에 넣는 시작 값이 String, int, Double 등에 따라 출력 값이 달라짐을 알 수 있음.
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void eat(int amount) {
        System.out.println(name + " is eating " + amount + " pieces of food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping. [부모 클래스]");
    }

    public void love() {
        System.out.println(name + " is feeling loved. [부모 클래스]");
    }

    public void introduction() {
        System.out.println("my name is " + name + " and my age is " + age + " years [부모 클래스]");
    }
}
