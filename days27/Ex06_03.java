package days27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:50:02
 * @subject 3번 텍스트 파일 복사
 * @content 파일 -> 읽기(FileReader) / [쓰기(FileWriter) -> 파일]
 * 
 */
public class Ex06_03 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		// 내PC > 문서 경로 : C:\Users\Yelin Park\Documents -> 복사할 위치 	*** [\\파일명.확장자] 꼭 붙이기!! ***
		String copyPathname = "C:\\Users\\Yelin Park\\Documents\\Ex01.java";
		File f1 = new File(pathname);
	
		// try-with-resources 문
		try(FileReader fr = new FileReader(f1); FileWriter fw = new FileWriter(copyPathname); ) {
			int c;
			while ((c = fr.read()) != -1) { // 파일에 한 문자씩 읽기
				// System.out.printf("%c", (char)c);
				fw.write(c); // 파일에 한 문자씩 저장(쓰기)
			}
			System.out.println("파일 복사 완료!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} 
		
	} // main

} // class
