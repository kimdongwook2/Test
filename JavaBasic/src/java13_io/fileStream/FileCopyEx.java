package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
	public static void main(String[] args) {
		
		// 	Quiz
		
		//	Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
		//	-> 파일 복사
		
		//	->49,520,698 bytes
		
		//	Source.txt --> FileCopy --> Destination.txt
		
		//--------------------------------------------------------------------------
		
		//입력 대상 파일 객체
		File fileIn = new File("./src/java13_io/fileStream/", "Source.txt");
		File fileOut = new File("./src/java13_io/fileStream/", "Destination.txt");
		
		
		//파일 입력 스트림 객체
		FileInputStream fis = null;
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		
		byte[] buf = new byte[8192];
		int len = -1; //입출력 크기
		int total = 0; //총 입출력 크기
		
		//최종 데이터 저장소
//		StringBuilder sb = new StringBuilder();
		
		try {
			//입출력 스트림 생성
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);// 쓰기 모드
			
			while((len = fis.read(buf))!= -1) {
				
				//파일 출력
				fos.write(buf, 0 , len);
				fos.flush();
				
				//복사된 바이트 수 총합
				total += len;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				//스트림 닫기
				if(fis != null)	fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fos != null)	fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Destination에 복사된 용량 : "+ total + " bytes");
		
		//getBytes할 수있게 String으로 형변환 
//		String sb1 = String.valueOf(sb); 
		
		
		
//		try {
////			fos = new FileOutputStream(fileOut);// 쓰기 모드
//			
//			//파일 출력
//			String data = sb1;
//			fos.write(data.getBytes(), 0 , data.length());
//			fos.flush();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				//스트림 닫기
//				if(fos != null)	fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
	}
}
