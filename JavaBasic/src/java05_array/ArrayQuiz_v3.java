package java05_array;

import java.util.Arrays;

public class ArrayQuiz_v3 {
	public static void main(String[] args) {

//		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		 배열이 선언된 뒤 문제를 푸시오
//
//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//		 - arr 배열의
//		  (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//		  구하시오
//		     => -5
//
//		 - arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		  rank_arr라는 배열에 순위를 입력하시오
//		    => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		     => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		    ** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//		    
//		    출력한다면 (정렬도 할 수 있으면 해도 됨)
//		    => over_arr : 9, 10
//		    => ret_arr : 3, 8, 13, 17, 21, 27
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		//----------------------------------------------------
		int[] invert_arr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			invert_arr[i] = arr[arr.length-i-1];
		}
		
		System.out.print("1번 invert_arr : ");
		for (int i = 0; i < invert_arr.length; i++) {
			if(i != invert_arr.length-1) {
				System.out.print(invert_arr[i] + ", ");
			}else {
				System.out.println(invert_arr[i]);
			}
			
		}
		//----------------------------------------------------
		System.out.println();
		System.out.println("--------------------------");
		
		//짝수, 홀수 변수 선언
		int even = 0;
		int odd = 0;
		
		//for문 사용해서 짝수, 홀수 인덱스의 모든 값 더하기
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				even += arr[i];
			}else{
				odd += arr[i];
			}
		}
		
		//even - odd 값 출력
		
		System.out.println("2번 : " + (even-odd));
		
		//----------------------------------------------------
		System.out.println();
		System.out.println("--------------------------");
		
		//rank_arr 선언
		
		int rank_arr[] = new int[arr.length];
		
		//이중 for문 사용
		// 배열의 i번째 숫자를 반복하여 비교후 그 값보다 클시 +1
		
		for (int i = 0; i < arr.length; i++) {
			rank_arr[i]++;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					rank_arr[j]++;
				}
			}
		}
		
		//결과 값 출력
		System.out.print("3번 rank_arr : ");
		
		for (int i = 0; i < rank_arr.length; i++) {
			if(i != rank_arr.length-1) {
				System.out.print(rank_arr[i] + ", ");
			}else {
				System.out.println(rank_arr[i]);
			}
			
		}
		
		//----------------------------------------------------------------
		
//		 - arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
//		  않은 값은 ret_arr에 입력하시오
//		    ** over_arr, ret_arr은 길이가 10인 배열로 작성한다
		System.out.println();
		System.out.println("--------------------------");
		
		//over_arr, ret_arr 선언
		
		int over_arr[] = new int[10];
		int ret_arr[] = arr;
		int overLeng = 0;
		int retLeng = 0;
		
		//이중 for문으로 i 값과 j 값이 같다면 그 값을 over_arr에 넣기
		//반대로 ret_arr값은 arr과 동일하게 설정 후 중복된 값이 있다면 0 으로 바꾸기
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i!=j) {
					over_arr[i] = arr[i]; // 중복 값 넣기
					ret_arr[i] = 0; // 중복 값 빼기
					ret_arr[j] = 0; // 중복 값 빼기
				}
			}
		}
		
		
		
		
		
		//결과 출력
		System.out.print("=> ret_arr : ");
		for (int i = 0; i < over_arr.length; i++) {
			if(over_arr[i] != 0) {
				System.out.print(over_arr[i]+"  ");
			}
		}
		System.out.println();
		
		//결과 출력
		System.out.print("=> over_arr : ");
		for (int i = 0; i < ret_arr.length; i++) {
			if(ret_arr[i] != 0) {
				System.out.print(ret_arr[i]+"  ");
			}
		}
		
		
		//---------------------------------------------------------------------
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("오름차순");
		
		
		//결과 값의 배열의 개수 구하기
		for (int i = 0; i < over_arr.length; i++) {
			if(over_arr[i] != 0) {
				overLeng++;
			}
		}
		
		for (int i = 0; i < ret_arr.length; i++) {
			if(ret_arr[i] != 0) {
				retLeng++;
			}
		}
		
		//결과 값 배열 만들기
		int over_arr2[] = new int[overLeng];
		int ret_arr2[] = new int[retLeng];
		
		//반복문에서 배열개수 추가시에 카운팅 변수 선언
		int overCount = 0;
		int retCount = 0;
		
		//for문으로 over_arr 배열 만들기
		for (int i = 0; i < over_arr.length; i++) {
			if(over_arr[i] != 0) {
				over_arr2[overCount] = over_arr[i];
				overCount++;
			}
		}
		
		
		//for문으로 ret_arr 배열 만들기
		for (int i = 0; i < ret_arr.length; i++) {
			if(ret_arr[i] != 0) {
				ret_arr2[retCount] = ret_arr[i];
//				System.out.print(ret_arr2[retCount]+" ");
				retCount++;
				
			}
		}
		
		//오름차순 정렬
		Arrays.sort(over_arr2);
		Arrays.sort(ret_arr2);
		
		
		//결과 값 출력
		System.out.print("=> over_arr : ");
		for (int i = 0; i < over_arr2.length; i++) {
			if(i != over_arr2.length-1) {
				System.out.print(over_arr2[i] + ", ");
			}else {
				System.out.println(over_arr2[i]);
			}
			
		}
		
		System.out.print("=> ret_arr : ");
		for (int i = 0; i < ret_arr2.length; i++) {
			if(i != ret_arr2.length-1) {
				System.out.print(ret_arr2[i] + ", ");
			}else {
				System.out.println(ret_arr2[i]);
			}
			
		}
		
		
		
	}// main end
}// ArrayQuiz end





