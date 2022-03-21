package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 2:21:06
 * @subject Calendar 추상클래스
 * @content p530 예제10-1 참고
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// Calendar 추상클래스를 사용해서 2010년 5월 1일이 무슨요일인지 알아오는 방법
		
		// 방법 1) GregorianCalendar 생성자 이용
		Calendar c = new GregorianCalendar(2010, 5-1, 1);
		// 1(일) ~ 7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 7
		
		// 방법 2) setter 메서드를 이용한 방법
		Calendar c2 = Calendar.getInstance(); // 현재 시스템의 날짜 시간 정보 가져오기
		// c.get(int field); // 원하는 년, 월, 일, 시, 분, 초, 밀리세컨드, 요일 등등의 정보를 가져올 수 있음
		c2.set(Calendar.YEAR, 2010); // 년도를 2010년으로 셋팅 -> 2010.03.21로 바뀜
		c2.set(Calendar.MONTH, 5-1); // 5월로 셋팅
		c2.set(Calendar.DATE, 1);
		System.out.println(c2.get(Calendar.DAY_OF_WEEK)); // 7
		
		// 방법 3) Calendar 생성자 이용
		c2.set(2010, 5-1, 1); // 년, 월, 일 설정
		System.out.println(c2.get(Calendar.DAY_OF_WEEK));
		
		// p530 예제10-1
		// [문제] Calendar 클래스 사용해서 2010.5.1 마지막 날짜 찾아보기
		Calendar today = Calendar.getInstance();
		today.set(2010, 5-1, 1);
		System.out.println(today.getActualMaximum(Calendar.DATE)); //  마지막 날짜 구하는 메서드 getActualMaximim(Calendar.Date);
		

	} // main

} // class
