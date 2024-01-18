package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//Quiz. 2~9단 구구단 출력
		
		//for문 중첩사용
		
		//for문안에 for문
		
		//변수 dan을 첫번째 for문에서 반복
		//두번째 for문에서는 곱하기 출력
		
		for(int dan = 2; dan <= 9; dan++) {// 2~9 단의 반복
			System.out.println("------ " + dan + "단 ------");
			
			for(int i = 1; i <= 9; i++) {// dan 단의 1~9 곱셈 반복
				System.out.println(dan +" x " + i + " = " + (i * dan));
			}
			
		}
		
	}// main method end
}// For_10 class end