package java04_control.loop;

import java.util.Scanner;

public class ForQuiz_02 {
	public static void main(String[] args) {
		
//		- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//		약수 = 어떤 수를 정수로 나눌 수 있는 수
		
		//Scanner, for문 사용
		//반복하면서 약수 찾기
		//총 약수의 변수 선언
		
		Scanner sc = new Scanner(System.in);
		
		String res = "";
		System.out.print("Input >> ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수 : ");
		for(int i=1; i<=num; i++) {
			if(num == i) {
				System.out.print(i);
			}else if(num % i == 0) {
				System.out.print(i+", ");
			}
		}
		
		System.out.println(res);
		
	}
}
