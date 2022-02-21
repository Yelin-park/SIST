package days05;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 4:19:12
 * @subject 
 * @content 
 */
public class Ex12_03 {

	public static void main(String[] args) { 
		
		char ch ;
		Scanner scanner = new Scanner(System.in);		                                                                                                                        
		System.out.print("한 문자 입력 ? ");
	    String data = scanner.next();     
	    ch = data.charAt(0);   	  
	    
	    // char -> Character 래퍼클래스
	    // Character.isDigit(ch);       > 숫자인지 아닌지 true/false 결과
	    // Character.isAlphabetic(ch);  > 대소문자 알파벳인지 아닌지 true/false 결과
	    
	    if (Character.isUpperCase(ch)) {
			System.out.println("대문자");
		}else if(Character.isLowerCase(ch) ) {
			System.out.println("소문자");
		}else if(Character.isDigit(ch)) {
			System.out.println("숫자");
		}else if('가' <= ch && ch <= '힣') {
			System.out.println("한글");
		}else if('#'==ch  || '@'==ch || '$' == ch || '&'==ch) {
			System.out.println("특수문자");
		}else {
			System.out.println("모르겠다.");
		}
		
	} // main

} // class
