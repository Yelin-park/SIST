package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 3:32:16
 * @subject p533 예제10-4
 * @content 
 * 			Calendar 클래스의 add()
 * 			Calendar 클래스의 roll()
 * 			두 개의 메서드 차이점
 * 			ex) 2022.1.31
 * 				c.add(Calendar.DATE, 1); -> 2022.2.1
 * 				c.roll(Calendar,DATE, 1); -> 2022.1.1
 * 				roll은 날짜만 계산하면 날짜만 변경되지 년도와 월이 변경되지 않음 => 다른 필드에는 영향을 주지 않는다.
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 개강일로부터 100일 기념으로 그 날은 휴강합니다.
		Calendar openday = new GregorianCalendar(2022, 2-1, 15);
		// 개강하기 1년 전
		openday.add(Calendar.YEAR, -1); // 1년 전
		System.out.println(toString(openday)); // 2021년 2월 15일
		
		// 개강하기 1달 전
		openday.add(Calendar.MONTH, -1); // 한달 전
		System.out.println(toString(openday)); // 2022년 0월 15일
		
		// 아래 코딩은 일만 새로 2일로 수정한다는 코딩 -> 2일 후라는 코딩이 아님
		// openday.set(Calendar.DATE, 2);
		// add() 메서드를 사용하여 100일 후, 100일 전 날짜를 구하는 것 가능
		// 100일 후는 100
		// 100일 전은 -100
		openday.add(Calendar.DATE, 100);
		System.out.println(toString(openday)); // 2022년 4월 25일

	} // main
	
	public static String toString(Calendar c) {
		return String.format("%d년 %d월 %d일", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}

} // class
