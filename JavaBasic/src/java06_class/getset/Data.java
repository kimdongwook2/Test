package java06_class.getset;

public class Data {

	private int num; //번호
	private String name; //이름
	private String phone; //전화번호 // 전화번호는 int가 아닌 String으로 선언!
	
	// Source Generater Getter and Setter 단축키
	// alt + shift + s, r, alt + a, r
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//Setter 메소드
	//	-> 외부 객체에서 호출을 통해 멤버 필드의 값을 대입(저장)할 수 있다
//	public void setNum(int num) {
//		this.num = num; // 바깥쪽 private num에 안쪽 {}중괄호 num을 저장
//	}
//	
//	//Getter 메소드
//	//	-> 외부 객체에서 호출을 통해 멤버 필드의 값을 반환(불러오기)할 수 있다
//	public int getNum() {
//		return num;
//	}
//	
//	//-----------------------------------
//	
//	//name Setter 메소드
//	public void setName(String name) {
//		this.name = name; 
//	}
//	
//	//name Getter 메소드
//	public String getName() {
//		return name;
//	}
//	
//	//-----------------------------------
//	
//	//phone Setter 메소드
//	public void setPhone(String phone) {
//		this.phone = phone; 
//	}
//	
//	
//	//phone Getter 메소드
//	public String getPhone() {
//		return phone;
//	}
	
}
