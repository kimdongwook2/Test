package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		//입력 대상 파일 객체
		File file = new File("./src/java13_io/fileStream/", "input");
		System.out.println("exists : "+ file.exists());
		
		//파일 입력 관련 변수
		byte[] buf = new byte[1024]; // 입력 데이터 저장소
		int len = -1; //입력 데이터의 길이
		
		//최종 데이터 저장소
		StringBuilder sb = new StringBuilder();
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; // 초기화를 해야 finally에서 초기화 에러가 안남
		
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file);
			
			//파일에 읽어들일 데이터가 존재하면 반복한다
			while((len = fis.read(buf))!= -1) {
				sb.append(new String(buf, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			//FileInputStream의 생성자
			e.printStackTrace();
		} catch (IOException e) {
			//.read() 메소드

			e.printStackTrace();
		}finally {
			
			try {
				//스트림 닫기
				if(fis != null)	fis.close(); // null일 때 close() 하면 NullPointException 되기 때문에 if(fis != null)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("<< 읽어들인 파일의 데이터 >>");
		
		System.out.println(sb);
		
	}
}
