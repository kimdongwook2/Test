package java07_inherit.practice.model;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.print("사각형의 좌표 = ");
		super.draw();
		System.out.println("사각형 면적 = "+ (width*height));
		System.out.println("사각형 둘레 = "+ (2*(width+height)));
	}
	
	//getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
