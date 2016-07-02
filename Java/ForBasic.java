/**
 * for가 무슨 역할을 하는 지 알아보는 프로그램
 */
public class ForBasic {

    public static void main(String[] args) {

        // i가 5보다 작을 때(4까지) 반복하게 됨
        // int i = 0을 선언, i < 5라는 조건에 맞으면 아래의 명령들을 수행하게된다.
        // 실행 이후 i++ (i = i + i) 명령을 실행하고 다시 조건식을 수행한다.

        for (int i = 0; i < 5; i++)
            System.out.println("반복문 for " + i);
    }

}
