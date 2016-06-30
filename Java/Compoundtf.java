/**
 *	if문을 통해 비교연산자를 알아보는 프로그램
 */

public class Compoundtf {

	public static void main(String[] args) {
		
		int a=20, b=30;
		
		if(true)	// true값이 있으면 항상 참이다.
			System.out.println("참 이다");
		else
			System.out.println("거짓 이다");
		
		if(a<b)
			System.out.println("참 입니다");
		else
			System.out.println("거짓 입니다");
		
		if(a>b) 
			System.out.println("a가 더 큰수이기에 참입니다");
		else
			System.out.println("a가 더 작은수이기에 거짓입니다");
		
		if(a!=b)	// !=은 부정연산자
			System.out.println("a와 b는 같지않습니다");
		else
			System.out.println("a와 b는 같습니다");

	}

}
