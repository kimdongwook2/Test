package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {
	public static void main(String[] args) {
		
		//Quiz.
		
		//숫자를 여러 개 입력받아 모든 값들의 총합을 구하고
		//최종 합계를 출력하는 프로그램
		
		//	->숫자 0을 입력하면 종료
		
		//	-> do-while 구문 활용하기
		
		//스캐너 선언
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0; // 총합 변수 선언
		int num; // 입력 값 변수 선언
//		boolean zero = true;
		
		do {
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			sum += num;
//			System.out.println("현재 총합 : "+ sum);
//			if(num ==0) {
//				zero = false;
//			}
		}while(num != 0);// 입력 값이 0일 때 종료
		
		System.out.println("총합 : "+ sum);
		
	}// main method end
}// DoWhile_02 class end