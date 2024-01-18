package java04_control.loop;

public class For_10_1 {
	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; dan++) {// 2~9 단의 반복
			
			for(int i = 1; i <= 9; i++) {// dan 단의 1~9 곱셈 반복
				System.out.print(dan +"x" + i + "=" + (i * dan) + "\t");
			}
			System.out.println("");
		}
		
		
	}// main method end
}// For_10_1 class end

