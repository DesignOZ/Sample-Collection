import java.util.Scanner;

/**
 *	Scanner를 사용하여 정수형 변수에 값를 입력받고, 변수의 값(점수)에 따라서 등급(학점)을 부여하는 프로그램
 *	Scanner를 사용하기 위해선 위와 같이 java.util.Scanner를 import해야한다.
 */
 
public class Grading {

	public static void main(String[] args) {
		
		char grade;
		
		// Scanner a를 생성한다.
		Scanner a = new Scanner(System.in);
		
		// a.hasNext()는 a가 입력받은 값이 있으면 true를 반환하고, 입력받은 값이 없으면 입력을 기다리게된다.
		// ctrl + z가 입력되면 false를 반환하게된다.
		while(a.hasNext()) {
			
			// a를 통해 정수값을 정수형 변수 score에 입력한디.
			int score = a.nextInt();
			
			// if문을 통해 score의 값에 따라 아래와 같이 등급을 매기게 된다
			if(score >= 90)
				grade='A';			// score가 90점 이상일 때 A등급
			
			else if(score >= 80)
				grade = 'B';		// score가 80점 이상일 때 B등급
			
			else if(score >= 70)
				grade = 'C';		// score가 70점 이상일 때 C등급
			
			else if(score >= 60)
				grade = 'D';		// score가 60점 이상일 때 D등급
			
			else
				grade = 'F';		// 어느 조건에도 부합하지 않을 경우에는 F를 부여
			
			System.out.println("당신의 학점은 " + grade + " 입니다");
		}
	}
}
