package java04_control.loop;

public class Star_05 {
	public static void main(String[] args) {
		
		// 출력결과
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}// main method end
}// Star_05 class end
