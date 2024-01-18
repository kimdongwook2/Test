package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		//	-> 55
		//---------------------------------------
		
//		int sum = 1 + 2 + 3 + ~ + 9 + 10;
		
		//	반복횟수 : 10
		//	반복구간 : 1 ~ 10
			
		//반복 수행할 코드
		//	-> sum에 i 더하기
//		sum += i;
			
		//------------------------------------------------
			
		//초기식 :	int i = 1;	
		//조건식 : 	i < 11; 	
		//증감식 : 	i++			
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}// main method end
}// For_05 class end