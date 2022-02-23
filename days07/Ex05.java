package days07;

import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 2:34:20
 * @subject System.in.read() 메서드
 * 			System.in.skip() 메서드
 * 			System.in.available()
 * @content 한글자를 입력받고 ASCII 숫자로 나타남
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		// System.in.read(); 메서드
		// 1. 기능 : 입력스트림(키보드)으로 부터 다음 1바이트를 읽어서 0 ~ 255 정수를 int 값으로 반환하는 메서드
		// 2. 매개변수 X
		// 3. 리턴값(리턴자료형) : 0~255 int
		// end of stream : 더 이상 가져올 값이 없으면 -1을 하여 값을 돌려준다(반환)
		
		// 1번
		char one;
		System.out.print("한 문자 입력? ");
		// one = scanner.next().charAt(0)
		// 'a''\r''\n'
		one = (char)System.in.read(); // 매개변수 값 int 97 'a' => a입력 후 엔터를 치면'\r'+'n'(CR+LF) 이 들어가짐
		System.out.println(one);
		
		// System.in.read(); // 13을 읽어가서 버리겠다.(1개를 버리겠다)
		// System.in.read(); // 10을 읽어가서 버리겠다.(1개를 버리겠다)
		// System.in.skip(3); // 키보드 버퍼에 남아있는 2개를 버리겠다.
		System.in.skip(System.in.available());  // 키보드 버퍼에 남아있는 모든 것들을 버리겠다.
		
		// 2번
		System.out.print("한 문자 입력?");
		one = (char)System.in.read();  // one = '\r'  => 개행(줄바꿈)문자 == 새줄문자 == CR 13  LF \n 10
		System.out.println(one);
		
		// 입력스트림 : abcde엔터(==13/10)
		System.out.println("=end=");
		
	} // main 

} // class
