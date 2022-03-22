package days23;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 3:46:03
 * @subject LocalTime 시간 클래스
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(); // 15:47:56.326
		System.out.println(t);
		
		// 시간, [분], 초, ms, ns 가져오기
		int minute = t.getMinute();
		System.out.println(minute);
		
		minute = t.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(minute);
		
		long ms = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(ms);
		
		// 10분 후 -> 2가지 방법
		t = t.plus(10, ChronoUnit.MINUTES);
		System.out.println(t);
		
		t = t.plusMinutes(10);
		System.out.println(t);
		
	} // main

} // class
