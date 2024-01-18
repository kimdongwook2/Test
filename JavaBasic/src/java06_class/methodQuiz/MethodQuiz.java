package java06_class.methodQuiz;

public class MethodQuiz {

	//Q1. 1~100 출력 기능
	
	public void print100() {
		
		//for문으로 print 1 ~ 100
		for(int i = 1; i <= 100; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	//Q2. 전달인자만큼 "Hello" 반복 출력
	
	// 매개변수	int num;
	public void printHello(int num) {
		
		//for문으로 num 만큼 print Hello
		for(int i = 0; i < num; i++) {
			System.out.println("Hello");
		}
	}
	
	//Q3. 전달인자 숫자만큼
	//	전달인자 문자열을 반복 출력
	
	//매개변수 int num, String data
	public void printData(int num, String data) {
		
		//for문으로 num 만큼 print data
		for(int i = 0; i < num; i++) {
			System.out.println(data);
		}
	}
	
}
