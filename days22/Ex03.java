package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 2:03:35
 * @subject Calendar 추상클래스
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// JDK 1.1 Calendar 추상클래스
		Calendar c = Calendar.getInstance();
		Calendar cg = new GregorianCalendar(); // 위의 코딩과 동일한 코딩
		
		System.out.println(c.toString());
		// java.util.GregorianCalendar[
		// time=1647839272022,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		// offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		// ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=80,DAY_OF_WEEK=2,
		// DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=7,SECOND=52,MILLISECOND=22,
		// ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		// int field 설정하면 값을 가져와준다.
		// c.get(int field);
		// 어떤 int 값을 넣어야 할지 외우는 것보다 Calendar.XXX를 이용하여 값을 가져오자
		System.out.println(Calendar.YEAR); // 1
		// System.out.println(c.get(정수 filed 값));
		System.out.println(c.get(Calendar.YEAR) + "년"); // 2022
		
		System.out.println(Calendar.MONTH); // 2 -> 1월 0 ~ 12월 11 -> 3월 2
		System.out.println(c.get(Calendar.MONTH) + 1 + "월"); // 2+1 == 3월
		
		System.out.println(Calendar.DATE); // 5
		System.out.println(c.get(Calendar.DATE) + "일");
		
		// 시간
		System.out.println(c.get(Calendar.HOUR) + "시");
		// 분
		System.out.println(c.get(Calendar.MINUTE) + "분");
		// 초
		System.out.println(c.get(Calendar.SECOND) + "초");
		// 밀리세컨드
		System.out.println(c.get(Calendar.MILLISECOND) + "ms");
		
		// 요일 1(일) 2(월) 3(화) 4(수) 5(목) 6(금) 7(토)   <-> Date 0(일) ~ 6(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "요일" );
		
		System.out.println(c.get(Calendar.AM)); 	// 1
		System.out.println(c.get(Calendar.AM_PM)); // 0은 오전, 1은 오후
		
	} // main

} // class
