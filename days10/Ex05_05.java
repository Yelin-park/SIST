package days10;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 3:01:08
 * @subject 주민등록번호 -> 성별, 생년월일,  [나이]
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		/*
		 * 전세계적으로 만나이 : 태어난 일을 기준으로 1년이 지나야지 1살을 먹는다
		 * 대한민국은 세는 나이 : 사람이 태어남과 동시에 한 살로 치고 그 후 새해의 1월 1일마다 한 살을 먹는다
		 * 
		 * A사람
		 * 2019.12.30	   2019.12.31       2020.1.1       2020.12.29		2020.12.30       2021.1.1		  
		 * 만나이     		0살				  0살			  0살              1살				1살
		 * 세는나이   		1살				  2살			  2살			   2살				3살
		 */
		
		String rrn = Ex05_02.getRRN();
		
		// int 세는나이 = get세는Age(rrn);
		// System.out.println(세는나이);
		
		int 만나이 = get만Age(rrn);
		System.out.println(만나이);
		
		
		// [질문 & 답변]
		// void System.out.printf("출력형식", 출력값...)  -> 출력하고 끝내는 메서드 
		// String String.format("출력형식", 출력값...)    -> 출력형식으로 문자열로 반환하는 메서드
		// 메서드 차이점 - 3가지 파악(기능, 매개변수, 리턴값)
		
	} // main

	private static int get만Age(String rrn) {
		// 만나이 = 태어난 일을 기준으로 1살 먹기
		// 만나이? 2019.01.13 태어나면 2020.01.13에 1살, 2021.01.13에 2살
		// 계산방법 1) 몫(나이) == 총 살아온 일수 / 365.25
		// 계산방법 2) 올해 - 생일년도 -1 (생일 지났는지 여부)
		//             2022 -  2019
		// 생일이 지나지 않은 경우 3살 -1 = 2살
		// 생일이 지난 경우        3살
		
		// 강사님이 풀어주신 코딩 -> Date 클래스의 객체(있는 메서드 활용하면 쉽다)
		// true/false 생일날짜객체.before(현재날짜객체)
		// d.after(d2)
		// d.before(d)
		
		/*
		// 월
		// 890112이고 오늘 3월 2일이면..
		int birthMD = Integer.parseInt(월일);   // 0112 -> 112
		int nowMD = Integer.parseInt(오늘월일); // 0302 ->302
		if(birthMD < nowMD) age--;
		*/
		
		// 풀이1)
		int age;
		Date d = new Date();
		int now = d.getYear() + 1900; // int now = 2022;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		int yearBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(0, 4)); // "1999년 01월 12일" -> 1999로 가져오기
		int monthBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(6, 8)); 
		int dateBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(10, 12)); 
		age = now - yearBD;
		// 올해 3월 2일  생일 12월 17일 -> 로직 잘못됨 내 만나이 26살인데 27살로 나옴...
		if(!(monthBD >= month && dateBD >= date)) age--;
		// if(monthBD < month && dateBD < date) age--;
		return age;
		
		
		
		/*
		// 내가 풀다만 코딩
		int age = 0;
		Date d = new Date();
		
		int now = d.getYear() + 1900; // int now = 2022;
		int month = Calendar.MONTH;
		int day = Calendar.DATE;
		
		int yearBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(0,4)); // "1999년 01월 12일" -> 1999로 가져오기
		int monthBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(2,4)); 
		int dayBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(4,6));   
		
		if(yearBD >= now) {
			if(monthBD >= month && dayBD >= day) {
				age = now - yearBD;
			} 
		} else age = 0;
		
		return age;
		*/
		
	} // get만Age

	private static int get세는Age(String rrn) {
		int age;
		Date d = new Date();
		int now = d.getYear() + 1900; // int now = 2022;
		int yearBD = Integer.parseInt(Ex05_04.getBirth(rrn).substring(0, 4)); // "1999년 01월 12일" -> 1999로 가져오기
		age = now - yearBD + 1;
		return age;
		
		// 내가 푼 코딩
		/*
		int age;
		int year = Integer.parseInt(rrn.substring(0,2));
		switch (rrn.charAt(7)-48) {
		case 0: case 9:
			year += 1800;
			break;
		case 1: case 2: case 5: case 6:
			year += 1900;
			break;
		default:
			year += 2000;
			break;
		}
		age = 2022-year+1;
		return age;
		*/
		
	} // get세는Age

} // class
