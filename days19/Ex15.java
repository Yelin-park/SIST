package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 3:37:50
 * @subject p431 예제8-15(파일생성) 아니고 강사님이 문제 바꾸심 파일 읽어서 화면 출력하기
 * @content
 * 			복습문제 : test.html 파일을 읽어서 라인번호를 붙여서 출력하세요
 * 				조건 : try-with-resource문 사용
 */
public class Ex15 {
	
	// 파일 읽어서 화면 출력
	public static void main(String[] args) {
		String fileName = "C:\\temp\\test.txt";   // 파일이 있는 경로
		// File f = createFile(filePath);       // 파일 생성하는 건데 아직 안배워서 일단 넘김
		String line = "";
		// BufferedReader br = null; // Ex17로 인한 주석처리
		
		int lineNumber = 1;
		 // FileReader : 파일을 읽어오는 클래스
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(new FileReader(fileName)); ){ // Ex17 이 코딩을 만나면 try 문이 끝나면 자동으로 반환
			// FileReader fr = new FileReader(fileName); 
			// br = new BufferedReader(new FileReader(fileName)); // Reader in // Ex17로 인한 주석처리
			while( (line = br.readLine()) != null) { // 텍스트 파일 안에 있는 내용 다 읽어 오는 코딩
				System.out.printf("%d : %s\n", lineNumber++, line);
			}
			// fr.read()
			line = br.readLine();
		} catch (FileNotFoundException e) {  // FileNotFoundException은 IOException의 자식 클래스
			System.out.println("읽고자 하는 파일이 없어요..");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Ex17로 인한 주석처리
			/*
			try {
				br.close();  // close()도 예외처리 필요
			} catch (IOException e) {
				e.printStackTrace(); // 읽고자 하는 파일이 없으면 닫을 수가 없어서 예외 발생
			}
			*/
		}

	} // main

} // class
