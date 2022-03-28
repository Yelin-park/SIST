package days27;

import java.io.File;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:50:02
 * @subject 1번 FileReader, FileWriter 스트림 클래스
 * @content 
 * 			1. 파일은 기본적이면서 가장 많이 사용되는 입출력 대상
 * 			2. 자바에서는 File 클래스 사용해서 - [파일]과 [디렉토리]를 다룰 수 있다.
 */
public class Ex06 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		File f1 = new File(pathname);
		
		// 이렇게 코딩할 수도 있다~
		String parent = ".\\src\\days27\\Ex01.java";
		String child = "Ex01.java";
		File f2 = new File(parent, child);
		
		/*
		System.out.println(f1.isFile());		// true 나오면 파일
		System.out.println(f1.isDirectory());	// true 나오면 디렉토리 -> String pathname = ".\\src\\days27";
		*/
		
		System.out.println(f1.length() + "bytes"); // 2832bytes 파일 크기 확인
		System.out.println(f1.getName()); // Ex01.java -> 파일 객체의 파일명만 가져옴
		
		System.out.println(File.separator); // \ 파일의 구분자 -> OS에 따라서 다르게 나옴(유닉스일 경우 /)

	} // main

} // class
