package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {
	public static void main(String[] args) {
		
		//입력 객체
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("--- 입력 ---");
		System.out.print("Input Number : ");
		int num = sc.nextInt();
//		double num = sc.nextDouble();
//		boolean num = sc.nextBoolean();
//		String num = sc.nextLine(); //nextLine()을 제외한 모든 메소드 문제 있음
		
		System.out.print("Input String : ");
		sc.nextLine(); //입력 버퍼 비우기, 버퍼에 남은 '\n' 을 제거한다
//		sc.skip("[\\r\\n]+"); // 정규식을 이용하여 입력 버퍼의 '\n', '\r' 을 모두 제거한다
		String str = sc.nextLine();
		
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		
	}// main method end
	
}// Scanner_04 class end