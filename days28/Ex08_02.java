package days28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 2:46:37
 * @subject InputStreamReader 사용 예제
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) throws IOException {
		
		// [문제] 한글 한 문자를 입력해도 제대로 된 한글 한 문자 출력
		// 안녕하세요. 출력하기
		System.out.println("> 한 문자 입력?");
		InputStream is = System.in;
		// InputStreamReader : byte -> char 변환해 주는 문자 보조 스트림
		InputStreamReader isr = new InputStreamReader(is);
		// char[] buf = new char[10]; // -> String 변환 후 출력 하지만 BufferedReader 사용하자~
		BufferedReader br = new BufferedReader(isr);
		
		// 한 문자 읽을 때
		// int b = isr.read();
		// System.out.println((char)b);
		
		// 문자열을 읽을 때
		String data = br.readLine();
		System.out.println(data);
		
		
		/*
		// 방법1)
		System.out.println("> 한 문자 입력?");
		InputStream is = System.in;
		 
		// 3바이트 읽어가는 방법
		byte[] buf = new byte[3];
		int 실제읽은바이트수 = is.read(buf); // 3바이트를 읽어서 byte 배열에 담겠다.
		
		for (byte b : buf) {
			System.out.println(b);
		}
		
		// byte[] -> String.charAt() -> char
		String s = new String(buf);
		char one = s.charAt(0);
		System.out.println(one);
		*/
		
		/*
		// 내가 푼 방식
		System.out.println("> 한 문자 입력?");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		int b = isr.read(); // 1바이트(8비트) 0~255 정수
		System.out.println((char)b); // 한글은 한 문자로 못 읽어옴, 한글은 3바이트
		*/
		
		// [현재 사용중인 OS의 인코딩을 확인하는 코딩]
		InputStreamReader isr2 = new InputStreamReader(System.in);
		System.out.println(isr2.getEncoding()); // UTF8
		// UTF-8 : 유니코드를 위한 가변 길이 문자 인코딩 방식, 한 문자를 나타내기 위해 1바이트 ~ 4바이트까지 사용
		// 알파벳 1바이트, 한글 3바이트 필요
		// EUC-KR : 완성형 코드 조합, 뚫훍 같은 글자 표현 X
		// MS949(CP949) : MS에서 사용되는 문자 인코딩, 조합형은 아니지만, 완성형 코드인 EUC-KR + 뚫훍 같은 글자를 포함 -> 즉, EUC-KR의 확장이며, 하위 호환성이 있음
		// KSC5601 : 한글 완성형 표준(한글 2,350자 표현)

	} // main

} // class
