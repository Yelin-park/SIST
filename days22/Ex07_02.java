package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 3:48:49
 * @subject p536 예제10-7 달력그리기
 * @content 6행 7열로 남은 공간을 이전 달의 날짜와 이후 달의 날짜도 출력
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int year = 2022;
		int month = 3;
		
		// 1. 무슨요일인지구하기
		int START_DAY_OF_WEEK = 0;
		Calendar sDay = new GregorianCalendar(year, month-1, 1); // 시작일
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 시작하는 요일
		
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1); // 화요일이면 2를 빼야 일요일 자리에 전월 날짜가 들어감(3이 빠져서 +1을 해줌)
		
		System.out.printf("\t\t\t%d년 %d월\n", year, month);
		System.out.println("\t일\t월\t화\t수\t목\t금\t토\n");
		
		// 6행 7열 -> 42개
		for (int i = 1; i <= 42; i++) {
			int date = sDay.get(Calendar.DATE); // 화면상에 출력할 날짜
			System.out.printf(month == sDay.get(Calendar.MONTH)+1 ? "\t[%d]" : "\t%d", date);
			sDay.add(Calendar.DATE, 1);  // 다음 날짜가 찍힘
			if(i % 7 == 0) System.out.println();
		}


	} // main

} // class
