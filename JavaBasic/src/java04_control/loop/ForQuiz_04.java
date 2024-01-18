package java04_control.loop;

import java.util.Scanner;

public class ForQuiz_04 {
	public static void main(String[] args) {
		
//		- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//		 프로그램을 작성하라.
//			최소공배수 = 공배수 중에서 가장 작은 정수
//			최대공약수 = 공약수 중에서 절대치가 가장 큰 수

		//Scanner로 두수 입력 받기
		//for문으로 공배수, 공약수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input number 2 : ");
		int num2 = sc.nextInt();
		
		//공배수 구하기
		//작은값부터
		int res1 = 0; // 최소공배수
		int res2 = 0; // 최대공약수
		
		int i = 1;
		
		while(true) {
			
			if((num1 * i)%num2 == 0) {
				res1 = i*num1;
				break;
				
			}else if((num2 * i)%num1 == 0) {
				res1 = i*num2;
				break;
			}
			
			i++;
		}
		
		for(int j=num1; j>0; j--) {
			if(num1%j == 0 &&num2%j == 0) {
				res2 = j;
				break;
			}
		}
		
		
		//결과 값 출력
		System.out.println("최소공배수 : " + res1);
		System.out.println("최대공약수 : " + res2);
		
	}
}
