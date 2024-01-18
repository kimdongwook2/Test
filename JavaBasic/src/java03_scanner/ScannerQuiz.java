package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	public static void main(String[] args) {
		
		   //3과목 점수 관리 프로그램
		   
		   //   국어, 영어, 수학
		   //   점수를 저장할 수 있는 변수를 만들고
		   //   3과목 점수를 입력받는다

		   //   총점과 평균을 포함한 결과를 출력한다

		//동작 예시)
		   
		//===== 입력 =====
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//국어   영어   수학   총점   평균
		//100   99   97   296   98.666666667
		
		//------------------------------------------------
		
		//scanner 키보드 입력 객체 생성
		Scanner in = new Scanner( System.in );
		
		// 각 과목의 점수 입력 및 변수 만들기
		System.out.print("Input Korean : ");
		int kr = in.nextInt();
		
		System.out.print("Input English : ");
		int en = in.nextInt();
		
		System.out.print("Input Mathematics : ");
		int math = in.nextInt();
		
		// 총점과 평균 변수 만들기
		int sum = kr + en + math;
		double avg = sum / (double)3;
		
		// 결과 출력
		System.out.println("======= 출력 =======");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kr +"\t"+ en +"\t"+ math +"\t"+ sum +"\t"+ avg);
		
		//scanner 반납
		in.close();
	}
}
