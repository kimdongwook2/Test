package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		//Quiz. 입력한 숫자가 짝수/홀수 인지 판별하는 코드
		
		if(num % 2 == 0) {
			System.out.println("num [" + num + "] - 짝수 ");
		} else {
			System.out.println("num [" + num + "] - 홀수 ");
		}
		
	}// main method end
	
}// IfElse_02 class end