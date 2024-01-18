package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx2 {
	public static void main(String[] args) {
		
		//입력 대상 파일 객체
		File fileIn = new File("./src/java13_io/fileStream/", "Source.txt");
		File fileOut = new File("./src/java13_io/fileStream/", "Destination.txt");
		
		
		//파일 입력 스트림 객체
//		FileInputStream fis = null;
		//파일 출력 스트림 객체
//		FileOutputStream fos = null;
		
		byte[] buf = new byte[8192];
		int len = -1; //입출력 크기
		int total = 0; //총 입출력 크기
		
		
		try(	FileInputStream fis = new FileInputStream(fileIn);
				FileOutputStream fos = new FileOutputStream(fileOut)) { // try - width - resources
			
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
		}
		
		System.out.println("Destination에 복사된 용량 : "+ total + " bytes");
		
		
		
		
	}
}
