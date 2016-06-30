/**
 *	while문이 어떤 기능을 하는지 알아보는 프로그램
 */

public class WhileBasic {

    public static void main(String[] args) {

        int a = 1;

        // 조건식 안의 내용(a < 10)이 참이면 반복 실행된다.
        while (a < 10) {
            System.out.println("a = " + a);
            a++;
            // a가 11이면 while문에서 빠져나온다.

        }
    }
}
