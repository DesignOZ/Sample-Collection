import java.util.Random;
import java.util.Scanner;

/**
 *	while을 이용하여서 랜덤숫자를 맞추는 게임
 */

public class RandomGame {

    public static void main(String[] args) {
        int num, a = 0;
        Random r = new Random();
        num = r.nextInt(100); // 랜덤숫자 범위를 0~99으로 설정

        System.out.println("랜덤생성된 숫자를 맞춰보세요 (범위는 0~99)");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("숫자 입력");
            a = sc.nextInt();
            System.out.println("입력된 숫자는 " + a + "입니다.");

            if (a == num) {
                System.out.println("입력된 숫자 " + a + "정답입니다.");
                break;
            } else if (a > num) {
                System.out.println("입력된 숫자 " + a + "보다 더 낮은 숫자입니다.");
            } else {
                System.out.println("입력된 숫자" + a + "보다 더 큰 숫자입니다");
            }
        }
    }
}