package chap_03;

public class Pg_140 {
    public static void main(String[] args) {
        double score[][] = {            //double 타입으로 score[3][1] 의 배열을 선언하였다. 3.3 은 [0][0], 4.0은 [2][1] 이다.
                {3.3, 3.4},
                {3.5, 3.6},
                {3.7, 4.0},
                {4.1, 4.2}
        };
       double sum = 0;
        //score[][] 배열의 갯수 만큼 반복한다. score[][] 은 총 4개.
        for (int year =0; year<score.length; year++){
            for (int term =0; term < score[3].length; term++)
               sum += score[year][term];
       }
        //score[0] => {3.3, 3.4} length => 2        ==> score[].length 는 세로줄 갯수 (열)
        //score[1] => {3.5, 3.6} length => 2
        //score[2] => {3.7, 4.0} length => 2
        //score[3] => {4.1, 4.2} length => 2

        //score.length => {3.3, 3.4},{3.5, 3.6},{3.7, 4.0},{4.1, 4.2} => 4      => score.length 는 가로줄 갯수 (행)



        //score[][]은 double 타입으로 score[3][1] 의 배열을 선언하였다.
        int n = score.length;        //score.length = 4.
        int m = score[0].length;     //score[0].length = 2.
        System.out.println("4년 전체 평점 평균은 "+ sum/(n*m));
        System.out.println(n);
        System.out.println(m);
    }
}
