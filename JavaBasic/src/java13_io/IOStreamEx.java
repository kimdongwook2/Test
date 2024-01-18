package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamEx {
	public static void main(String[] args) {
		
		//키보드 입력 스트림 -> 프로그램 -> 모니터 출력 스트림
		
		InputStream is = System.in;
		OutputStream os = System.out;
		
		byte[] buf = new byte[1024]; //입출력 데이터의 임시 저장소
		int len = -1; //입력 데이터의 길이
		
		try {

			//입력 데이터가 EOF가 될 때까지 반복적으로 입력한다
			while((len  = is.read(buf)) != -1){
				
				System.out.print("출력 : ");
				//입력 받는 데이터를 출력한다
				os.write(buf, 0, len);
				
				//출력 버퍼 비우기
				os.flush();
				
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			
			try {
				if(is!=null)	is.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				//스트림 닫기
				if(os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
}
