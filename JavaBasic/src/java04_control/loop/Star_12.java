package java04_control.loop;

public class Star_12 {
	public static void main(String[] args) {
		
		// 출력결과
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}else { // i >= 5 && i < 9
				for(int j=i; j<9; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
		
//		for(int i=5; i>0; i--) {
//			for(int j=i; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<4; i++) {
//			for(int j=i; j<4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}// main method end
}// Star_12 class end
