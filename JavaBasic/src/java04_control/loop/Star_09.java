package java04_control.loop;

public class Star_09 {
	public static void main(String[] args) {
		
		// 출력결과
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}// main method end
}// Star_06 class end
