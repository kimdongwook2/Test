package java05_array;

public class Array_05 {
	public static void main(String[] args) {
		
		//문자열
		String str = "Apple";
		
		//----------------------------------------------------
		
		//String배열
		String[] strArr = null;
//		System.err.println(strArr);
		
		//String배열 공간(요소) 생성 (3개)
		strArr = new String[3]; // 데이터타입 = String[] (스트링 '배열')
		
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i+" 번째 요소 : "+strArr[i]);
			System.out.println(i+" 번째 요소의 길이 : "+strArr[i].length());
			System.out.println("--------------------------------");
		}
		
		// strArr -> String[]
		// strArr.length -> 배열의 길이(3개의 문자열)
		
		// strArr[i] -> String
		// strArr[i].length() -> i 인덱스 문자열의 길이
		
				
		
	}// main end
}// Array_05 end
