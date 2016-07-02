/**
 * switch문에서 했던 break를 반복문에서도 사용가능한지 알아보는 프로그램
 */

public class BreakBasic {

    public static void main(String[] args) {
        int a = 1;
        boolean search = false;

        while (a < 100) {
            // 7과 9로 나눠서 나머지가 0인 숫자를 찾는다
            if (a % 7 == 0 && a % 9 == 0) {
                search = true;
                break;  // 조건에 부합한 숫자를 찾은 다음 break가 실행되면 반복문인 while을 빠져나가게 된다.
            }
            a++;
        }
        if (search)
            System.out.println("검색된 숫자 : " + a);
        else
            System.out.println("찾는 숫자가 없습니다");
    }

}
