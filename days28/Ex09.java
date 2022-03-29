package days28;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 3:26:13
 * @subject p907 표준 입출력
 * @content 		표준 입력장치(키보드) -> 표준 입력 == System.in == InputStream
 * 					표준 출력장치(모니터, 프린터기) -> 표준 출력 == System.out == PrintStream
 * 			
 * 			p908 예제15-22
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
		System.out.println("DDD");
		// System.err
		System.err.println("EEE"); // 출력이 되는데, 에러 메시지와 같이 빨간색으로 출력, 출력 위치가 바뀌기도 함(스레드개념) -> 다시 배울 예정
		*/
		
		int input = 0;
		InputStream is = System.in;
		try {
			while ((input = is.read()) != -1 ) {
				System.out.println("input : " + input + ", (char)input : " + (char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 입력의 끝(EOF) == Ctrl + Z 누르면 -1 반환해줌
		System.out.println("END");


	} // main

} // class
