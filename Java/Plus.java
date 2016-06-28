package p1;

/**
 *	정수형 변수 a와 b를 아래와 같이 연산하는 프로그램
 */
 
public class Plus {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		int result = a + b;
		
		System.out.println("변수 a는 :" + a);
		System.out.println("변수 b는 :" + b);
		
		System.out.println("덧셈: " + result);
		
		result = a - b;
		System.out.println("뺄셈: " + result);
		System.out.println("곱셈: " + a * b);
		System.out.println("나눗셈: " + a / b);
		System.out.println("나머지: " + a % b);

	}

}
