package p1;

/**
 *		long�� ���� a�� int�� ���� b�� �Ʒ��� ���� �����ϰ� �ڵ�Ÿ�Ժ�ȯ�� ����Ÿ�Ժ�ȯ�� ���� �˾ƺ��� ���α׷�
 */
 
public class Typetrans {

	public static void main(String[] args) {
			
		long a = 200;
		int b = 11;
		
		System.out.println(a+b);
		System.out.println(100/40);
		System.out.println(100.0/40);
		System.out.println((char)0x05000041);
		System.out.println((int)2.9+1.8);
		System.out.println((double)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
		System.out.println((double)2.9+(int)1.8);

	}

}
