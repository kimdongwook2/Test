package java06_class.methodQuiz;

import java.util.Arrays;

public class MethodArrayQuiz {

	//1. arr배열의 모든 요소 10배가 되도록 작성
	
	//매개변수 int[] arr
	public void mul10(int[] arr) { // arr 얕은 복사
		
		//arr 배열 모두 10배가 되도록 반복
		for(int i = 0; i < arr.length; i++) {
			arr[i] *= 10; // 얕은 복사로 Ex의 값도 10배가 된다
		}
	}
	
	
	
	//2. arr배열의 모든 요소 출력되도록 작성
	
	//매개변수 int[] arr
	public void print(int[] arr) {
		
		//arr배열 모두 출력
		System.out.println(Arrays.toString(arr));
	}
	
	
}
