/**
 *	if���� ���� �񱳿����ڸ� �˾ƺ��� ���α׷�
 */

public class Compoundtf {

	public static void main(String[] args) {
		
		int a=20, b=30;
		
		if(true)	// true���� ������ �׻� ���̴�.
			System.out.println("�� �̴�");
		else
			System.out.println("���� �̴�");
		
		if(a<b)
			System.out.println("�� �Դϴ�");
		else
			System.out.println("���� �Դϴ�");
		
		if(a>b) 
			System.out.println("a�� �� ū���̱⿡ ���Դϴ�");
		else
			System.out.println("a�� �� �������̱⿡ �����Դϴ�");
		
		if(a!=b)	// !=�� ����������
			System.out.println("a�� b�� �����ʽ��ϴ�");
		else
			System.out.println("a�� b�� �����ϴ�");

	}

}
