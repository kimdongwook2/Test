package java09_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		 
		String str1 = "Apple"; //리터럴 상수
		String str2 = new String("Banana"); //객체로 생성(동적 할당) - 인스턴스화
		
		//----------------------------------------------------------------------------
		
		System.out.println("------ length() ------");
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("\"Cherry\"의 길이 : " + "Cherry".length()); // escape 문자 \" = 문법 요소가 아닌 글자로 인식하도록 한다
		
		
		
		System.out.println("\n--- toLowerCase() ------");
		System.out.println(str1 +" 을 모두 소문자로 : "+str1.toLowerCase());
		
		System.out.println("\n--- toUpperCase() ------");
		System.out.println(str1 +" 을 모두 소문자로 : "+str1.toUpperCase());
		
		System.out.println("\n--- chatAt() ------");
		System.out.println(str1 +"의 4번째 글자는 : " + str1.charAt(3));
		
		System.out.println("\n--- replace() ------");
		System.out.println(str2+"의 \'n\' 을 \'x\'로 변경 : "+str2.replace("n", "x"));
		
		System.out.println("\n--- contains() ------");
		System.out.println("\'e\'를 포함하고 있나요? "+str1.contains("e"));
		System.out.println("\'c\'를 포함하고 있나요? "+str1.contains("c"));
		
		System.out.println("\n--- substring() ------");
		//문자열의 일부를 발췌한다
		
		String sub1 = str1.substring(2);
		System.out.println("sub1 : " + sub1);
		
		String sub2 = str1.substring(1, 3);
		System.out.println("sub2 : " + sub2);
		
//		char[] ch = str1.toCharArray();
//		System.out.println(Arrays.toString(ch));
	}
}
