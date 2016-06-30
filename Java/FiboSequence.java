/**
 *	while문으로 피보나치수열을 출력해보는 프로그램
 */

public class FiboSequence {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 0;

        int count = 0;

        while (count++ < 10) {
            System.out.println(a);
            c = b;
            b = a;
            a = b + c;
        }
    }
}
