package java07_inherit.practice2.product;

public class Tv extends Product {
//	<<constructor>>
//	+ Tv(String, int)
//
//	<< method >>
//	+ out() : void {override}
//	  --> "TV" 라고 출력
	
	public Tv(String model, int price) {
		super(model,price);
	}
	
	@Override
	public void out() {
//		super.out();
		System.out.println("TV");
	}
}
