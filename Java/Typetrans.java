package p1;

/**
 *		long형 변수 a와 int형 변수 b를 아래와 같이 연산하고 자동타입변환과 강제타입변환에 대해 알아보는 프로그램
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
