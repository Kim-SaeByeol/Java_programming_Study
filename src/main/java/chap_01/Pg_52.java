package chap_01;

import java.sql.SQLOutput;

/*
문제 : 화면에 자신의 이름, 나이, 학과 등의 정보를 출력하는 자바 응용프로그램을 작성하라.
Ex) Kitae Hwang
    20 year old
    Department of Computer Enginnering
 */
public class Pg_52 {
    public static void main(String[] args) {
        System.out.println("Kim SaeByeol");
        System.out.println("Kim " + "Sae" + "Byeol");
        System.out.println("24 " + "year " + "old");
        System.out.println("Department of big Dataing");

        System.out.println("----------------------------");

        String a = "kim";
        int b = 24;
        String c = "Department of big Dataing";

        System.out.println(a + " SaeByeol");
        System.out.println(b + " year" + " old");
        System.out.println(c);
    }
}
