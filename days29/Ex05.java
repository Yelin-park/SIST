package days29;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 12:16:14
 * @subject 스레드 예제
 * @content
 */
/*
public class Ex05 {

	public static void main(String[] args) {
		// 음악 다운로드 - 멜론
		// main 스레드(기본 스레드) - main 스레드는 일을 시키고 끝남

		String originalPath = "C:\\Program Files (x86)\\CBT\\CBT.exe";
		String copyPath = "C:\\Users\\Yelin Park\\Documents\\CBT.exe";
		
		// 일은 파일복사일꾼이 한다.
		FileCopy target = new FileCopy(originalPath, copyPath);
		Thread 파일복사일꾼 = new Thread(target);
		파일복사일꾼.start();
		
		System.out.println("END"); // main 스레드는 일을 시키고 끝남
		
	} // main

} // class

class FileCopy implements Runnable {
	// 필드
	private String originalPath;
	private String copyPath;

	// 생성자
	public FileCopy(String originalPath, String copyPath) {
		this.originalPath = originalPath;
		this.copyPath = copyPath;
	}

	@Override
	public void run() {
		// 파일 복사(다운로드)라는 코딩..
		long start = System.nanoTime();
		File orignalFile = new File(originalPath);
		System.out.println(orignalFile.length() + " bytes"); // 2,385,496 bytes
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		//
		final int BUFFER_SIZE = 1024;
		byte[] buffer = new byte[BUFFER_SIZE];

		try {
			fis = new FileInputStream(orignalFile);// File
			fos = new FileOutputStream(copyPath); // String
			// 보조스트림 사용
			bis = new BufferedInputStream(fis, BUFFER_SIZE);
			bos = new BufferedOutputStream(fos, BUFFER_SIZE);

			int readNumber = -1; // 실제 읽어온 바이트 수를 저장할 변수

			while ((readNumber = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, readNumber);
			} // while
			bos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // try-with-resource 안에 넣지 않아서 다 닫아줘야함
				bis.close();
				bos.close();
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // try

		long end = System.nanoTime();
		System.out.println("> 처리 시간 : " + (end - start) + "ns");

	} // run

} // FileCopy
*/