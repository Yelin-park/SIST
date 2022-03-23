package days24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 9:35:23
 * @subject p572 파싱(parse)과 포맷(format)
 * @content java.time.format 패키지 - DateTimeFormatter 클래스(날짜와 시간을 포맷해주는 클래스)
 * 			 	Date, Calendar -> 포맷, 파싱 -> [SimpleDateFormat 클래스 사용]
 * 				JDK 1.8 LocalDate, LocalTime, LocalDateTime -> 포맷, 파싱 -> [DateTimeFormatter 클래스 사용]
 */			
public class Ex02 {

	public static void main(String[] args) {
		// Date, Calendar -> 포맷, 파싱 -> [SimpleDateFormat 클래스 사용]
		// JDK 1.8 LocalDate, LocalTime, LocalDateTime -> 포맷, 파싱 -> [DateTimeFormatter 클래스 사용]
		
		LocalDate today= LocalDate.now();
		System.out.println(today); // 기본형식 : 2022-03-23

		// [FormatStyle에 정의된 것] - ofLocalizedDate() 메서드 사용
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);  // 2022년 3월 23일 (수)
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);  // 2022년 3월 23일 수요일
		DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);  // 22. 3. 23
		
		/*
		// p537 원하는 출력 형식으로 직접 설정해서 사용하기 - ofPattern() 메서드 사용
		// [출력형식 직접 정의하기]
		// 2022년 3월 23일
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		
		String stoday = formatter.format(today);
		System.out.println(stoday);
		*/
		
		/*
		// DateTimeFormatter에 정의된 상수 사용
		LocalDate d = LocalDate.of(2022, 2, 15);
		System.out.println(d); // 2022-02-15
		
		// format 형식이 String으로 반환해 줌
		// String s = DateTimeFormatter.ISO_DATE_TIME.format(d);
		String s = DateTimeFormatter.ISO_DATE.format(d);
		System.out.println(s);

		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE; // 위의 코딩과 동일한 코딩
		s = d.format(formatter);
		System.out.println(s);
		*/
		
	} // main

} // class
