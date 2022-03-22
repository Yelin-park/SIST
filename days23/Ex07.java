package days23;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 2:44:59
 * @subject LocalDate 클래스
 * @content  날짜 정보 가져오기
 * 				now() : 현재 시스템의 날짜 객체 생성
 * 				 of() : 내가 원하는 날짜 객체 생성
 */
public class Ex07 {

	public static void main(String[] args) {
		// [객체생성 - now(), of() static 메서드]
		// LocalDate d = new X
		// LocalDate d = LocalDate.getInstance() X
		
		LocalDate d = LocalDate.now(); // now() : 현재 시스템의 날자 객체 생성
		System.out.println(d); // 2022-03-22 -> 날짜 정보만 있음(시간은 X)
		
		// 년도 가져오기
		int year = d.getYear();
		System.out.println(year);
		
		// System.out.println(ChronoField.YEAR); // 열거형 배울 때 다시 자세히 볼 예정
		year = d.get(ChronoField.YEAR);  // 매개변수는 TemporalField 필드로 달라 -> TemporalField 인터페이스를 구현한 클래스(ChronoField)의 필드 값을 넣어야 함 
		System.out.println(year); // 2022
		
		// 월 가져오는 3가지 방법
		int month = d.getMonthValue();
		System.out.println(month); // 3
		
		Month m = d.getMonth();
		System.out.println(m); // MARCH
		
		month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month); // 3
		
		// 일 가져오는 방법 getXXX(), get(TemporalField field)
		int day = d.getDayOfMonth();
		System.out.println(day);
		
		day = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		
		// 요일 가져오는 방법
		// 열거형 - 상수 -> 열거형 설명할 때 자세히 다룰 예정
		// DayOfWeek dayOfWeek = d.getDayOfWeek(); // TUESDAY
		int dayOfWeek = d.getDayOfWeek().getValue(); // 2
		System.out.println(dayOfWeek); 
		
		int dayOfWeek2 = d.get(ChronoField.DAY_OF_WEEK);
		System.out.println(dayOfWeek2); // 1(월) ~ 7(일)
		
		
		// 2022년 3월 27일 일요일
		// Date dt = new Date(2022-1900, 3-1, 27);
		LocalDate dt = LocalDate.of(2022, 3, 27); // of() 내가 원하는 날짜 객체 생성
		// LocalDate dt = LocalDate.of(2022, Month.MARCH, 27);
		System.out.println(dt.getDayOfWeek().getValue()); // 일요일 == 7 확인
		
		
	} // main

} // class
