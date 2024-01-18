package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {
	public static void main(String[] args) {
		
	//   - 메뉴 만들기
		//
		//   ===============================
//		      M  e  n  u
		//   ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
		//   ===============================
		//
//		     >> _
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

		//Scanner 선언
		//번호 받는 변수 선언
		
		//메뉴 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("\tM  e  n  u");
		System.out.println("===============================");
		System.out.println("\t1. Hello World 출력");
		System.out.println("\t2. 이름 출력");
		System.out.println("\t3. 성별 출력");
		System.out.println("\t4. 종료");
		System.out.println("===============================");
		
		System.err.print("\t>>");
		
		
		while(true) {
			int num = sc.nextInt();
			System.out.print("\t>>");
			switch(num) {
				case HELLO_MENU: // Hello World 출력
					System.out.println("Hello World");
					break;
			
				case NAME_MENU: // 이름 출력
					System.out.println("김동욱");
					break;
			
				case GENDER_MENU: // 성별 출력
					System.out.println("남자");
					break;
			
				case EXIT_MENU: // 종료
					System.out.println("종료합니다");
					break;
				
				default : 
					System.out.println("잘못 입력하셨습니다");
					break;
			}//switch end
			
			if(num ==4) {
				break;
			}else {
				System.err.print("\t>>");
			}
		}//while end
	}// main method end
}// SwitchQuiz_Menu class end