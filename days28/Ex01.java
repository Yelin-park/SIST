package days28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 9:03:19
 * @subject 실행파일 복사하기(교재에는 없음)
 * @content 실행파일은 문자 스트림으로 읽으면 안됨X 2바이트씩 읽으면 데이터를 못가져옴
 * 				int read(), 읽을게 없으면 -1 반환
 */
public class Ex01 {
	
	public static void main(String[] args) {
		String pathname = "C:\\Program Files (x86)\\CBT\\CBT.exe";
		String copyPathname = "C:\\Users\\Yelin Park\\Documents\\CBT.exe";
		
		fileCopy_byteStream(pathname, copyPathname);

	} // main

	private static void fileCopy_byteStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		File f1 = new File(pathname);
		// PrintStream ps = System.out; // 화면에 출력하는 스트림 객체, 바이트 스트림
		try(FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(copyPathname); ) {
			int b;
			while( (b = fis.read()) != -1) {
				// ps.write(b); 
				// ps.print(b); // 한바이트씩 출력
				fos.write(b); // 파일로 복사
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		long end = System.nanoTime();
		System.out.println("> 처리 시간 : " + (end-start) + "ns - 파일(" + f1.length() + "bytes) 복사 완료!!");
		
	} // fileCopy_byteStream

} // class

/*
* 스트림 ?
* 스트림 종류
* 	1) 방향
* 	2) 대상
*
*
*/


