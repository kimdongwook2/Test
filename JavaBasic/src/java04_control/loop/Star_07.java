package java04_control.loop;

public class Star_07 {
	public static void main(String[] args) {
		
		// 출력결과
		// 12345
		// 23456
		// 34567
		// 45678
		// 56789
		
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
		
	}// main method end
}// Star_07 class end
