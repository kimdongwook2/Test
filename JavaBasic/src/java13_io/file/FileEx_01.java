package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		//	-> 파일 또는 디렉토리의 정보를 관리하는 클래스
		
		//	-> 파일의 내용을 가지고 있는 건 아니다
		
		//	-> 파일의 경로(폴터, 디렉토리), 파일의 이름을 저장하고 있다
		
		//	-> 파일 입출력 스트림의 입출력 대상으로 지정할 수 있다
		
		//----------------------------------------------------------------
		
		//실제 존재하는 파일
		File file1 = new File("D:/filetest/test.txt");
		
		System.out.println("File info : "+ file1);
		
		System.out.println("exists : "+ file1.exists()); //파일의 존재 유무
		System.out.println("length : "+ file1.length()); //파일의 크기
		
		System.out.println("-----------------------------");
		
		//실제 존재하지 않는 파일
		File file2 = new File("D:/filetest/file.txt");
		
		System.out.println("File info : "+ file2);
		
		System.out.println("exists : "+ file2.exists()); //파일의 존재 유무
		System.out.println("length : "+ file2.length()); //파일의 크기
		
		System.out.println("-----------------------------");
		
		//디렉토리
//		File file3 = new File("D:/filetest");
		File file3 = new File("D:/filetest/"); // '/'로 파일인 것을 구분해줌 (필수 X, 보편적으로 사용)
		
		System.out.println("File info : "+ file3);
		
		System.out.println("exists : "+ file3.exists()); //파일의 존재 유무
		System.out.println("length : "+ file3.length()); //파일의 크기
		
		System.out.println("isDirectory : "+ file3.isDirectory()); // 디렉토리인지 구분
		System.out.println("isFile : "+ file3.isFile()); // 파일인지 구분
		
		System.out.println("-----------------------------");
		
		File file4 = new File("D:/filetest/testFolder/");
		
		//Make Directory
		//	-> 경로에 해당하는 폴더가 없으면 생성한다
		file4.mkdir();
		
	}
}
