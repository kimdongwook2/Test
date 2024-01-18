package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//Quiz
		//구구단 2단 출력하기
		
		//출력 예시)
		//	2 x 1 = 2
		//	2 x 2 = 4
		//	2 x 3 = 6
		//	2 x 4 = 6
		//	2 x 5 = 10
		//	2 x 6 = 12
		//	2 x 7 = 14
		//	2 x 8 = 16
		//	2 x 9 = 18
		
		int dan = 2;
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan +" x " + i + " = " + (i * dan));
		}
		
		//	반복횟수 : 9
		//	반복구간 : 1 ~ 9
		
		//	반복 출력
		//	-> i에 2곱한거 출력
		//	System.out.println("2 x " + i + " = " + (i*2));
		
	}// main method end
}// For_06 class end