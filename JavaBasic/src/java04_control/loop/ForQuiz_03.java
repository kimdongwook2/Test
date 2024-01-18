package java04_control.loop;

public class ForQuiz_03 {
	public static void main(String[] args) {
		
//		- 1에서 1000까지의 정수중에서 4로 나누어도
//		 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
//			> 41916
		
		//for문으로 1~1000 반복
		//if문으로 4, 6 둘다 나누어도 나머지가 1인 수 찾기
		//결과 변수에 합치기
		
		int sum = 0;
		
		for(int i=0; i<=1000; i++) {
			if(i%4 == 1 && i%6==1) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}
}
