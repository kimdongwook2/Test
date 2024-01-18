package java06_class.uml;

public class Car {

	//멤버필드
	private String model;
	private String color;
	
	//생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//일반메소드
	public void display() {
		System.out.println("모델: "+model);
		System.out.println("색상: "+color);
	}

	

	//getter, setter
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}

	
	
	
}
