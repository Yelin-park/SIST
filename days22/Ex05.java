package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 3:09:01
 * @subject p531 예제10-2
 * @content p532 예제10-3 코딩 꼭 해보깅
 */
public class Ex05 {

	public static void main(String[] args) {
		// 오늘 날짜 : 2022.3.21(월)
		// 개강 날짜 : 2022.2.15(화)
		// 수료 날짜 : 2022.7.29(금)
		// [문제1] 두 날짜 사이의 간격(일수)는 얼마인가? 개강 ~ 오늘까지 몇일이 지났는가?
		
		Calendar today = Calendar.getInstance(); // 시간, 분, 초도 있음
		Calendar open = Calendar.getInstance();
		open.set(2022, 2-1, 15); // 개강일 설정
		Calendar openDay = new GregorianCalendar(2022, 2-1, 15, 0, 0, 0); // 그레고리로 하면 한번에 만들기 편함
		
		long d = (today.getTimeInMillis() - open.getTimeInMillis()) / 1000; // 초로 변환
		long day = d / (24 * 60 * 60);
		System.out.printf("개강일로부터 %d일 지났습니다.\n", day);
		
		// 강사님의 풀이
		long difference = Math.abs(today.getTimeInMillis() - openDay.getTimeInMillis());
		/*
		long 초 = difference / 1000;
		long 분 = 초 / 60;
		long 시간 = 분 / 60;
		long 일수 = 시간 / 24;
		*/
		
		long 일수 = difference / (60*60*24*1000);
		
		// [문제2] 오늘부터 수료일까지 몇일 남았는가?
		Calendar close = Calendar.getInstance();
		close.set(2022, 7-1, 29); // 수료일 설정
		
		long d2 = (close.getTimeInMillis() - today.getTimeInMillis()) / 1000; // 초로 변환
		long day2 = d2 / (24 * 60 * 60);
		System.out.printf("수료일까지 %d일 남았습니다.", day2);
		
		// 23일 12시간 5분 15초 1230밀리세컨드
		// 나머지 값으로 구함 -> 지폐갯수 세는 로직과 동일
		
	} // main

} // class
