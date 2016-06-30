/**
 *	switch문의 기능에 대해 알아보는 프로그램
 */
 
public class Switch {
 
	public static void main(String[] args) {

		int a = 2;
		
		// switch 옆의 괄호() 안에 조건문을 넣어준다.
		switch(a) {

			// a가 1일 경우
			case 1 :
				System.out.println("첫번째 케이스");

			// a가 2일 경우
			case 2 :
				System.out.println("두번째 케이스");

			// a가 3일 경우
			case 3 :
				System.out.println("세번째 케이스");

			// a가 4일 경우
			case 4 :
				System.out.println("네번째 케이스");

			// default는 위의 케이스에서 나오지 않은 다른 케이스일때 의 값
			default :
				System.out.println("또 다른 케이스");
		}
		
		System.out.println("다음엔 a의 변수를 바꿔서 해봅시다");
	}
}