package days27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:50:02
 * @subject 4번 텍스트 파일 복사
 * @content 파일 -> 읽기(FileReader) / [쓰기(FileWriter) -> 파일]
 * 				fileCopy_textStream() 메서드 생성
 */
public class Ex06_04 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		String copyPathname = "C:\\Users\\Yelin Park\\Documents\\Ex01.java";
		
		fileCopy_textStream(pathname, copyPathname);
		
	} // main

	private static void fileCopy_textStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		File f1 = new File(pathname);
		
		// try-with-resources 문
		try(FileReader fr = new FileReader(f1); FileWriter fw = new FileWriter(copyPathname); ) {
			int c;
			while ((c = fr.read()) != -1) { // 파일에 한 문자씩 읽기
				fw.write(c); // 파일에 한 문자씩 저장(쓰기)
			}
			long end = System.nanoTime();
			System.out.println("> 처리 시간 : " + (end-start) + "ns - 파일(" + f1.length() + "bytes) 복사 완료!!"); // > 처리 시간 : 7319900ns - 파일(2832bytes) 복사 완료!!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} 
		
	} // fileCopy_textStream

} // class
