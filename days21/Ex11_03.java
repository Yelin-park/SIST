package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 4:32:38
 * @subject p508 예제9-33
 * @content p509 예제 9-34 시간나면 해보기~
 */
public class Ex11_03 {

	public static void main(String[] args) {
		/*
		// 1) String.mathces() 메서드
		String source = "011-111-111";
		// String source = "02-999-999";
		String pattern  = "0\\d{1,2}-\\d{3,4}-\\d{4}";
		System.out.println(source.matches(pattern));
		*/
		
		/*
		// 2) java.util.regex 패키지 - Pattern, Matcher 클래스
		String source = "011-111-111";
		String pattern  = "0\\d{1,2}-\\d{3,4}-\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		System.out.println(m.matches());
		*/
		
		String source = "HP:011-111-1111, HOME:02-999-9999";
		String pattern  = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		// "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		//    그룹1		  그룹2      그룹3
		// 정규식의 일부를 괄호를 나누어 묶어서 그룹화할 수 있다.
		// 그룹화된 부분은 하나의 단위로 묶어서 셈이 된다.
		// 한 번 또는 그 이상 반복을 의미하는 + * ? {1,2} . -> 이런 것들이 뒤에 오면 그룹화된 부분이 적용대상이 된다.
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		
		int i = 0;
		// m.find() 
		// m.find(int start index) -> 찾기 시작할 인덱스 값을 줄 수 있음
		while (m.find()) {  
			System.out.println(m.group() + "-----" + m.group(1) + "/" + m.group(2) + "/" + m.group(3));
		}
		// 011-111-1111-----011/111/1111
		// 02-999-9999-----02/999/9999
	} // main

} // class
