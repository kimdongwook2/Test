package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {
		
	   //Quiz.
	//   첫날에 10원을 예금하고,
	//   다음날에는 전날의 2배를
	//   예금하는 방식으로
	//   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		
		//	반복횟수 : 15번
		//	반복구간 : 1~15
		
		//	반복코드
		//	res *= 2; //전날의 두배 추가
		
		//	날짜		int i
		//	예금하는 돈 int money
		//	결과값		int res
		
		//	예금액 2배로 증가시키기
		//	총 금액에 추가하기
		
		//-------------------------------------------
		
		int money = 10;	//예금액
		int res = 0;	//총 금액
		
		for(int i = 0; i < 15; i++) {// int i = 0; 날짜
			
			//총 금액에 추가하기
			res += money;
			
			System.out.println((i+1) + "일 예금액 : "+ money);
			System.out.println((i+1) + "일 총 금액 : "+ res);
			System.out.println("------------------------------");
			
			//예금액 2배로 증가시키기
			money *= 2;
		}
		
		System.out.println("예금 총액 : " + res + "원");
		
	}// main method end
}// For_07 class end
