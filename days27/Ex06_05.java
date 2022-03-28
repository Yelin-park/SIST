package days27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:50:02
 * @subject 5번 텍스트 파일 복사
 * @content 
 * 			fileCopy_textStream()
 * 			FileReader / FileWriter while(한문자 읽기 -> 한문자 쓰기) 반복처리
 * 			Buffered : BufferedReader / BufferedWriter 보조스트림
 * 			임시저장소(버퍼)   
 * 						[][][][][][][][]
 * 
 * 
 * 
 * 			Ex01.java 		->			프로그램				-> 			콘솔 화면 출력(출력할 때는 System.out 스트림 사용)
 * 			파일			Input(읽기)						Output(출력 , 파일 저장)
 * 			스트림 : 		FileReader						FileWriter
 * 			보조스트림 : BufferedReader br = new BR(fr);				BufferedWriter bw = new BW(fw)
 * 						버퍼 메서드에는 line 단위를 처리할 수 있는 메서드인 readline()이 있다. (끝을 만나면 null 반환)
 * 											
 */
public class Ex06_05 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		String copyPathname = "C:\\Users\\Yelin Park\\Documents\\Ex01.java";
		
		fileCopy_textStream(pathname, copyPathname);
		
	} // main

	private static void fileCopy_textStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		File f1 = new File(pathname);
		final int BUFFER_SIZE = 1024; // 임의로 잡은 버퍼(임시기억공간) 크기
		char[] buffer = new char[BUFFER_SIZE]; // 한 문자 한 문자를 저장할 char[]인 buffer 선언 및 생성
		
		try(FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(copyPathname);
			BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
			BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE); ) {
			
			String line;
			int lineNumber = 1;
			
			while ((line = br.readLine()) != null) { // BufferedReader의 readline() 메서드는 파일의 끝을 만나면 null을 돌려줌
				// System.out.println(lineNumber++ + " : " + line); // 파일 읽어와서 출력
				// > 처리 시간 : 2123300ns - 파일(2832bytes) 복사 완료!!
				fw.write(lineNumber++ + " : " + line + "\r\n"); // 파일 쓰기(저장) 작업 / "\r\n" => 개행작업
			} // while
			
			long end = System.nanoTime();
			System.out.println("> 처리 시간 : " + (end-start) + "ns - 파일(" + f1.length() + "bytes) 복사 완료!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} 
		
	} // fileCopy_textStream

} // class

/*
// 아래 코딩은 한 라인씩 읽어오는 코딩
line = br.readLine(); // 한 라인씩 읽어옴
System.out.println(lineNumber++ + " : " + line);
line = br.readLine(); // 한 라인씩 읽어옴
System.out.println(lineNumber++ + " : " + line);
line = br.readLine(); // 한 라인씩 읽어옴
System.out.println(lineNumber++ + " : " + line);
*/
