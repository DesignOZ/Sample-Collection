/**
 *	switch문에서 break의 기능을 알아보는 프로그램
 */
 
public class SwitchBreak {

	public static void main(String[] args) {

		int a = 2;
		
		switch(a)
		{
			// a가 1일 경우
			case 1 :
				System.out.println("첫번째 케이스");
				break;
				// break를 넣지 않으면 다음 케이스로 넘어가게 된다.

			// a가 2일 경우
			case 2 :
				System.out.println("두번째 케이스");
				break;

			// a가 3일 경우
			case 3 :
				System.out.println("세번째 케이스");
				break;

			// a가 4일 경우
			case 4 :
				System.out.println("네번째 케이스");
				break;

			// default는 위의 케이스에서 나오지 않은 다른 케이스일때 의 값
			default :
				System.out.println("또 다른 케이스");
				// 제일 마지막에 나오는 케이스 이므로 굳이 break를 붙이지 않는다
		}
		
		System.out.println("다음엔 a의 변수를 바꿔서 해봅시다");
	}
}

