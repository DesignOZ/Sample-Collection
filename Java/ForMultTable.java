/**
 * for문을 이용하여 구구단을 출력하는 프로그램
 */

public class ForMultTable {

    public static void main(String[] args) {

        int i, j;

        for (i = 1; i < 10; i++, System.out.println()) {
            for (j = 1; j < 10; j++, System.out.print("\t")) {  // 각 단의 곱셈에 대한 반복
                System.out.print(i + "X" + j + "=" + i * j);
            }
        }
    }

}
