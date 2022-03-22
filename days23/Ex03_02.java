package days23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 10:23:24
 * @subject p544 SimpleDateFormat *****[자주 쓰니깐 암기]
 * @content Date로 생성한 날짜를 원하는 형식으로!
 */
public class Ex03_02 {

	public static void main(String[] args) {
		Date d = new Date();
		/*
		System.out.println(d); // Tue Mar 22 10:40:38 KST 2022 한국표준시
		System.out.println(d.toGMTString()); // 22 Mar 2022 01:40:38 GMT 그리니치 평균 시간
		System.out.println(d.toLocaleString()); // 2022. 3. 22 오전 10:40:38 지역에서 사용하는 시간
		*/
		
		// d,c  2022년 3월 22일 00:00:00(화요일)
		// String pattern = "yyyy년 MM월 dd일";
		String pattern = "yyyy년 M월 dd일 a hh:mm:ss:S(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sd = sdf.format(d);
		System.out.println(sd); // 2022년 03월 22일
		
	} // main


} // class
