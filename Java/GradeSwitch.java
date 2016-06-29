package p2;

import java.util.Scanner;

/**
 *	Scanner를 사용하여 정수형 변수에 값를 입력받고, 변수의 값(점수)에 따라서 등급(학점)을 부여하는 프로그램
 *	앞서 했던 Grading에서 Switch문을 추가하고 나눈 등급에 따라 정해진 문장을 출력하게함
 */

public class GradeSwitch {

	public static void main(String[] args) {
		
		char grade;
		Scanner a =new Scanner(System.in);
		
		while(a.hasNext()){
			
			int score = a.nextInt();
			
			if(score >= 90)        
				grade = 'A';
			
			else if(score >= 80)
				grade = 'B';
			
			else if(score >= 70)
				grade = 'C';
			
			else if(score >= 60)
				grade = 'D';
			
			else 				
				grade = 'F';

			//위의 if문에서 나뉘어진 등급에 따라 정해진 문장을 출력한다.
			switch(grade) {
				case 'A' :
					System.out.println("당신의 학점은 " +grade+ " 입니다. 열심히 하셨군요.");
					break;

				case 'B' :
					System.out.println("당신의 학점은 " +grade+ " 입니다. 아쉽네요.");
					break;

				case 'C' :
					System.out.println("당신의 학점은 " +grade+ " 입니다. 노력하세요.");
					break;

				case 'D' :
					System.out.println("당신의 학점은 " +grade+ " 입니다. 위험합니다.");
					break;

				case 'F' :
					System.out.println("당신의 학점은 " +grade+ " 입니다. (ㅜㅜ)");
					break;

				default :
					System.out.println("잘못된 점수 입니다");
			}
		}
	}
}