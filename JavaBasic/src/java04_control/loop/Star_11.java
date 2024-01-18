package java04_control.loop;

public class Star_11 {
	public static void main(String[] args) {
		
		// 출력결과
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}// main method end
}// Star_11 class end
