package days23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 10:23:24
 * @subject p544 SimpleDateFormat *****[자주 쓰니깐 암기]
 * @content Calendar로 생성한 날짜를 원하는 형식으로! (Date 형변환 필요)
 */
public class Ex03_03 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date d = c.getTime(); // Calendar -> Date
		// Date d2 = new Date(c.getTimeInMillis()); // Calendar -> Date
		
		// SimpleDateFormat
		// 2022년 3월 22일 오전 10:50:44:654(화요일)
		String pattern = "yyyy년 M월 dd일 a hh:mm:ss:S(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sd = sdf.format(d);
		// String sd2 = sdf.format(d2);
		System.out.println(sd);
		// System.out.println(sd2);
		
	} // main

} // class
