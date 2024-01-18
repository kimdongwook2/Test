package java09_api.ranQuiz;

import java.util.Scanner;

public class RanQuizEx {
	public static void main(String[] args) {
		
		//랜덤 퀴즈 메뉴 만들기
		// 	1. Up & Down 게임
		//	2. Baskin 31 게임
		//	3. 종료
		
		Scanner sc = new Scanner(System.in);
		RanQuiz ranQuiz = new RanQuiz();
		
		//게임 실행 메소드
		
		
		boolean isExist = true; //플래그
		while(isExist) {//3 입력시  isExist = false
			System.out.println("랜덤 퀴즈 메뉴 만들기");
			System.out.println("1. Up & Down 게임");
			System.out.println("2. Baskin 31 게임");
			System.out.println("3. 종료");
			
			System.out.print("입력 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("1. Up & Down 게임 시작!");
				ranQuiz.updown();
			}else if(num == 2) {
				System.out.println("2. Baskin 31 게임 시작!");
				ranQuiz.baskin();
			}else if(num == 3) {
				System.out.println("종료합니다");
				isExist = false;
			}else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
		
		
	}
}
