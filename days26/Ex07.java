package days26;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 2:54:47
 * @subject p663 Properties 예제
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 시스템의 속성들 얻어오는 메서드
		Properties p = System.getProperties();
		// ArrayList 열거자 출력시 사용해봤음
		// Enumeration<String> en = p.elements();
		
		System.out.println("파일 경로 구분자 : " + System.getProperty("file.separator"));
		
		// 속성이름들
		Enumeration<String> en = (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String pname = (String) en.nextElement();
			System.out.println(pname + " = " + System.getProperty(pname)); // System.getProperty(pname) -> 키값으로 속성값을 가져오겠다.
			
		} // while
		
	} // main

} // class
