package days22;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 2:47:46
 * @subject p529 Date 클래스 -> Calendar 클래스 변환 ***(암기)
 * 				  Calendar 클래스 -> Date 클래스 변환 ***(암기)
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1970.1.1 00:00:00 기준으로 ms
		/*
		Date d = new Date();
		System.out.println(d.getTime()); // long 자료형 1647842582626
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTimeInMillis()); // 1647842582634 -> 위의 값과 차이나는 이유는 실행 순서의 차이
		*/
		
		// Date -> Calendar 변환 - c.setTime(Date d)
		/*
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		*/
		
		// Calendar -> Date 변환 - c.getTime(); Date로 리턴 / new Date(c.getTimeInMillis());
		Calendar c = Calendar.getInstance();
		// 방법1)
		Date d = c.getTime(); // 리턴 타입이 Date
		// 방법 2)
		Date d2 = new Date(c.getTimeInMillis());
		
	} // main

} // class
