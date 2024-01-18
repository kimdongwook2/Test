package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = { 3, 4124, 4, 21, 4124, 546578 , 412, 412, 42};
		
		//** 배열의 길이
		//	요소의 개수
		//	배열의 크기
		
		//	-> 배열이름.length
		
		//	ex)	 arr.length
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("-----------------------");
		
		//배열의 모든 요소 출력하기 - for
		
		//0 ~ arr.length-1
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"번째 요소 : "+arr[i]);
		}
		
		//----------------------------------------------------
		
		//for타이핑, ctrl+space
		//	-> for문 자동완성에 배열의 길이만큼 으로 추천된다
		for (int i = 0; i < arr.length; i++) {
			
		}
		
	}//main end
}// Array_03 end
