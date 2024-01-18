package java07_inherit.practice2.product;

public class Computer extends Product{
//	class Computer extends Product
//	---------------
//	---------------
//	<<constructor>>
//	+ Computer(String, int)
//
//	<< method >>
//	+ out() : void {override}
//	  --> "Computer" 라고 출력
	public Computer(String model, int price) {
		super(model,price);
	}
	
	@Override
	public void out() {
//		super.out();
		
		System.out.println("Computer");
	}
	
}
