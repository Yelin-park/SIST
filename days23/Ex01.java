package days23;

import java.util.Date;
import java.util.Calendar;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 9:02:41
 * @subject Date 클래스 사용해서 달력만들기
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// [문제] Date 클래스사용해서 이전달 달력, 이후 달력까지 나오도록
		int year = 2010;
		int month = 5;
		
		Date sday = new Date(year-1900, month-1, 1);
		int START_DAY_WEEK = sday.getDay();
		sday.setDate(sday.getDate() - START_DAY_WEEK);
		
		System.out.printf("\t\t\t%d년 %d월\n", year, month);
		System.out.println("\t일\t월\t화\t수\t목\t금\t토\n");		
		
		// 6행 7열 -> 42개
		for (int i = 1; i <= 42; i++) {
			int date = sday.getDate(); // 화면상에 출력할 날짜
			System.out.printf(month == sday.getMonth()+1 ? "\t[%d]" : "\t%d", date);
			sday.setDate(sday.getDate()+1);  // 다음 날짜가 찍힘
			if(i % 7 == 0) System.out.println();
		}

	} // main

} // class
