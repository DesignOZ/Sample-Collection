import java.util.Scanner;

/**
 *	A와 B에 각각 가위, 바위, 보중 한개를 입력하여 승패를 가리는 가위바위보 게임
 */

public class ScannerGame {
	
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
       
        System.out.println("가위,바위,보 중에 입력하세요.");
		
		// 문자열 a와 b에 각각 문자열을 입력받는다.
        System.out.print("A가 낼것 : ");
        String a = s.next();
        System.out.print("B가 낼것 : ");
        String b = s.next();

        if (a.equals("가위") || a.equals("바위") || a.equals("보") || b.equals("가위") || b.equals("바위") || b.equals("보")) {
			
			// B가 이길때
			if (a.equals("가위") && b.equals("바위") || a.equals("바위") && b.equals("보") || a.equals("보") && b.equals("가위"))
				System.out.println("B가 이겼습니다.");
			
			// 비기는 경우
			else if (a.equals("가위") && b.equals("가위") || a.equals("바위") && b.equals("바위") || a.equals("보") && b.equals("보"))
				System.out.println("비겼습니다.");
		
			// 그외 나머지의 경우는 A가 이긴 경우이다.
			else        
				System.out.println("A가 이겼습니다.");
       
		}

		//잘못된 입력일때
		else
			System.out.println("가위,바위,보 중에서 입력해주세요.");
	}
}