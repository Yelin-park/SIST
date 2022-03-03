package days11;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오전 9:03:46
 * @subject 년도와 월을 입력받아서 달력 출력
 * @content 복습시험 - 30분만에 코딩 완료
 */
public class Ex01 {

	public static void main(String[] args) { // 메인함수로부터 입력받기
		int year, month; // 2010 5
		
		if(args.length != 2) {
			System.out.println("> java.exe Ex01 2010 5 년도, 월 매개변수 필요합니다.");
			return;
		}
		
		// Run as - configurations 에서..
		year = Integer.parseInt(args[0]);  // 년도를 입력받겠다.
		month = Integer.parseInt(args[1]); // 월을 입력받겠다.
		
		// System.out.printf("%d년 %d월\n", year, month); // 2010년 5월 1일(토) ~ 31일(월)
		
		// 1. 달력 그리기(생성)
		//    ㄱ. 해당 년도와 월의 1일은 무슨 요일? 	2010년 5월 1일은 토요일
		//		1) 총날짜수 구하기 : 1년1월1일 ~ 2010년 5월 1일까지 계산
		//		2) 총날짜수 % 7    : 0(일) 1(월) 2(화) 3(수) 4(목) 5(금) 6(토) 
		//    ㄴ. 해당 년도와 월의 마지막 날짜는? 		2021년 5월은 31일
		//		1) 28일 - 2월(평년)
		//		2) 29일 - 2월(윤년)
		//		3) 30일 - 4월, 6월, 9월, 11월
		//		4) 31일 - 1월, 3월, 5월, 7월, 8월, 10월, 12월
		
		// 기능 : 매개변수로 입력받은 년도와 월의 달력을 그려주는 기능
		// 매개변수 : 년도, 월
		// 리턴값(리턴자료형) : 달력만 그려주고 반환되는 값 X
		/*
		for (int j = 2008; j <= 2010; j++) {
			for (int i = 1; i <= 12; i++) {
				printCalender(j, i); // 메서드 호출 부분 - 2008년 1월 ~ 2010년 12월 달력 출력
			}
		}
		*/
		
		/* 
		for (int i = 1; i <= 12; i++) {
			printCalender(year, i); // 메서드 호출 부분 - 2010년 1월 ~ 12월 달력 출력
		}
		*/
		printCalender(year, month); // 메서드 호출 부분 - 2010년 5월 달력 출력

	
	} // main

	private static void printCalender(int year, int month) {
		// 1) 총날짜수 계산하기 : 1년1월1일 ~ n년n월n일 -> 1년1월1일 ~ 2010년5월1일
		// 총날짜수 : 733893
		int totalDays = getTotalDays(year, month, 1); // 년월일을 주면 총날짜수 계산 : 1일로 시작되는 요일을 구하는 것이기 때문에 date는 1일
		// System.out.println("> 총날짜수 : " + totalDays);
		
		// 2) 총날짜수 % 7 => 요일에 해당되는 정수값(0~6)
		int dayOfWeek = getDayOfWeek(year, month);
		// System.out.println("> dayOfWeek=" + "일월화수목금토".charAt(dayOfWeek);
		
		// 3) 마지막 날짜 가져오기
		int lastDay = getLastDay(year, month);
		// System.out.println("> 마지막 날짜 : " + lastDay);
		
		// 4) 달력 출력
		System.out.printf("\t\t\t%d년 %d월\n", year, month);
		String week = "일월화수목금토";

		days08.Ex02.drawLine(60,'-');
		for (int i = 0; i < week.length(); i++) System.out.printf("\t%c", week.charAt(i));
		System.out.println();
		
		days08.Ex02.drawLine(60,'-');
		// 1일 ~ 31일
		for (int i = 0; i < dayOfWeek; i++) {  // 1일이 토요일에 맞춰서 출력하려면 i <= 6인데 마침 dayOfWeek 값이 6이라 바꿔도 됨 + 아래 코딩으로인해 = 연산자 빼기
			System.out.print("\t");
		}
		// ASCII 찍는 것과 동일
		for (int i = 1; i <= lastDay; i++) {
			System.out.print("\t" + i);
			if((dayOfWeek + i) % 7 == 0) System.out.println(); // 공백을 포함(dayOfWeek)시켜서 7로 나누었을 때 0으로 떨어지면 개행
		}
		System.out.println();
		days08.Ex02.drawLine(60,'-');
		
	} // printCalender

	private static int getLastDay(int year, int month) {
		int lastDay;
		
		switch (month) {
		case 2:
			lastDay = (days06.Ex06_02.isLeapYear(year)) ? 29 : 28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;
		default:
			lastDay = 31;
			break;
		} // switch
		
		return lastDay;
	} // getLastDay

	private static int getDayOfWeek(int year, int month) {
		// 총날짜수: 733893
		int totalDays = getTotalDays(year, month, 1);
		// System.out.println("> 총날짜수 : " + totalDays);
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	} // getDayOfWeek

	private static int getTotalDays(int year, int month, int date) {
		int totalDays = 0;
		// 1) 구하고자하는 이전년도 (year(2010)-1 == 2009)의 총날짜수
		// 1년 365일 평년
		// 2년 365일 평년
		// 3년 365일 평년
		// 4년 366일 윤년
		
		/*
		// for문과 isLeapYear() 메서드를 활용하여 윤년구하기
		for (int i = 1; i < year; i++) { // < : 이전년도까지 구하라는 연산자
			if(days06.Ex06_02.isLeapYear(i)) totalDays += 366; // i % 4 == 0 && i % 100 != 0 || i % 400 == 0
			else           totalDays += 365;  // 2009년까지의 총날짜수 > 733772
		}
		*/
		
		// [더 간략하게 윤년구하기] ***
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// (year-1)*365 : 윤년 계산하는 거 없이 모든 년도를 365로 계산
		// (year-1)/4 : 몫이 우리가 구하고자하는 년도에 4의 배수가 몫만큼 있다.
		// (year-1)/100 : 만약에 100의 배수가 있으면 100의 배수가 있는 몫만큼 뺀다.
		// (year-1)/400 : 그리고 400의 배수가 있으면 400의 배수가 있는 몫만큼 더한다.
		
		// 2) 구하고자 하는 해당년도의 month-1까지 합하기
		//    ex) 2010년 5월 1일 이면 -> 31일(1월) + 28일(2월) + 31일(3월) + 30일(4월) + 1 /  ex) 3년 2월 13일 365(1년)+365(2년)+31(1월)+13(2월) = 총날짜수
		// 1월 2월 3월 4월 5월 6월 7월 8월 9월 10월 11월 12월
		// 31+28+31+30+31+30+31+31+30+31+30+31
		
		// 풀이3) [가장 간결하고 좋은코딩]*** 733893 잘나옴
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < month - 1; i++) totalDays += m[i]; // 이전달까지 합구하는 것
		if(days06.Ex06_02.isLeapYear(year) && month >= 3) totalDays++;
		totalDays += date;
		
		
		/*
		// 풀이2) 733893
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 2:
				totalDays += (days06.Ex06_02.isLeapYear(year)) ? 29 : 28;
				break;
			case 4: case 6: case 9: case 11:
				totalDays += 30;
				break;
			default:
				totalDays += 31;
				break;
			} // switch
		} // i for
		totalDays+=date;
		*/
		
		/*
		 // 풀이1) 전체 로직을 이해하는 코드
		switch (month) {  // 5월
	      case 1:         
	           totalDays +=  1;
	         break;
	      case 2:      
	         totalDays += 31 + 1;
	         break;
	      case 3:         // case 3 윤년 +1
	         totalDays += 31+28 + 1;
	         break;
	      case 4:         
	         totalDays += 31+28+31 +1;
	         break;
	      case 5:         
	         totalDays += 31+28+31+30 + 1;
	         break;
	      case 6:         
	         totalDays += 31+28+31+30+31 + 1;
	         break;
	      case 7:         
	         totalDays += 31+28+31+30+31+ 30+ 1;
	         break;
	      case 8:         
	         totalDays += 31+28+31+30+31+ 30+31 + 1;
	         break;
	      case 9:         
	         totalDays += 31+28+31+30+31+ 30+31+31 + 1;
	         break;
	      case 10:      
	         totalDays += 31+28+31+30+31+ 30+31+31+30+ 1;
	         break;
	      case 11:         
	         totalDays += 31+28+31+30+31+ 30+31+31+30+31+ 1;
	         break;
	      case 12:         
	         totalDays += 31+28+31+30+31+ 30+31+31+30+31+30+ 1;
	         break; 
	      }
	    
	      if( days06.Ex06_02.isLeapYear(year) &&  month >=3) totalDays++;
		 */
		
		return totalDays;
	} // getTotalDays

} // class
