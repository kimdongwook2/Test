package java04_control.loop;

public class Star_08 {
	public static void main(String[] args) {
		
		// 출력결과
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}// main method end
}// Star_08 class end
