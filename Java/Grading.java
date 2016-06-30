import java.util.Scanner;

/**
 *	Scanner�� ����Ͽ� ������ ������ ���� �Է¹ް�, ������ ��(����)�� ���� ���(����)�� �ο��ϴ� ���α׷�
 *	Scanner�� ����ϱ� ���ؼ� ���� ���� java.util.Scanner�� import�ؾ��Ѵ�.
 */
 
public class Grading {

	public static void main(String[] args) {
		
		char grade;
		
		// Scanner a�� �����Ѵ�.
		Scanner a = new Scanner(System.in);
		
		// a.hasNext()�� a�� �Է¹��� ���� ������ true�� ��ȯ�ϰ�, �Է¹��� ���� ������ �Է��� ��ٸ��Եȴ�.
		// ctrl + z�� �ԷµǸ� false�� ��ȯ�ϰԵȴ�.
		while(a.hasNext()) {
			
			// a�� ���� �������� ������ ���� score�� �Է��ѵ�.
			int score = a.nextInt();
			
			// if���� ���� score�� ���� ���� �Ʒ��� ���� ����� �ű�� �ȴ�
			if(score >= 90)
				grade='A';			// score�� 90�� �̻��� �� A���
			
			else if(score >= 80)
				grade = 'B';		// score�� 80�� �̻��� �� B���
			
			else if(score >= 70)
				grade = 'C';		// score�� 70�� �̻��� �� C���
			
			else if(score >= 60)
				grade = 'D';		// score�� 60�� �̻��� �� D���
			
			else
				grade = 'F';		// ��� ���ǿ��� �������� ���� ��쿡�� F�� �ο�
			
			System.out.println("����� ������ " + grade + " �Դϴ�");
		}
	}
}
