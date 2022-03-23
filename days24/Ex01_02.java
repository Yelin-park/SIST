package days24;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 9:14:38
 * @subject Duration 클래스 - 시간과 시간의 차이를 다루는 클래스
 * @content
 * 			between() 메서드 -  static 메서드
 * 			until() 메서드 - 인스턴스 메서드
 * 
 * 			of(), with(), plus(), minus() 메서드
 */
public class Ex01_02 {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now(); // 09:15:39.207
		LocalTime t2 = LocalTime.of(12, 30, 30);
		
		// 끝의 초(?)는 포함하지 않는다.
		Duration d = Duration.between(t1, t2);
		System.out.println(d.getUnits()); // [Seconds, Nanos] 초, 나노초만 확인할 수 있다.
		System.out.println(d.getSeconds());
		System.out.println(d.getNano());
		
		// 60초 == 1분
		// 1시간 == 60분 == 3600초(60*60)
		// 하루 == 24시간 == 1440분(24*60) == 86400초(24*60*60) ==86400000ms (24*60*60*1000)
		long hour = d.getSeconds() / 3600; // = 60 * 60 == 초 -> 시간
		long min = (d.getSeconds() - hour * 3600) / 60; // 시간 / 60 = 분 == 시간 -> 분
		long sec = (d.getSeconds() - hour * 3600 - min * 60) % 60; 
		long nano = d.getNano();
		
		// of() 	- 설정
		Period p = Period.of(1, 12, 31); // 1년 12개월 31일 차이가 나는 객체를 만들겠다.
		// with()	- 새로운 값으로 수정
		p.withYears(2); // 2년 12개월 31일 차이
		// plus()	- 더해서 수정
		p.plusYears(3); // 5년 12개월 31일 차이
		// minus()	- 빼서 수정
		p.minusYears(3); // 2년 12개월 31일 차이
		
		// 2년 11개월 31일
		// 1) 31일 무시
		// 2) 2년 11개월 -> 12 + 11 == 23개월
		p.toTotalMonths();
		
	} // main

} // class
