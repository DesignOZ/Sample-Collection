package p1;

/**
 *	연산자들의 기능을 알아보는 프로그램
 */
 
public class Compound {

	public static void main(String[] args) {
		
		double a = 3.9;
		a+=2.2; 		// a = a + 2.2와 같다.
		a*=2; 			// a = a * 2와 같다.
		
		int b = 5;
		b+=1.9;			// 1.9는 실수이기 때문에, 소수점 아래는 더하지 않으므로 정수 1만 더한 것과 같다.
		b*=2; 
		
		System.out.println(a);
		System.out.println(b);

	}
}
