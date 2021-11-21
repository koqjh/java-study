package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// Switch문 문자 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계속 진행하시겠습니까? (y/n) : ");
		
		String input = scanner.nextLine();
		scanner.close();
		
		switch(input) {
		case "y": //옵션변수가 케이스 0과 같을때
			System.out.println("계속 진행합니다.");			
			break; //항상 케이스 하나 끝에 break작성
		case "n": //옵션변수가 케이스 0과 같을때
			System.out.println("종료합니다");
			break; //항상 케이스 하나 끝에 break작성
		default: //else와 같음 위의 케이스에 맞는 것이 없을때 실행
			System.out.println("잘못된 옵션번호.");
			break;
		}
	}

}
