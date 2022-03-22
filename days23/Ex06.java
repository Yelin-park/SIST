package days23;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 12:38:24
 * @subject p552 ~ p576 JDK 1.8 ~ [java.time 패키지]
 * @content JDK 1.0 - Date
 * 			 JDK 1.1 - Calendar
 * 				형식화 클래스 4가지
 * 				1) DecimalFormat - 숫자
 * 				2) SDF - 날짜
 * 				3) CF - 범위 -> 문자열
 * 				4) MF - mf.parse
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * Date, Calendar 클래스의 단점 - 예) 두 날짜 사이의 차 -> 개발자가 직접 구현
		 * 위의 클래스가 불편해서 아래와 같은 패키지가 생겼다.
		 * 
		 * 1. java.time 패키지의 4가지 하위 패키지 --> '불변'-> 날짜, 시간을 변경하는 메서드들은 기존의 객체를 변경하는 대신 [항상 변경된 새로운 객체를 반환]
		 * 		1) chrono 패키지 	- 표준(ISO)이 아닌 [달력 시스템]을 위한 클래스들을 제공
		 * 		2) format 패키지 	- 날짜와 시간을 [파싱하고 형식화]하기 위한 클래스들을 제공 
		 * 		3) temporal 패키지	- 날짜와 시간의 [필드(filed)와 단위(unit)]를 위한 클래스들을 제공
		 * 		4) zone 패키지		- [시간대(time-zone)]와 관련된 클래스들을 제공
		 * 
		 * 2. 핵심 클래스 + 클래스들 간의 변환하는 작업
		 * 		- java.time 패캐지의 핵심 클래스 - 날짜 클래스와 시간 클래스로 분리가 되어져 있다.(Date, Calendar 클래스 = 날짜 + 시간)
		 * 
		 * 			<Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현한 클래스>
		 * 			1) LocalDate 클래스 		- 날짜 클래스
		 * 			2) LocalTime 클래스 		- 시간 클래스
		 * 			3) LocalDateTime 클래스 	- 날짜 & 시간 클래스
		 * 			4) ZonedDateTime 클래스 	- 날짜 + 시간 + 시간대 클래스
		 * 		
		 * 			<TemporalAmount 인터페이스를 구현한 클래스>
		 * 			5) Period 클래스와 Duration 클래스 차이점?
		 * 				- 날짜 사이의 간격 = 날짜 - 날짜 -> Period 클래스
		 * 				- 시간 사이의 간격 = 시간 - 시간 -> Duration 클래스
		 * 				
		 * 				Period 클래스와 Duration 클래스 메서드
		 * 				- between() 메서드
		 * 				- until() 메서드
		 * 				- of() 메서드
		 * 				- with() 메서드
		 * 			   
		 * 		*** 위의 클래스 객체 생성하는 방법 : now(), of() 메서드로 생성한다. (new 연산자 X, getInstance() X) ***
		 * 				
		 *			6) 참고 : 굳이 어려운 용어를 사용한 이유 -> 아래와 같이 구분을 하기 위해서 어려운 용어를 사용했다.
		 *				temporal 용어 : 시간 (== time) - 시, 분, 초를 나타낼 때 			-> 시간
		 *				  chrono 용어 : 시간 (== time) - 년, 월, 일, 시, 분, 초를 나타낼 때	-> 날짜와 시간
		 *
		 *			7) TemporalUnit 인터페이스 - 날짜와 시간의 [단위]를 정의한 인터페이스
		 *				ㄴ 구현 클래스 : ChronoUnit 클래스(열거형)
		 *			   TemporalField 인터페이스 - 날짜와 시간의 [필드]를 정의한 인터페이스
		 *				ㄴ 구현 클래스 : ChronoField 클래스(열거형)
		 *
		 *				* 열거형(enumeration) ? 서로 관련된 '상수'를 묶어 놓은 것
		 *
		 *				- 날짜, 시간 값을 얻어올 때 get(), getXXX()			+ ChronoUnit 열거형 클래스 사용
		 *				- 날짜, 시간 값을 수정할 때 with() / plus()	/ minus()
		 *				- 날짜, 시간 비교할 때 isAfter() / isBefore() / isEqual()
		 *			
		 *			8) Instant - 에포크 타입(1970.1.1 00:00:00)부터 경과된 시간을 나노초(ns) 단위로 표현
		 *				Instant -> Date 변환 가능
		 *				Date -> Instant 변환 가능
		 *			
		 *			9) LocalDateTime -> LocalDate 변환
		 *			   LocalDate -> LocalDateTime 변환
		 *
		 *			10) TemporalAdjusters 클래스
		 *				- plus() / minus() 메서드로 날짜, 시간을 계산할 수 있다.
		 *				- 다음주 목요일, 지난주 금요일 계산할 때 편리한 기능(메서드)이 구현된 클래스
		 *				- 여러 가지 유용한 메서드가 있다.
		 *
		 *			11) 날짜, 시간 -> 형식 ofPattern()
		 *						  -> 파싱 parse()
		 *
		 * 			
		 * 
		 */

	} // main

} // class
