/**
 * for문을 이용하여 1~10까지 곱하는 프로그램
 */

public class ForMult {

    public static void main(String[] args) {
        int j, i;

        // 만약 j나 i를 0으로 하면 곱셈값이 0이 되어버린다.
        for (j = 1, i = 1; i <= 10; i++) {
            j = j * i;
            System.out.print(i);
            if (i == 10) {
                System.out.print("=");
                System.out.print(j);
            } else
                System.out.print("X");
        }

    }

}
