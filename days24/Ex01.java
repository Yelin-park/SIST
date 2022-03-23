package days24;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 9:01:43
 * @subject p567 [Period] / Duration 클래스
 * @content
 * 			같은 인터페이스(TemporalAmount)를 상속 받음
 * 			Period - 날짜와 날짜 사이의 간격 차이 == 날짜 - 날짜
 * 			Duration - 시간과 시간 사이의 간격 차이 == 시간 - 시간
 * 
 * 			between() 메서드 -  static 메서드
 * 			until() 메서드 - 인스턴스 메서드
 */
public class Ex01 {

	public static void main(String[] args) {
		// 개강일로부터 오늘날 날짜 몇일 지났나?
		LocalDate today = LocalDate.now();
		System.out.println(today); // 2022-03-23
		
		LocalDate open = LocalDate.of(2022, 2, 15);
		System.out.println(open);
		
		// end 매개변수는 당일을 포함하지 않는다. ex) 2022.03.23 -> 2022.03.22까지만
		Period p = Period.between(open, today);
		// Period p = Period.between(open, today.plus(1, ChronoUnit.DAYS));
		
		// 년도 차이 구하기
		System.out.println( p.getYears()  ); // 0 -> 년도는 차이가 나지 않는다.
		System.out.println(p.get(ChronoUnit.YEARS));
		
		// 월 차이 구하기
		System.out.println(p.getMonths()); // 1
		System.out.println(p.get(ChronoUnit.MONTHS)); // 1
		
		// 일 차이 구하기
		System.out.println(p.getDays()); // 8
		System.out.println(p.get(ChronoUnit.DAYS)); // 8
		// 년, 월, 일 차이의 합을 구하면 1개월 8일이 지났다.
		
		System.out.println(p.getUnits()); // [Years, Months, Days] Period의 단위가 나옴
		
	} // main

} // class
