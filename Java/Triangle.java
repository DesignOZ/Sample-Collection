package p1;

/**
 *	삼각형 넓이를 구하는 프로그램. 변수, 리터럴, 상수를 사용해보는 것을 목표로 하는 프로그램
 */
 
public class Triangle {

	public static void main(String[] args) {
		
		// 삼각형의 넓이는 밑변 * 높이 / 2 이다.
		
		double base = 10;	// 삼각형의 밑변
		double high = 10;	// 삼각형의 높이
		double ares = 0;	// 삼각형의 넓이
		
		ares = high*base/2;
		
		System.out.println("삼각형의 넓이 = " + ares);

	}

}
