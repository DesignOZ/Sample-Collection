import java.util.Scanner;

/**
 *	A�� B�� ���� ����, ����, ���� �Ѱ��� �Է��Ͽ� ���и� ������ ���������� ����
 */

public class ScannerGame {
	
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
       
        System.out.println("����,����,�� �߿� �Է��ϼ���.");
		
		// ���ڿ� a�� b�� ���� ���ڿ��� �Է¹޴´�.
        System.out.print("A�� ���� : ");
        String a = s.next();
        System.out.print("B�� ���� : ");
        String b = s.next();

        if (a.equals("����") || a.equals("����") || a.equals("��") || b.equals("����") || b.equals("����") || b.equals("��")) {
			
			// B�� �̱涧
			if (a.equals("����") && b.equals("����") || a.equals("����") && b.equals("��") || a.equals("��") && b.equals("����"))
				System.out.println("B�� �̰���ϴ�.");
			
			// ���� ���
			else if (a.equals("����") && b.equals("����") || a.equals("����") && b.equals("����") || a.equals("��") && b.equals("��"))
				System.out.println("�����ϴ�.");
		
			// �׿� �������� ���� A�� �̱� ����̴�.
			else        
				System.out.println("A�� �̰���ϴ�.");
       
		}

		//�߸��� �Է��϶�
		else
			System.out.println("����,����,�� �߿��� �Է����ּ���.");
	}
}