package days28;

import java.io.PrintStream;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 12:36:42
 * @subject p894 PrintStream 바이트 스트림
 * @content
 * 				- PrintStream 바이트 스트림 : print(), println(), printf() 메서드가 오버로딩 되어져 있다.
 * 
 * 				- JDK 1.1에서부터 PrintStream보다 향상된 스트림 : PrintWriter
 * 					향상된 기능은? 다양한 언어로 출력이 가능하다.
 */
public class Ex06 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		/*
		// 콘솔(화면)에 출력
		System.out.println();
		System.out.print();
		System.out.printf();
		*/
		
		PrintStream ps = System.out;
		ps.printf("이름 = %s, 나이 = %d\n", name, age);
		
		Date d = new Date();
		ps.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초\n", d); // 2022년 03월 29일 12시 43분 40초
		ps.printf("%1$tD\n", d); // 03/29/22 	 월/일/년
		ps.printf("%1$tT\n", d); // 12:44:00 	 시/분/초
		ps.printf("%1$tF\n", d); // 2022-03-29	 년/월/일

	} // main

} // class
