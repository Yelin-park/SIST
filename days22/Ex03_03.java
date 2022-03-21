package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 2:36:59
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		int year = 2005;
		// 1월 ~ 12월 각각 몇일까지 있는지?
		// 1월 31일, 2월 28/29일 ... 12월 31일
		
		// GregorianCalendar 사용
		Calendar cg = new GregorianCalendar(year, 1-1, 1);
		for (int month = 0; month < 12; month++) {
			cg.set(Calendar.MONTH, month);
			int lastDay = cg.getActualMaximum(Calendar.DATE);
			System.out.printf("%d년 %d월 - %d일\n", year, month+1, lastDay);
		}
		
		// Calendar 사용
		Calendar c = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			c.set(2005, i, 1);
			System.out.println(i+1 + "월 : " + c.getActualMaximum(Calendar.DATE) + "일");
		}
		
	} // main

} // class
