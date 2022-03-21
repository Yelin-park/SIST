package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 3:48:49
 * @subject p535 예제10-6 달력그리기
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int year = 2022;
		int month = 3;
		
		// 1. 무슨요일인지구하기
		int START_DAY_OF_WEEK = 0;
		Calendar sDay = new GregorianCalendar(year, month-1, 1); // 시작일
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 시작하는 요일
		
		// 2. 마지막날짜구하기
		int END_DAY = 0;
		Calendar eDay = new GregorianCalendar(year, month, 1); // 끝일(2010.6.1)에서 add로 1일 빼주면 5월의 마지막 날짜가 구해짐
		eDay.add(Calendar.DATE, -1); 		// add 메서드로 마지막 날짜를 구하기 위한 코딩
		END_DAY = eDay.get(Calendar.DATE); // 마지막 날짜
		
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토\n");
		
		// 시작하는 요일이 먼저 찍히도록 공백 잡는 코딩
		for (int i = 1; i < START_DAY_OF_WEEK; i++) { 
			System.out.print("\t");
		}
		for (int i = 1; i <= END_DAY; i++) {
			System.out.printf("%d\t", i);
			if((i + START_DAY_OF_WEEK - 1) % 7 == 0) System.out.println(); // START_DAY_OF_WEEK 1은 일요일
		}

	} // main

} // class
