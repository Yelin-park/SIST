package days22;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 4:37:25
 * @subject p537 예제10-8, 예제10-9 수업 종료 후 코딩해보기
 * @content 개월 차를 구하는 예제
 * 			2015 * 12 + 8 -> 1
 */
public class Ex08 {

	public static void main(String[] args) {
		System.out.println("2022. 3. 21 : " + getDayOfWeek(2022, 3, 21));
		System.out.println("2021. 3. 1 : " + getDayOfWeek(2021, 3, 1));
		System.out.println("22.03.21 - 21.03.01 차이 => " + dayDiff(2022, 3, 21, 2021, 3, 1));
		System.out.println("--------------------------------------------");
		System.out.println("2010. 6. 29 : " + convertDateToDay(2010, 6, 29)); // 1970.1.1 기준으로 지나온 일수
		System.out.println("733952 : " + convertDateToDay(733952));
		

	} // main
	
	public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) | (year % 400 == 0));
	}
	
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}

	public static String convertDateToDay(int day) {
		int year = 1;
		int month = 0;
		
		while (true) {
			int aYear = isLeapYear(year) ? 366 : 365;
			if(day > aYear) {
				day -= aYear;
				year++;
			} else {
				break;
			}
		} // while
		
		while(true) {
			int endDay = endOfMonth[month];
			if(isLeapYear(year) && month == 1) endDay++;
			
			if(day > endDay) {
				day -= endDay;
				month++;
			} else {
				break;
			}
		} // while
		
		return year + "-" + (month+1) + "-" + day;
	}
	
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear = 0;
		
		for (int i = 1; i < year; i++) {
			if(isLeapYear(i)) numOfLeapYear++;
		}
		
		int toLastYearDaySum = (year-1) * 365 + numOfLeapYear;
		
		int thisYearDaySum = 0;
		
		for (int i = 0; i < month-1; i++) {
			thisYearDaySum += endOfMonth[i];
		}
		
		if(month > 2 && isLeapYear(year)) thisYearDaySum++;
		
		thisYearDaySum += day;
		
		return toLastYearDaySum + thisYearDaySum;
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		return convertDateToDay(year, month, day) % 7 + 1;
	}

} // class
