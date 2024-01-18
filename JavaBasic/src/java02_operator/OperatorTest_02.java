package java02_operator;

public class OperatorTest_02 {
	public static void main(String[] args) {
		
		
	      int a = 5, b = 6, c = 10;

	      boolean res1;
	      res1 =  a < b || --a > c++; // res1 = true
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c); // a = 5 b = 6 c = 10

	      
	      boolean res2;
	      res2 = c<b++ && c-->++a; // res2 = false
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c); // a = 5 b = 7 c = 10
	      
	      //논리연산의 단축수행
	      //	AND연산은 왼쪽 피연산자가 false라면 오른쪽항 연산을 수행하지 않는다
	      //	OR연산은 왼쪽 피연산자가 true라면 오른쪽항 연산을 수행하지 않는다
		
	}// main method end
	
}// OperatorTest_01 class end