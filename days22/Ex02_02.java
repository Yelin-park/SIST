package days22;

import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 12:18:46
 * @subject Date 관련
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// Date d = new Date();   // 현재 시스템의 날짜, 시간 정보를 가지는 객체(인스턴스) d가 만들어진다.
		// [문제1] 달력을 그릴 때 2010년 5월 1일이 무슨 요일인지?
		// 1번 풀이) 내가 풀었던 것 -> 생성자 사용
		
		Date d = new Date((2010-1900), (5-1), 1);
		System.out.println("일월화수목금토".charAt(d.getDay()) + "요일");
		
		// 2번 풀이) setXXX() 사용
		Date d2 = new Date(); // 현재 시스템의 날짜, 시간
		d2.setYear(2010-1900);
		d2.setMonth(5-1);
		d2.setDate(1);
		System.out.println("일월화수목금토".charAt(d2.getDay()) + "요일");
		
		
		// [문제2] 마지막 날짜 가져오기
		// 1/3/5/7/8/10/12 - 31일
		// 2 - 28/29일
		// 4/6/9/11 - 30일
		System.out.println(d); // Sat May 01 00:00:00 KST 2010
		
		// 오늘 날짜에 새로운 달을 설정
		int month = d.getMonth(); // 4(5월)
		d.setMonth(month + 1);
		System.out.println(d);  // Tue Jun 01 00:00:00 KST 2010
		int date = d.getDate(); // 1일
		d.setDate(date - 1); 	//6월 1일에서 1일을 뺀다.
		System.out.println(d);  // Mon May 31 00:00:00 KST 2010
		System.out.println(d.getDate());
		
		// [문제3] 890212 주민번호가진사람이 오늘 생일 지났는가?
		String rrn = "890212";
		
		Date today = new Date();
		// 시간, 분, 초는 절삭하는 작업 -> 0으로 셋팅 하는 작업 필요 ***
		today.setHours(0);
		today.setMonth(0);
		today.setSeconds(0);
		
	    int b_month =  Integer.parseInt( rrn.substring(2, 4) ) -1;
	    int b_date = Integer.parseInt( rrn.substring(4, 6) ) ;
	    Date birthday = new Date( today.getYear(), b_month, b_date);
	    
	    // System.out.println(  birthday.after(today) );   // false
	    // System.out.println(  birthday.before(today) );   // true
	    // System.out.println(  birthday.equals(today) );   // false      
	    
	    System.out.println( birthday.compareTo(today) );  // -1(안지남)  0(오늘이생일)   1(지남)
		
		/*
		Date my = new Date(1989-1900, 3-1, 22); // 생일인 사람의 날짜
		Date today = new Date();
		
		if(today.getMonth() > my.getMonth()) System.out.println("생일이 지났습니다.");
		else if(today.getMonth() == my.getMonth() && today.getDate() > my.getDate()) {
			System.out.println("생일이 지났습니다.");
		} else System.out.println("생일이 안지났습니다.");
		*/
	} // main

} // class
