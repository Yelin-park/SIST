package days10;

import java.util.Scanner;
import days06.Ex06_02;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 11:42:42
 * @subject main() 메서드의 매개변수 String[] args의 의미/활용
 * @content main 메서드는 언제 호출되어지는가?
 * 			> javac.exe      Ex04.java          Ex04.class
 * 			> java.exe       Ex04  매개변수 매개변수... > main 안에 있는 매개변수(args)로 들어가짐   실행 -> 시작객체(Ex04 클래스) -> main() 메서드를 호출해서 실행
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		// main() 메서드의 매개변수가 String[] args -> 문자열 배열
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d]=%s\n", i, args[i]);
		}
		*/
		
		// 년도를 입력받아서 윤년/평년 출력
		// java.exe Ex04 2000 엔터 > 라는 의도는 아래 코딩
		int year = Integer.parseInt(args[0]); 
		
		if (days06.Ex06_02.isLeapYear(year)) {  //days06 패키지 안에 있는 Ex06_02 클래스 안에 있는 isLeapYear(year)을 사용하겠다.
		// if (isLeapYear(year)) {	// 나중에 설명해주심 > import로 불러오는건데 에러뜨고있음..
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		}
		
		System.out.println("=end=");
		
	} // main

} // class
