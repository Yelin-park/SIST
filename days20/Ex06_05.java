package days20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 4:15:34
 * @subject
 * @content
 */
public class Ex06_05 {

	public static void main(String[] args) {
		// 절대 경로
		// String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days20\\SS16교육생명단.txt";
		// 상대 경로 - 기준경로 => C:\\Class\\JavaClass\\javaPro -> 이클립스에서는 프로젝트명이 기준점
		// 상대 경로를 나타내는 기호  . -> 현재 디렉토리(C:\\Class\\JavaClass\\javaPro)
		// 						  .. -> 상위 디렉토리(C:\\Class\\JavaClass)
		//						 ... -> 상위상위디렉토리(C:\\Class)
		String fileName = ".\\src\\days20\\SS16교육생명단.txt";  // .\\ -> 하위 폴더로 들어가는 것
		String[] names = new String[22]; // 아래 코딩으로 파일을 읽어서 배열에 담겠다.
		try(FileReader in = new FileReader(fileName); BufferedReader br = new BufferedReader(in);) {
			String line = null;
			int lineNum = 1;
			int idx = 0;
			while ( (line = br.readLine()) != null ) {
				// System.out.printf("%d : %s\n", lineNum++, line);
				names[idx++] = line;
			} // while
		} catch (Exception e) {
			e.printStackTrace(); // 비워두지말구 꼭 해두기
		} // try-catch

		String result = "<ol><li>" + String.join("</li><li>", names) + "</ol></li>";
		// System.out.println(result);
		
		// 파일 저장하기
		fileName = ".\\src\\days20\\SS16교육생명단.htm";
		try(FileWriter out = new FileWriter(fileName);	BufferedWriter bw = new BufferedWriter(out); ) { // I/O 할 때 자세히 배울 예정
			bw.write(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=END=");
		
	} // main

} // class
