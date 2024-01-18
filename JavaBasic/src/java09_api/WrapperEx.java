package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		//int형 변수 ( 기본형 )
		int num = 10;
		
		//Deprecated
		//	-> 더 이상 사용하면 안 된다는 표시
		//	-> Wrapper생성자들은 모두 deprecated 되었음
//		Integer iVal1 = new Integer(num);
//		Integer iVal1 = new Integer("123");
		
		//Integer형 변수 (참조형)
		Integer iVal1 = 12345;
//		Integer iVal2 = "34567"; 
		Integer iVal2 = num;
		
		int i1 = iVal1;
		int i2 = iVal2;
		
		//----------------------------------------------------
		
		//자료형에 대한 정보
		System.out.println("BYTES : " + Integer.BYTES);
		System.out.println("SIZE : " + Integer.SIZE);
		
		System.out.println("Double BYTES : " + Double.SIZE);
		
		System.out.println("Boolean TRUE : " + Boolean.TRUE);
		System.out.println("Boolean FALSE : " + Boolean.FALSE);
		
		System.out.println("-------------------------");
		
		System.out.println("MIN_VALUE : "+ Integer.MIN_VALUE); // Integet 최대값
		System.out.println("MIN_VALUE : "+ Integer.MAX_VALUE); // Integet 최소값
		
		System.out.println("MIN_VALUE : "+ Long.MIN_VALUE); // Long 최대값
		System.out.println("MIN_VALUE : "+ Long.MAX_VALUE); // Long 최소값
		
		System.out.println("-------------------------");
		
		//** parce : 추출한다
		//	일정 패턴을 이용하여 원하는 형식의 데이터를 추출한다
		//	일종의 형변환
		
		//기본형 <- 문자열 ( Wrapper.parseType( String ) ) 
		int number = Integer.parseInt("789"); //String에서 int형을 꺼낸다
		double dNum = Double.parseDouble("54642.4156");
		boolean bDate = Boolean.parseBoolean("false");
		
		//문자열 <- 기본형 ( String.valueOf( data ) )
		String iStr = String.valueOf(1234); //스트링으로 바꾼다
		String bStr = String.valueOf(true); //스트링으로 바꾼다
		
	}
}
