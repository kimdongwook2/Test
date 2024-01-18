package java05_array.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		//버블 정렬
		//---------------------------------------------
		
		int[] arr = { 3, 2, 5, 4, 1};
		
		//--- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//--- 버블 정렬 수행 ---
		
		//전체 회차 진행
		for (int i = arr.length; i >= 0; i--) { // i = arr.length,  arr.length ~ 1
			
			//각 회차 진행
			for (int j = 1; j < i; j++) {// j = i, j ~ i-1
				
				// 스왑 - 인접한 요소를 비교하고 왼쪽이 크면 스왑
//				if(arr[j-1] > arr[j]) { //오름차순 
				if(arr[j-1] < arr[j]) { //내림차순
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		
		//--- 결과 출력 ---
		System.out.println("--- 정렬 후 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------");
		
		int[] arr2 = {156,46,64651,654,123,845,656};
		
		Arrays.sort(arr2); // 오름차순으로 정렬하는 API
		
		System.out.println(Arrays.toString(arr2)); // 그냥 arr2로 출력하면 참조값이 출력됨 따라서 String으로 반환해 주는 API
		
	}//main end
}// BubbleSort end
