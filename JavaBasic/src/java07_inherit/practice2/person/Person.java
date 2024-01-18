package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
	private String name;
	private int money;
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product prod) {
		this.prod = prod;
		if(money < prod.getPrice()) {
			System.out.println((prod.getPrice()-money)+"원이 부족합니다");
			System.out.println("[잔액] "+ this.money +"원");
			return;
		}else {
			this.money -= prod.getPrice();
			System.out.println(this.name+"님이 "+ prod.getPrice()+"원을 지불하고 "+ prod.getModel() +"구매함");
			System.out.println("[잔액] "+ this.money +"원");
		}
		
	}
//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
