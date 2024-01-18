package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuiz {


	
	//랜덤, Scanner 선언
	private Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	public void updown() {
		int com = ran.nextInt(50) + 1; // 1 ~ 50 난수 선정
		
		//플래그
		boolean isExist = true;
		for(int i = 0; i < 7; i++) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if(num < 0 || num > 50) {
				System.out.println("잘못입력하셨어요");
				i--;
				continue;
			}else if(num == com) {
				System.out.println("정답입니다!");
				isExist = false;
				break;
			}else if(num > com) {
				System.out.println(num + " 보다 Down!");
				continue;
			}else if(num < com) {
				System.out.println(num + " 보다 Up!");
				continue;
			}
		}
		//7턴 끝나면 패배 플래그
		if(isExist) {
			System.out.println("패배!");
		}
		
	}
	
	public void baskin() {
		
		// 진행 숫자
		int num = 0;
		
		while (num < 30) {
			System.out.println();
			
			System.out.print("입력 : ");
			int my = sc.nextInt();
			//computer 난수
			int com = ran.nextInt(3) + 1;
			
			
			if(my < 0  || my > 3) {
				System.out.println("잘못입력하셨어요");
			}else {
				System.out.print("마이턴 : ");
				
				if(num + my == 30) {
					for(int i = 0; i< my; i++) {
						System.out.print(num + 1 + " ");
						num++;
					}
					System.out.println("승리!");
					break;
				}else if(num + my >= 31){
					System.out.println("패배!");
					break;
				}else { //반복
					for(int i = 0; i< my; i++) {
						System.out.print(num + 1 + " ");
						num++;
					}
				}
				
				System.out.print("컴퓨터 : ");
				// 내턴이 넘어가고 num 27 이상일 때 컴퓨터의 승리 아닐시 반복
				if(num >= 27) {
					com = 30 - num;
					for(int i = 0; i < com; i++) {
						System.out.print(num + 1 + " ");
						num++;
					}
					System.out.println();
					System.out.println("패배");
					break;
				}else { // 반복
					for(int i = 0; i < com; i++) {
						System.out.print(num + 1 + " ");
						num++;
					}
				}
			}
		}
		
	}
	
}
