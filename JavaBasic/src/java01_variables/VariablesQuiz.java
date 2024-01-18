package java01_variables;

public class VariablesQuiz {
	public static void main(String[] args) {
		
		// 변수에 알맞은 타입을 골라
		   // 선언하고
		   // 대입한 후
		   // 모든 변수의 데이터를 출력해보자.

		   // 이름, 나이, 성별, 키
		
		   //   출력 예시
		   //   이름 : Alice
		   //   나이 : 99
		   //   성별 : 남
		   //   키 : 222.66

		   //   ex)
		   //   System.out.println("이름 : " + name);
		
		//**변수에 알맞은 타입을 골라
		
		//	이름 - 문자열				-> String
		//	나이 - 정수					-> int
		//	성별 - 단일 문자, 문자열	-> char
		// 	키 - 실수					-> double
		
		//**선언하고
//		String name; 	//이름
//		int age; 		//나이
//		char gender; 	//성별
//		double height; 	//키

		//**대입한 후
//		name = "Tim";
//		age = 25;
//		gender = 'M';
//		height = 180.1;
		
//		System.out.println( "이름 : " + name );
//		System.out.println( "나이 : " + age );
//		System.out.println( "성별 : " + gender );
//		System.out.println( "키 : " + height );
		
		
		String name = "Alice";
		int age = 99;
		char gender = '남';
		double height = 222.66;
		
		System.out.println( "이름 : " + name );
		System.out.println( "나이 : " + age );
		System.out.println( "성별 : " + gender );
		System.out.println( "키 : " + height );
		
		System.out.println("----------------");
		
		System.out.println( "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height );
		
		System.out.println("----------------");
		
		//print() 출력은 마지막에 줄바꿈을 하지 않는다
		//ln은 line의 줄임말이며 줄 넘김을 의미함 따라서 println()은 출력후 줄넘김
		
		System.out.print("AAA");
		System.out.print("BBB");
		
		//출력에서 줄바꿈을 해주는 코드
		//	-> ()괄호를 비우고 println를 사용한다
		System.out.println();
		
		System.out.println("----------------");
		
		System.out.print( "이름 : " + name );
		System.out.print( ", 나이 : " + age );
		System.out.print( ", 성별 : " + gender );
		System.out.println( ", 키 : " + height );
		
		System.out.println("----------------");
		
		System.out.println("HI HELLO HOLA");
		
		System.out.println("----------------");
		
		System.out.println("HI\nHELLO\nHOLA");
		
		//**	'\n' : 줄바꿈 문자, 개행 문자
		//		( ASCII 10 - LF, Line Feed )
		
		System.out.println("----------------");
		
		System.out.println("Apple");
		
		System.out.print("Apple\n");
		
		System.out.print("Apple");
		System.out.print("\n");
		
		System.out.print("Apple");
		System.out.println();
		
		
	}// main method end
	
}// VariablesQuiz class end








