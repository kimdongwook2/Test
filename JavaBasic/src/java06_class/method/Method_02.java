package java06_class.method;

public class Method_02 {

	//매개변수(Parameter)
	//	-> 메소드의 ()괄호 안에 선언된 변수
	//	-> 호출될 때 입력(전달)된 데이터를 저장한다
	
	//전달인자(Argument)
	//	-> 메소드를 호출하며 ()괄호 안에 작성한 데이터이다
	//	-> 호출과 함께 전달되며 매개변수에 저장된다
	
	//반환데이터(Return Data)
	//	-> 메소드의 기능이 종료되며 되돌려주는 값이다
	
	//--------------------------------------------------------
	
	//매개변수		없음 - ()괄호 비우기
	//반환데이터	없음 - void타입으로 작성
	public void method1() {
		System.out.println("Hello");
	}
	
	//--------------------------------------------------------

	//매개변수		int parmaeter - int형 1개
	//반환데이터	없음 - void타입으로 작성
	public void method2(int parameter) {
		System.out.println("전달된 값 : "+ parameter);
	}

	//--------------------------------------------------------

	//매개변수		없음 - ()괄호 비우기
	//반환데이터	513.25 - double형 데이터
	public double method3() {
		return 513.25;
		
//		return 214; // 정상, return 타입인 double로 자동형 변환 -> 214.0
	}
	
	//** 반환데이터타입을 void가 아닌 타입으로 명시하면
	//	반드시 return코드를 작성해야 한다
	
	//--------------------------------------------------------
	
	//매개변수		double d, int n - 2개
	//반환데이터	'A' - char형
	public char method4(double d, int n) {
		return 'A'; 
	}
	
}
