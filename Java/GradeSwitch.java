package p2;

import java.util.Scanner;

/**
 *	Scanner�� ����Ͽ� ������ ������ ���� �Է¹ް�, ������ ��(����)�� ���� ���(����)�� �ο��ϴ� ���α׷�
 *	�ռ� �ߴ� Grading���� Switch���� �߰��ϰ� ���� ��޿� ���� ������ ������ ����ϰ���
 */

public class GradeSwitch {

	public static void main(String[] args) {
		
		char grade;
		Scanner a =new Scanner(System.in);
		
		while(a.hasNext()){
			
			int score = a.nextInt();
			
			if(score >= 90)        
				grade = 'A';
			
			else if(score >= 80)
				grade = 'B';
			
			else if(score >= 70)
				grade = 'C';
			
			else if(score >= 60)
				grade = 'D';
			
			else 				
				grade = 'F';

			//���� if������ �������� ��޿� ���� ������ ������ ����Ѵ�.
			switch(grade) {
				case 'A' :
					System.out.println("����� ������ " +grade+ " �Դϴ�. ������ �ϼ̱���.");
					break;

				case 'B' :
					System.out.println("����� ������ " +grade+ " �Դϴ�. �ƽ��׿�.");
					break;

				case 'C' :
					System.out.println("����� ������ " +grade+ " �Դϴ�. ����ϼ���.");
					break;

				case 'D' :
					System.out.println("����� ������ " +grade+ " �Դϴ�. �����մϴ�.");
					break;

				case 'F' :
					System.out.println("����� ������ " +grade+ " �Դϴ�. (�̤�)");
					break;

				default :
					System.out.println("�߸��� ���� �Դϴ�");
			}
		}
	}
}