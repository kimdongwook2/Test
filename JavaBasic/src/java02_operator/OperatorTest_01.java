package java02_operator;

public class OperatorTest_01 {

	public static void main(String[] args) {
		
	      int a = 5, b = 6, c = 10, d;
	      
	      d = ++a * b--; // d = (6 * 6)36 , a = 6 , b = 5
	      
	      System.out.println("a=" + a + ", b=" + b + ", d=" + d); // "a = 6, b = 5, d = 36
	      
	      d = a++ + ++c - b--; // d = (6 + 11 - 5)12, a = 7, b = 4, c = 11
	      
	      System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d); //"a = 7, b = 4, c = 11, d = 12
	      
		
	}// main method end
	
}// OperatorTest_01 class end