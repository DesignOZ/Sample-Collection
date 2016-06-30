/**
 *	do-While과 Scanner를 사용해 입력받은 값을 더하여 평균값을 구하는 프로그램
 */

public class WhileAverage {

    public static void main(String[] args) {

        Scanner av = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int i = 0;
        int a = 0;

        do {
            System.out.print("점수를 입력하세요 : ");
            sum = sum + i;
            n++;
            a = n - 1;
        } while ((i = av.nextInt()) != 0);  // 0이 입력되면 while문에서 빠져나오게된다.

        System.out.println("입력된  점수는" + a + "개 평균은 " + sum / a + "이다");
    }

}
