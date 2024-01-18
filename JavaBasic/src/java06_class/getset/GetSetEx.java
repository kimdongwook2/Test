package java06_class.getset;

public class GetSetEx {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		//에러, 외부 객체의 접근이 막혀있다
//		data.num =142;
//		System.out.println(data.num);
		
		//-----------------------------------------
		
		//Setter 호출을 통해 멤버필드에 값 저장
		data.setNum(12);
		
		//Getter 호출을 통해 멤버필드의 값 불러오기
		System.out.println( data.getNum() );
		
		//-----------------------------------------
		
		data.setName("tim");
		System.out.println( data.getName() );
				
		//-----------------------------------------
		
		data.setPhone("01011112222");
		System.out.println( data.getPhone() );
		
	}
}
