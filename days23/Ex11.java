package days23;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 4:29:40
 * @subject p565 TemporalAdjuster[s] 클래스
 * @content			(s 없으면 인터페이스)
 * 					다음 주 금요일 휴강입니다. - 몇일?
 * 					다가오는 3째주 금요일에 만나요 - 몇일?
 * 					등등..
 * 					자주 사용되는 날짜 계산 메서드를 구현해 놓은 클래스
 */

public class Ex11 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());
		System.out.println(date);
		
		p(today);
		p(date);
		p(today.with(firstDayOfNextMonth()));
		p(today.with(firstDayOfMonth()));
		p(today.with(lastDayOfMonth()));
		p(today.with(firstInMonth(FRIDAY)));
		p(today.with(lastInMonth(FRIDAY)));
		p(today.with(previous(FRIDAY)));
		p(today.with(previousOrSame(FRIDAY)));
		p(today.with(next(FRIDAY)));
		p(today.with(nextOrSame(FRIDAY)));
		p(today.with(dayOfWeekInMonth(4, FRIDAY)));
		
		/*
		LocalDate now = LocalDate.now();
		System.out.println(now); // 2022-03-22(화)
		// 이번주 금요일은?
		LocalDate result = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); // 2022-03-25
		System.out.println(result);
		
		// 지난주 금요일은?
		result = now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)); // 2022-03-18
		System.out.println(result);
		*/
		
	} // main

	static void p(Object obj) {
		System.out.println(obj);
	}
	
} // class

class DayAfterTomorrow implements TemporalAdjuster {

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
	
} // DayAfterTomorrow class

