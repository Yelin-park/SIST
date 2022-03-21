package days22;

import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오전 11:29:05
 * @subject Chapter10 날짜(date)와 시간(time) & 형식화(formatting)
 * @content p528
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 1. JDK 1.0과 1.1에서는 2가지 밖에 없었음
		 * 	1) Date 클래스(util 패키지) - deprecated(폐기될) 메서드가 많음
		 * 	2) Calendar 클래스
		 * 		- 추상클래스이다.
		 * 		- new 연산자로 객체 생성을 못하고 getInstance() 메서드를 통해 객체(인스턴스)를 얻어와서 사용한다.
		 * 			> 사용하는 나라에 따라서 다음과 같이 객체를 반환 -> 나라마다 달력이 다름 -> 나라에 맞는 달력을 구현하여 사용하라는 의미로 Calendar는 추상클래스(재정의해서 사용)
		 * 			  ㄴ 태국 BuddhistCalendar 객체(인스턴스)를 반환
		 * 			  ㄴ 그 외 GregorianCalendar 객체(인스턴스)를 반환
		 * 
		 * 2. JDK 1.8~
		 * 	java.time 패키지 안에 여러 하위 패키지 및 다양한 클래스 추가 되어짐
		 */
		
		// Date 객체 선언 및 생성
		Date d = new Date();
		
		// The method getYear() from the type Date [is deprecated]
		// 취소선 되어있는 메서드 -> 앞으로는 폐기될 메서드
		
		int year = d.getYear() + 1900;
		// System.out.println(year);
		
		// KST == Korean Standard Time == 한국표준시간
		System.out.println(d.toString());	 // Mon Mar 21 11:43:37 KST 2022
		System.out.println(d); 				 // Mon Mar 21 11:43:37 KST 2022
		
		// GMT ==  Greenwich Mean Time의 약자로 그리니치 평균시, 즉, 세계 표준 시간을 뜻합니다.
		System.out.println(d.toGMTString()); // 21 Mar 2022 02:44:22 GMT

		// 날짜 비교하는(지났는지, 안지났는지, 같은지 확인) 메서드
		// 만나이 계산할 때 생일 지났는 여부 -> -1
		// d.after(Date when); // d 날짜가 Date when보다 날짜가 지났는지에 따라 true, false 돌려줌
		// d.before(Date when); // d 날짜가 Date when보다 전이니? true, flase
		// d.compareTo();
		// d.equals(); 
		
		// d.clone(); // Object의 clone
		
		// d.getXXX() / d.setXXX()
		// 월
		System.out.println(d.getMonth() + 1); // 1월(0) ~ 12월(11)
		// 일 -> 1일 ~ 31일
		System.out.println(d.getDate());
		// 시간
		System.out.println(d.getHours());
		// 분 -> 0분 ~ 59분
		System.out.println(d.getMinutes());
		// 초 -> 0초 ~ 59초
		System.out.println(d.getSeconds());
		
		// 1970년 1월 1일 0시 0분 0초(GMT) 밀리세컨em 값을 반환하는 메서드
		System.out.println(d.getTime());
		
		// 오늘 날짜가 무슨 요일인지 숫자로 반환해주는 메서드 -> 0일 1월 2화 3수 4목 5금 6토
		System.out.println(d.getDay());
		System.out.println("일월화수목금토".charAt(d.getDay()) + "요일");
		
		System.out.println(getLocalDate(d));
		
	} // main
	
	// Date d => 2022년 3월 21일 12시 17분 28초(월요일) 나타내 반환하는 메서드 선언(구현)
	public static String getLocalDate(Date d) {
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		int dayOfWeek = d.getDay();
		// System.out.println("일월화수목금토".charAt(d.getDay()) + "요일");
		
		return String.format("%d년 %d월 %d일 %02d시 %02d분 %02d초(%c요일)",
				year, month, date, hour, minute, second, "일월화수목금토".charAt(dayOfWeek));
	} // getLocalDate

} // class
