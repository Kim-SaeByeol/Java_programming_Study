public class algorijm {
    public static void main(String[] args) {


        // 1에서 100 까지의 합을 구하는 식
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }

        System.out.println("1번째 방식 : 그냥 1~100 까지 더한다.");
        System.out.println(sum);

        sum = 0;

        sum = 100 * (1 + 100) / 2;
        System.out.println("가우스의 등차수열 합의 공식 사용");
        System.out.println(sum);

    }
}
