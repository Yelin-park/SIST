package days24;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 9:54:34
 * @subject p575 날짜/시간형식의 문자열을 날짜/시간으로 변환(파싱)하기
 * @content
 * 			[String -> LocalDateTime 변환]
 * 			[String -> LocalTime 변환]
 * 			[String -> LocalDate 변환]
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		// [String -> LocalDateTime 변환]
		String s1 = "2022년 2월 15일 12시 34분 56초"; // 이 형태는 기본적으로 파싱 X

		String pattern1 = "yyyy년 M월 dd일 HH시 mm분 ss초";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern1);
		LocalDateTime dt = LocalDateTime.parse(s1, formatter1);
		// LocalTime t = LocalTime.parse(s1); 기본적으로 파싱 가능할 때
		System.out.println(dt);
		
		
		// [String -> LocalTime 변환]
		String s2 = "12:34:56"; // 이 형태는 기본적으로 파싱 가능
		s1 = "12시 34분 56초"; // 이 형태는 기본적으로 파싱 X
		
		String pattern2 = "HH시 mm분 ss초"; // hh : 0 ~ 12 / HH : 1 ~ 24
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
		LocalTime t = LocalTime.parse(s2, formatter2);
		// LocalTime t = LocalTime.parse(s1); 기본적으로 파싱 가능할 때
		System.out.println(t);
		
		
		// [String -> LocalDate 변환]
		String s3 = "2022-02-15"; // 이 형태는 기본적으로 파싱 가능
		s3 = "2022년 2월 15일"; // 이 형태는 기본적으로 파싱 X
		
		String pattern3 = "yyyy년 M월 dd일"; // 바꿀 수 있도록 패턴을 지정
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(pattern3);
		// LocalDate d = LocalDate.parse(s1); // 기본적으로 파싱 가능할 때
		LocalDate d = LocalDate.parse(s3, formatter3);
		System.out.println(d);

	} // main

} // class
