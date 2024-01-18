package java07_inherit;

class Parent5 {
	public void display() {
		System.out.println("부모 클래스");
	}
}

//final class Child5 extends Parent5 {
class Child5 extends Parent5 {
	@Override
	public final void display() {
		System.out.println("자식 클래스 오버라이딩");
	}
}

class GrandChild extends Child5 {
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
}

public class InheritEx_05 {
	public static void main(String[] args) {
		
		//Object는 모든 참조형의 부모
//		Object obj1 = new Parent5();
//		Object obj2 = new String("a");
//		Object obj3 = new Child5();
	}
}
