package java04_control.loop;

public class Star_06 {
	public static void main(String[] args) {
		
		// 출력결과
		// 12345
		// 23456
		// 34567
		// 45678
		// 56789
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
		
	}// main method end
}// Star_06 class end
