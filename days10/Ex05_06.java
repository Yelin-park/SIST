package days10;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 3:36:37
 * @subject 현재 시스템의 년도를 얻어오는 코딩
 * @content
 */
public class Ex05_06 {

	public static void main(String[] args) {
		// 현재 시스템의 년도를 얻어오는 코딩
		// int now = 2022;
		// java 날짜, 시간을 다루는 기능이 구현된 클래스 : Date, Calender 클래스
		// JDK 1.8 새로 추가된 클래스                    : LocalDate, LocalDateTime 등등
		
		Date d = new Date();
		// The method getYear() from the type Date [is deprecated] 
		// 앞으로는 getYear() 메서드는 사용되지 않는다. 즉, 사라질 것이다.
		// getYear() 올해년도 - 1900 = 122 [Returns : the year represented by this date, minus 1900. > 원래 년도에서 1900을 빼고 돌려준다]
		int now = d.getYear() + 1900; 
		System.out.println("올해년도 : " + now); // 올해년도 : 122
		

	} // main

	
} // class
