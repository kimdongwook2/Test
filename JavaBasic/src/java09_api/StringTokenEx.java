package java09_api;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
	public static void main(String[] args) {
		
		//문자열 토큰, String Token
		//	-> 특정 규칙을 이용해서 문자열을 구분하는 단위
		
		//	ex) "1,2,3,4,5"
		//		-> "," 를 이용해서 구분한다 - 구분자(delimiter)
		//		-> 토큰 : "1", "2", "3", "4", "5"
		//-------------------------------------------------------
		
		//문자열의 토큰화 (Tokenize)
		
		String data1 = "Hi HELLO HOLA";
		
		String[] tokens = data1.split(" ");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		System.out.println(Arrays.toString(tokens));
		
		System.out.println("-----------------");
		
//		String data2 = "I!@#$am!@#$spider!@#$man"; // $는 안됨  $는 정규식에서 마지막 글자를 뜻함
		String data2 = "I!@#am!@#spider!@#man"; // 구분하기 어려운 것 보다 구분하기 쉬운 , 를 자주 사용함
		
		tokens = data2.split("!@#");
		
		for(String token : tokens) {
			System.out.println(token);
		}
		System.out.println(Arrays.toString(tokens));
		
		System.out.println("--------------------");
		
		StringTokenizer st1 = new StringTokenizer(data1); // 기본 구분자(default) : 공백문자
		
		System.out.println("토큰의 개수 : "+ st1.countTokens());
		
		//.nextToken() 메소드
		//	현재 토큰 문자열을 반환한다
		//	다음 토큰을 반환할 준비를 한다
		
		//.hasMoreToken() 메소드
		//	반환할 토큰이 남아있는지 boolean값으로 리턴한다
		
		//토큰이 존재하는 만큼 반복하기
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
 		System.out.println("--------------------");
 		
 		StringTokenizer st2 = new StringTokenizer(data2, "!@#!");
 		
 		System.out.println(st2.nextToken());
 		System.out.println(st2.nextToken());
 		System.out.println(st2.nextToken());
 		System.out.println(st2.nextToken());
 		
 		
 		//예외 발생
 		//	-> NoSuchElementException
 		//	-> nextToken()으로 반환할 데이터가 더 이상 존재하지 않는다
// 		System.out.println(st2.nextToken());
 		
		
	}
}
