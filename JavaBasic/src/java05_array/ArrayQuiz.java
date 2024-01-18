package java05_array;

import java.util.Scanner;

public class ArrayQuiz {
	public static void main(String[] args) {
		
	//   5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
	//   그 후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
	//
	//   - 필요한 배열
//	    1. 각 층의 사는 인원을 담는 배열 arr[6]
//	      // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//	      
//	    2. 각 층의 관리비 배열 arr2[6]
//	      // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
	//
	//   ----------------------- 입력 (입력시 for문을 이용한다.)
	//   1층의 사는 인원은 ? 4
	//   2층의 사는 인원은 ? 5
	//   3층의 사는 인원은 ? 11
	//   4층의 사는 인원은 ? 2
	//   5층의 사는 인원은 ? 8
	//   ----------------------- 출력 (출력시 for 문을 이용한다.)
	//   1층의 총 관리비 : 48000원
	//   2층의 총 관리비 : 60000원
	//   3층의 총 관리비 : 132000원
	//   4층의 총 관리비 : 24000원
	//   5층의 총 관리비 : 96000원
	//
	//   건물에 사는 총 인원은 30명입니다.
	//   관리비의 총 금액은 360000원 입니다.   
		
		//입력하기 위한 Scanner 선언
		// 5층의 array 선언
		// for문으로 반복하여 인원 입력 받기
		// 입력받은 인원의 각각 관리비 구하기
		//인원과 관리비 합산하기
		
		//입력하기 위한 Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		// 5층의 array 선언 
		// 필요한 변수 선언
		int[] arr = new int[5]; // 5개의 층
		int[] arr2 = new int[5]; // 5개의 층 관리비
		int num; //입력값
		int peoples = 0;
		int sum = 0;
		
		// for문으로 반복하여 인원 입력 받기
		System.out.println("---------- 인원 -----------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"층의 사는 인원은 ? ");
			num = sc.nextInt();
			peoples += num; // 인원 합산
			arr[i] = num; // i 층에 인원 넣기
			arr2[i] = num*12000;
		}
		
		// 입력받은 인원의 각각 관리비 구하기
		System.out.println();
		System.out.println("---------- 관리비 -----------");
		for (int i = 0; i < arr.length; i++) {
//			int money = arr[i]*12000;// i 층의 관리비
//			System.out.println((i+1)+"층의 총 관리비 : "+ (money));
			System.out.println((i+1)+"층의 총 관리비 : "+ arr2[i]);
			sum += arr2[i]; // i층 관리비 총합에 합산
		}
		
		//인원과 관리비 합산하기
		System.out.println();
		System.out.println("---------- 결과 -----------");
		System.out.println("건물에 사는 총 인원은 "+peoples+ "명 입니다");
		System.out.println("관리비의 총 금액은 "+sum+ "원 입니다");
		
		
		
	}//main end
}// ArrayQuiz end
