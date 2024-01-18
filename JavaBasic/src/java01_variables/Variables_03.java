package java01_variables;

public class Variables_03 {
	public static void main(String[] args) {
		
		// number라는 이름의 변수 선언
		int number;
		// -> 변수를 처음 선언하면 "쓰레기값"이 저장되어 있다
		
		//변수 대입(초기화)
		number = 123;
		
		// -> 자바 언어는 "쓰레기값"이 저장된 변수를 사용하면
		// 	문법 에러로 처리한다
		// -> 초기화 이후에는 정상 동작한다
		System.out.println( number );
		
		System.out.println("--------------------");
		
		//선언과 동시에 초기화
		int number2 = 678;
		// -> 쓰레기값이 들어가지 않고 곧바로 값을 초기화한다
		
		System.out.println(number2);
		
		System.out.println("--------------------");
		
		double pi = 3.14;
		boolean isRight = true;
		char alpha = 'T';
		
		String name = "Alice";
		
	}// main method end
	
}// Variables_03 class end
