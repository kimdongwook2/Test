package java06_class.uml.manage2;

public class StudentEx2 {
	public static void main(String[] args) {
		
		StudentService2 ss = new StudentService2();
		int num = ss.getStu().length;
		
		for(int i = 0; i < num; i++) {
			ss.insertInfo(i); //이름과 나이 입력
			ss.insertScore(i); //국영수 점수 입력
		}
		
		for(int i = 0; i < num; i++) {
			ss.printStu(i); //학생 정보 출력
			ss.calcSum(i); // 총합 출력
			ss.calcAvg(i); // 평균 출력
		}
		
		
	}
}









