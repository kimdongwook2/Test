package java04_control.loop;

public class Star_04 {
	public static void main(String[] args) {
		
		// 출력결과
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}// main method end
}// Star_04 class end
