package days24;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 9:53:42
 * @subject p574 예제 10-26 수업 종료 후 코딩
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		String[] patterns = {
				"yyyy-MM-dd HH:mm:ss",
				"''yy년 MMM dd일 E요일",
				"yyyy-MM-dd HH:mm:ss.SSS z VV",
				"yyyy-MM-dd hh:mm:ss a",
				"오늘은 올 해의 D번째 날입니다.",
				"오늘은 이 달의 d번째 날입니다.",
				"오늘은 올 해의 w번째 주입니다.",
				"오늘은 이 달의 W번째 주입니다.",
				"오늘은 이 달의 W번째 E요일입니다."
		};
		
		for (String p : patterns) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern(p);
			System.out.println(dtf.format(zdt));
		}
		
 	} // main

} // class
