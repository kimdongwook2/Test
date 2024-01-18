package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {

	private Scanner input = new Scanner(System.in);
	private Student stu = new Student();
	
	public StudentService() {
		
	}
	
	public void insertInfo() {
		System.out.print("이름을 입력하세요: ");
		stu.setName(input.nextLine());
		System.out.print("나이을 입력하세요: ");
		stu.setAge(input.nextInt());
	}
	
	public void insertScore() {
		System.out.print("국어 점수를 입력하세요: ");
		stu.setKor(input.nextInt());
		System.out.print("영어 점수를 입력하세요: ");
		stu.setEng(input.nextInt());
		System.out.print("수학 점수를 입력하세요: ");
		stu.setMath(input.nextInt());
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
		stu.setAvg((stu.getKor()+stu.getEng()+stu.getMath())/3.0);
	}
	
	public void calcSum() {
		System.out.println("총합: "+stu.getSum());
	}
	
	public void calcAvg() {
		System.out.printf("평균: %.2f",stu.getAvg());
	}
	
	public void printStu() {
		System.out.println("이름: "+stu.getName());
		System.out.println("나이: "+stu.getAge());
	}
	
//	Scanner input = new Scanner(System.in);
//	Student stu[] = new Student[3];
//	
//	public StudentService() {
//		for(int i = 0; i < stu.length; i++) {
//			stu[i] = new Student();
//		}
//	}
//	
//	public void insertInfo() {
//		for(int i = 0; i < stu.length; i++) {
//			System.out.print((i+1)+"번 이름을 입력하세요: ");
//			stu[i].setName(input.nextLine());
//			System.out.print((i+1)+"번 나이을 입력하세요: ");
//			stu[i].setAge(input.nextInt());
//			input.nextLine();
//		}
//	}
//	
//	public void insertScore() {
//		for(int i = 0; i < stu.length; i++) {
//			System.out.print((i+1)+"번 국어 점수를 입력하세요: ");
//			stu[i].setKor(input.nextInt());
//			System.out.print((i+1)+"번 영어 점수를 입력하세요: ");
//			stu[i].setEng(input.nextInt());
//			System.out.print((i+1)+"번 수학 점수를 입력하세요: ");
//			stu[i].setMath(input.nextInt());
//			stu[i].setSum(stu[i].getKor()+stu[i].getEng()+stu[i].getMath());
//			stu[i].setAvg((stu[i].getKor()+stu[i].getEng()+stu[i].getMath())/3);
//		}
//	}
//	
//	public void calcSum() {
//		for(int i = 0; i < stu.length; i++) {
//			System.out.println((i+1)+"번 총합: "+stu[i].getSum());
//		}
//	}
//	
//	public void calcAvg() {
//		for(int i = 0; i < stu.length; i++) {
//			System.out.println((i+1)+"번 평균: "+stu[i].getAvg());
//		}
//	}
//	
//	public void printStu() {
//		for(int i = 0; i < stu.length; i++) {
//			System.out.println((i+1)+"번 이름: "+stu[i].getName());
//			System.out.println((i+1)+"번 나이: "+stu[i].getAge());
//		}
//	}
	
	
	
	
}
