package java04_control.loop;

import java.util.Scanner;

public class ForQuiz_05 {
	public static void main(String[] args) {
		
//		- 1에서부터 입력된 어떤 수까지 내에 있는 소수를
//		 찾는 프로그램을 작성하라.
//			* 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
//			* ex) 2,3,5,7,11,13, ...
		
		//Scanner 선언
		Scanner sc = new Scanner(System.in);

		System.out.print("Input : ");
		int num = sc.nextInt();
		
		System.out.print("1부터 "+ num + "까지의 소수 : ");
		
		for(int i=1; i<=num; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j ==0) {
					count++;
				}
			}
			if(i == 2) {
				System.out.print(i);
			}else if(count == 2) {
				System.out.print(", "+i);
			}
		}
		
		
	}
}
