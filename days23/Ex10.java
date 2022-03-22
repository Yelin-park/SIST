package days23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 4:20:28
 * @subject LocalDateTime
 * @content		
 * 			p560 Instant 클래스 == java.util.Date 클래스를 대체하기 위해서 만든 클래스
 * 			따라서... Date -> Instant 클래스 변환 메서드 추가
 * 				- from() 메서드 : Instant -> Date 변환 메서드 
 * 				- toInstant() 매서드 : Date -> Instant 변환 메서드
 */
public class Ex10 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now(); // 날짜
		LocalTime t = LocalTime.now(); // 시간
		
		// 현재 시스템 날짜, 시간 생성
		LocalDateTime dtt = LocalDateTime.now();
		
		// 1번 LocalDateTime.of(LocalDate, LocalTime)
		// 날짜 + 시간 객체 = LocalDateTime
		// LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		
		// 2번 LocalDateTime dt -> d.atTime(LocalTime);
		dt = d.atTime(t);
		
		// 3번 LocalDateTime dt -> d.atDate(LocalDate);
		dt = t.atDate(d);
		
		// 4번 LocalDateTime에서 LocalDate, LocalTime만 가져오기
		LocalDate a = dt.toLocalDate();
		LocalTime b = dt.toLocalTime();
		
	} // main

} // class
