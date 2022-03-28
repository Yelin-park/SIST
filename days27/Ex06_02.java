package days27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:50:02
 * @subject 2번  Ex01.java을 읽어서 File f1 객체로 만들고 읽기 작업(Input)해서 화면 출력(Ouput)하기
 * @content 
 * 	 		Ex01.java을 읽어서 File f1 객체로 만들고 읽기 작업(Input)해서 화면 출력(Ouput)
 *			Ex01.java -> File f1 -> 읽기 작업(Input) -> 화면 출력(Ouput)
 *	                        FileReader
 *						    FileInputStream -> 파일 바이트 읽기 스트림이라 X
 *
 *	텍스트 파일 : 텍스트 파일을 읽을 수 있는 스트림 필요 -> 문자스트림(2바이트 1문자)
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		File f1 = new File(pathname); // 파일 크기, 언제 생성했는지 등 [파일에 대한 정보]를 [출력]하고자 한다면 ['파일 객체']를 만들어서 사용하는 것
		
		try {
			// Reader가 들어갔다 -> Input(읽기용) 스트림
			FileReader fr = new FileReader(f1); // File file
			// FileReader fr2 = new FileReader(pathname); // String pathname
			int n;
			while ((n = fr.read()) != -1) { // read() 메서드의 리턴값 : 한 문자를 읽어와서 int로 반환, 스트림의 끝(더 이상 읽을 게 없으면) -1
				System.out.printf("%c", (char)n); // 한 문자씩 읽어와서 파일의 끝까지 출력
			}
			
		} catch (FileNotFoundException e) { // 만약, 파일이 존재하지 않을 경우 예외 발생 -> 예외 처리
			e.printStackTrace();
		} catch (IOException e) { // 만약, 읽기 처리하다가 예외 발생하면 예외 처리
			e.printStackTrace();
		} 

	} // main

} // class

/*
// 아래 코딩은 하나씩 읽어오는 것, 위의 while문 코딩으로 파일 끝까지 출력함
int n = fr.read();
System.out.println(n+ " : " + (char)n); // p는 112개
n = fr.read();
System.out.println(n + " : " + (char)n); // a는 97개
n = fr.read();
System.out.println(n + " : " + (char)n); // c는 99개
*/