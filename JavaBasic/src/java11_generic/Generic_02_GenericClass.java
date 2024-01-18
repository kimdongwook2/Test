package java11_generic;

//class Class02_int {
//	private int data;
//
//	public int display(int data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//}


// 제네릭 클래스
// 	->타입을 TYPE으로 비워둔다 주로 TYPE의 약자 T를 자주 씀
// 	->Class02<Integer>라고 사용하면 Integer 타입으로 실행한다
class Class02<T> {
	private T data;

	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
		//타입 파라미터를 결정하지 않음
		//	-> Object타입으로 자동 결정
		//	-> raw type
		Class02 c01 = new Class02();
		
		c01.setData(12345);
		
		int num = (int)c01.getData();
		
		//----------------------------------------
		
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		
		String fruit = c02.getData();
		
		System.out.println(fruit);
		
	}
}
