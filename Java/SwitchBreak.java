/**
 *	switch������ break�� ����� �˾ƺ��� ���α׷�
 */
 
public class SwitchBreak {

	public static void main(String[] args) {

		int a = 2;
		
		switch(a)
		{
			// a�� 1�� ���
			case 1 :
				System.out.println("ù��° ���̽�");
				break;
				// break�� ���� ������ ���� ���̽��� �Ѿ�� �ȴ�.

			// a�� 2�� ���
			case 2 :
				System.out.println("�ι�° ���̽�");
				break;

			// a�� 3�� ���
			case 3 :
				System.out.println("����° ���̽�");
				break;

			// a�� 4�� ���
			case 4 :
				System.out.println("�׹�° ���̽�");
				break;

			// default�� ���� ���̽����� ������ ���� �ٸ� ���̽��϶� �� ��
			default :
				System.out.println("�� �ٸ� ���̽�");
				// ���� �������� ������ ���̽� �̹Ƿ� ���� break�� ������ �ʴ´�
		}
		
		System.out.println("������ a�� ������ �ٲ㼭 �غ��ô�");
	}
}

