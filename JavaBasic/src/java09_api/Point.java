package java09_api;

public class Point implements Cloneable {

	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//----------------------------------------------------------
	
	//toString 자동 생성 단축키 : alt + shift = s, s


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	

	
	
//	@Override
//	public String toString() { // 객체를 toString 할때 실행
////		return super.toString();
//		return "("+x+", "+y+")";
//	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		//기존 코드 : 동일성 비교
////		return super.equals(obj);
//		
//		//p2.equals(p3);를 호출했을 경우
//		//	-> 기준은 p2객체
//		//	-> p2객체를 통해 메소드를 호출했다
//		
//		//	-> 전달인자는 p3객체
//		
//		//	-> this == p2
//		//	-> obj == p3
//		
//		if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
//			return true; //동등하다
//		}
//		return false; //동등하지 않다
//	}
	
	//hash,equals 자동 생성 단축키 : alt + shift + s, h
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(x, y);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//getter, setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
