package chap_04;
public class Pg_175_Animal {
    //인스턴스 변수. 값을 메모리에 올리지 않았기에 사용하지 않으면 사라진다.
    String name;
    int age;

    //메소드를 선언하였고, 메소드를 호출하면 메소드가 실행되며 메소드 내부의 무언가가 실행될 것이다.
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void love() {
        System.out.println(name + " is feeling loved.");
    }

    public void introduction() {
        System.out.println("my name is " + name +" and my age is " + age + " years");
    }
}
