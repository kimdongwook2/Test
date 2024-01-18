package java04_control.loop;

public class While_03 {
	public static void main(String[] args) {
		
		//while문을 이용한 구구단 출력
		//->2-9단 전부 출력
		
		//변수 선언
		int dan = 2;
		
		
		while(dan <= 9) { //단 반복
			int num = 1; // 변수 선언
			
			System.out.println("----- "+dan+"단 -----");
			while(num <= 9) { //곱 반복
				System.out.println(dan+" x "+num+" = "+(dan*num));
				num++;
			}	
			dan++;
		}
		
	}// main method end
}// While_03 class end