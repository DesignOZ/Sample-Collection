/**
 *	WhileBasic을 do-while문으로 바꾸어 do-while과 while의 차이를 알아보는 프로그램
 */

public class DoWhileBasic {

    public static void main(String[] args) {

        int a = 1;

        // while과는 다르게 조건식이 뒤에 붙었는데
        // do의 내용을 먼저 1회 실행한 후 while의 조건식이 참이면 반복하게된다.
        do {
            System.out.println("Do-while의 기능" + a);
            a++;
        } while (a < 10);
    }
}
