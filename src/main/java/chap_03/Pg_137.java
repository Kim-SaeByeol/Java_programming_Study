package chap_03;
public class Pg_137 {
    enum Week {월, 화, 수, 목, 금, 토, 일 }
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4, 5 };        //int 배열 n은 5개의 배열이며, 배열에는 각 1, 2, 3, 4, 5의 정수 값이 저장됨.
        String names [] = {"사과", "배", "바나나", "체리", "띨기", "포도"};
        //String 타입의 배열 names은 6개의 배열이며, 배열에는 사과, 배, 바나나, 체리,  딸기, 포도 의 문자열 값이 저장됨.

        int sum = 0;
        for (int k : n){            //n의 배열 안에 있는 값을 n[0], n[1], n[2], n[3], n[4] 순서로 변수 k에 저장하며, 배열에 있는 모든 값을 k에 넣었을 경우 false 를 리턴함.
            System.out.print(k + " ");
            sum += k;       //k는 배열의 모든 값을 받았으므로, sum은 배열의 모든 값을 합한 값임.
        }
        System.out.println("합은" + sum);

        for (String s : names){     //names의 배열 안에 있는 문자열 값을 names[0], names[1], names[2], names[3], names[4], names[5]의 순서로 변수 s에 저장하며, 배열에 있는 모든 값을 s에 넣었을 경우 false 를 리턴함.
            System.out.print(s + " ");  //s에 저장된 값을 출력하고 공백과 함께 출력한다.
        }
        System.out.println();
        for (Week day : Week.values()){
            System.out.print(day + "요일 ");
        }
        System.out.println();
    }

}
