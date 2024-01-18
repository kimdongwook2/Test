package java06_class.uml.manage2;

import java.util.Scanner;

import java06_class.uml.manage.Student;

public class StudentService2 {

//	Scanner input = new Scanner(System.in);
//	Student stu = new Student();
//	
//	public StudentService() {
//		
//	}
//	
//	public void insertInfo() {
//		System.out.print("이름을 입력하세요: ");
//		stu.setName(input.nextLine());
//		System.out.print("나이을 입력하세요: ");
//		stu.setAge(input.nextInt());
//	}
//	
//	public void insertScore() {
//		System.out.print("국어 점수를 입력하세요: ");
//		stu.setKor(input.nextInt());
//		System.out.print("영어 점수를 입력하세요: ");
//		stu.setEng(input.nextInt());
//		System.out.print("수학 점수를 입력하세요: ");
//		stu.setMath(input.nextInt());
//		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
//		stu.setAvg((stu.getKor()+stu.getEng()+stu.getMath())/3);
//	}
//	
//	public void calcSum() {
//		System.out.println("총합: "+stu.getSum());
//	}
//	
//	public void calcAvg() {
//		System.out.println("평균: "+stu.getAvg());
//	}
//	
//	public void printStu() {
//		System.out.println("이름: "+stu.getName());
//		System.out.println("나이: "+stu.getAge());
//	}
	
	private Scanner input = new Scanner(System.in);
	private Student stu[] = new Student[3];
	
	
	
	public StudentService2() {
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
		}
	}
	
	public void insertInfo(int i) {
		System.out.print((i+1)+"번 이름을 입력하세요: ");
		stu[i].setName(input.nextLine());
		System.out.print((i+1)+"번 나이을 입력하세요: ");
		stu[i].setAge(input.nextInt());
//		input.nextLine();
	}
	
	public void insertScore(int i) {
		System.out.print((i+1)+"번 국어 점수를 입력하세요: ");
		stu[i].setKor(input.nextInt());
		System.out.print((i+1)+"번 영어 점수를 입력하세요: ");
		stu[i].setEng(input.nextInt());
		System.out.print((i+1)+"번 수학 점수를 입력하세요: ");
		stu[i].setMath(input.nextInt());
		stu[i].setSum(stu[i].getKor()+stu[i].getEng()+stu[i].getMath());
		stu[i].setAvg((stu[i].getKor()+stu[i].getEng()+stu[i].getMath())/3.0);
		input.nextLine();
	}
	
	public void printStu(int i) {
		System.out.print((i+1)+"번 이름: "+stu[i].getName());
		System.out.print("\t 나이: "+stu[i].getAge());
	}
	
	public void calcSum(int i) {
		System.out.print("\t 총합: "+stu[i].getSum());
	}
	
	public void calcAvg(int i) {
		System.out.printf("\t 평균: %.2f",stu[i].getAvg());
	}
	
	public Student[] getStu() {
		return stu;
	}
	
	
}
