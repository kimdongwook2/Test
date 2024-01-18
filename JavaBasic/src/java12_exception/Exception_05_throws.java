package java12_exception;

class ThrowsTest {
	public void method1() throws RuntimeException {
		
		//Unchecked Exceptoin
		throw new RuntimeException();
		
	}
	
	public void method2() throws Exception {
		
		//Checked Exception
		throw new Exception();
		
	}
}

public class Exception_05_throws {
	public static void main(String[] args) { // JVM이 메인 실행
		
		//throws 키워드
		//	예외 처리 떠넘기기
		//	예외 처리 미루기
		
		//	예외가 발생한 메소드에서 직접 예외처리(try~catch)를 하지 않고
		//	자신을 호출한 메소드(Caller)에게 예외 처리를 떠넘기는 키워드
		
		//	예외가 발생한 상황에 대한 책임을 Caller 에게 묻는 것이다
		
		//	-> 코드를 개발하는 사람이 try-catch를 적용해야만 한다
		//----------------------------------------------------------------
		
		ThrowsTest tt = new ThrowsTest();
		
		//Unchecked Exception 예외
		try {
			tt.method1();			
		} catch (Exception e) {
			System.out.println("Unchecked 예외 처리!");
		}

		System.out.println("---------------------------");
		
		try {
			tt.method2();
		} catch (Exception e) {
			System.out.println("Checked 예외 처리!");
//			e.printStackTrace();
		}
		
		
	}
}
