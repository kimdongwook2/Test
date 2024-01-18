package java04_control.condition;

import java.util.Scanner;

public class IfQuiz2 {
	public static void main(String[] args) {
		
//    + 입력한 데이터가 3의 배수인지 판별하시오
//     (% 연산자 사용)
//      >> Input Number : 7
//      >> 3의 배수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수 입니다");
		}
		
		if(num % 3 != 0) {
			System.out.println("3의 배수가 아닙니다");
		}
		
	}// main method end
	
}// IfQuiz2 class end