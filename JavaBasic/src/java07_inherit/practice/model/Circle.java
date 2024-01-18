package java07_inherit.practice.model;

public class Circle  extends Point{

	private int radius;
	
	//생성자
	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	public void draw() {
		System.out.print("원의 중심점 = ");
		super.draw();
		System.out.printf("원면적 = %.1f \n", (Math.PI * Math.pow(radius, 2)));
		System.out.printf("원둘레 = %.1f \n", (Math.PI * (2 * radius)));
		
	}
	
	//getter, setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
