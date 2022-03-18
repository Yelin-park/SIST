package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 3:56:22
 * @subject p505 정규표현식(Regular Expression == regex)
 * @content		java.util.regex 패키지 => 정규표현식과 관련된 클래스들
 * 				Matcher, Pattern 두 가지의 클래스가 있다.
 * 				
 * 				String 클래스의 matches() 메서드 사용
 * 				입력받은 국어 점수의 정규표현식
 * 				scroe.mathes(regex);
 */
public class Ex11 {

	public static void main(String[] args) {
		
		// 1) java.util.regex.Matcher;
		// 2) java.util.regex.Pattern;
		
		String [] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};
		
		String regex = "c[a-z]*"; // c로 시작하는 소문자영단어
		//  c   -> "cA", "ca", "co", "c.", "c0", "car", "combat", "count"
		// [a-z] -> 두 번째 문자는 소문자 아무거나 와도 괜찮다.
		// c[a-z] -> c로 시작하고 소문자 아무거나 하나 오는 것 => "ca", "co"
		// * -> 반복횟수를 뜻함
		// [a-z]* -> 소문자가 0번 ~ 여러번 와도 좋다
		/*
		for (int i = 0; i < data.length; i++) {
			if(	data[i].matches(regex) ) System.out.println(data[i]);
		}
		*/
		
		// 1. Pattern 객체 생성
		// 2. Matcher 객체 생성
		// 3. boolean형을 가지고와서 m.matches() 메서드로 처리
		Pattern p = Pattern.compile(regex); // 패턴(정규표헌식)을 가지고 있는 객체
		for (int i = 0; i < data.length; i++) {
			// 패턴 객체와 일치하는지 체크하는 Matcher 객체 m
			Matcher m = p.matcher(data[i]); 
			if(m.matches()) System.out.println(data[i]);
		}
		
		/*
		[결과 값]
		ca
		co
		car
		combat
		count
		*/
		
		
	} // main

} // class
