/**
 * Continue문에 대해서 알아보는 프로그램
 */

public class ContinueBasic {

    public static void main(String[] args) {
        int a = 0;
        int count = 0;

        //100 이하의 5와 10의 공배수를 모두 출력함
        while (a++ < 100) {
            if (a % 5 != 0 || a % 10 != 0) //
                continue;
            // break문은 반복문을 빠져나가는 역할을 하지만
            // continue는 조건으로 다시 이동함

            count++;
            System.out.println(a);
        }
        System.out.println("횟수 : " + count);
    }

}
