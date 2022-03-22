package days23;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 3:25:01
 * @subject LocalDate 클래스
 * @content 날짜 정보 수정하기 - with() / plus() / minus()
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 개강일(2022.2.15)로부터 100일 기념일?
		LocalDate open = LocalDate.of(2022, 2, 15);
		// 날짜 수정 메서드? with() / plus() / minus()
		
		// 방법1)
		/*
		open = open.plusDays(100); // 자기 자신은 불변이기 때문에 새로 받는 작업을 꼭 해야함
		System.out.println(open);
		*/
		
		// 방법2)
		/*
		open = open.plus(Period.ofDays(100));
		System.out.println(open);
		*/
		
		// 방법3)
		open = open.plus(100, ChronoUnit.DAYS);
		System.out.println(open);
		
		// [ with(), withXXX() ] : 날짜만 새로운 날짜로 수정해주는 메서드
		// open = open.withDayOfMonth(20); 	// 날짜만 20일로 수정하겠다. -> 2022.02.20
		// open = open.withYear(2020); 		// 년도만 2020년으로 수정하겠다.
		open = open.with(ChronoField.YEAR, 2020); // 년도만 2020년으로 수정하겠다.
		System.out.println(open);
		
	} // main

} // class
