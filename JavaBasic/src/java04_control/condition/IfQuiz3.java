package java04_control.condition;

import java.util.Scanner;

public class IfQuiz3 {
	public static void main(String[] args) {
		
//    + 두 수를 입력 받아 큰 수를 출력하시오
//      >> Input Number1 : 44
//      >> Input Number2 : 88
//      >> 88 이 더 큰 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		
		int num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " 이 더 큰 수");
		}
		
		if(num2 > num1) {
			System.out.println(num2 + " 이 더 큰 수");
		}
		
		if(num2 == num1) {
			System.out.println(num1 + " 두 숫자가 같음");
		}
		
	}// main method end
	
}// IfQuiz3 class end