package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 4:19:12
 * @subject 
 * @content 
 */
public class Ex12 {

	public static void main(String[] args) {
		// 0 작거나  100 크거나 수식 :       x < 0  || x > 100                     !(  x >=0  && x <= 100 )
		// p137 표 참고해서...
		// [문제]
		// 키보드를 사용해서 한 문자를 입력받아서 ch 변수에 저장을 한 후 
		// 대문자                  'A' <= ch && ch <= 'Z'
		// 소문자                  'a' <= ch && ch <= 'z'
		// 숫자                    '0' <= ch && ch <= '9'
		// 한글                    '가' <= ch && ch <= '힣'
		// 특수문자(  # @ $ & )    '#'==ch  || '@'==ch || '$' == ch || '&'==ch
		
		char ch ;
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너 안에 문자를 읽어가는 메서드 X -> 스캐너 사용해서 한문자 읽어가는 방법
		System.out.print("한 문자 입력 ? ");
	    String data = scanner.next();   // "a".charAt(0) ->   'a'
	    // 문자열 -> 한문자 변환 X
	    ch = data.charAt(0);  // "a" -> 'a'	    
	    // System.out.println( ch );                //  'a'+'\0'    "a"   -> 'a' 변환
	    
	    if ('A' <= ch && ch <= 'Z') {
			System.out.println("대문자");
		}else if('a' <= ch && ch <= 'z') {
			System.out.println("소문자");
		}else if('0' <= ch && ch <= '9') {
			System.out.println("숫자");
		}else if( '가' <= ch && ch <= '힣') {
			System.out.println("한글");
		}else if('#'==ch  || '@'==ch || '$' == ch || '&'==ch) {
			System.out.println("특수문자");
		}else {
			System.out.println("모르겠다.");
		}
	    
	} // main

} // class
