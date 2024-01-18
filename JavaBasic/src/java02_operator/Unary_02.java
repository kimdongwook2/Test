package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
		
		//	++	증가 연산자
		//	--	감소 연산자
		
		//	피연산자로 적용한 변수에 저장된 값을 1증가(감소) 시킨다
		//----------------------------------------------------------------
		
		int num;
		
		num = 15;
		
		num++;	//num변수에 저장된 값을 1 증가시킨다
		System.out.println(num);
		
		++num;	//num변수에 저장된 값을 1 증가시킨다
		System.out.println(num);

		System.out.println("-------------");
		
		num = 15;
		
		num--;
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		//------------------------------------------------------------------
		
		//** 증감 연산자는 다른 연산식과 같이 사용할 때 계산법이 달라진다
		//	-> 변수의 앞에 적용했는지 뒤에 적용했는 지에 따라 달라짐
		
		System.out.println("-------------");
		
		num = 15;
		
		System.out.println( num );
		
		System.out.println( num-- );	//감소연산자 적용, 후치 감소, 후위 감소
		
		System.out.println( num );
		
		System.out.println("-------------");
		
		num = 15;
		
		System.out.println( num );
		
		System.out.println( --num );	//감소연산자 적용, 전치 감소, 전위 감소
		
		System.out.println( num );

		//** 전위 증감연산은 변수의 값을 불러오기 전에 증/감 한다
		//** 후위 증감연산은 변수의 값을 불러온 후에 증/감 한다
		//------------------------------------------------------------------

		System.out.println("-------------");
		
		num = 13;
		
		System.out.println(num++ - 10 - ++num);
		
		
	}// main method end
	
}// Unary_02 class end