package days23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 11:14:47
 * @subject String -> Date 변환 ***[암기]
 * @content	 Date d = sdf.parse(문자열) 메서드를 사용
 */
public class Ex03_04 {

	public static void main(String[] args) {
		// String -> Date 변환 -> Calendar 변환
		String sdate = "2022.03.22(화)";
		
		// 방법1) split이나 substring으로 잘라서 만드는 방법
		// Date d = new Date(2022, 3, 22);
		
		// 방법2) SimpleDateFormat
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Date d;
		try {
			d = sdf.parse(sdate);
			System.out.println(d.toLocaleString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	} // main

} // class
