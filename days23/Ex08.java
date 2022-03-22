package days23;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 4:05:53
 * @subject p558 가운데... truncatedTo(매개변수) 메서드 -> 매개변수 밑으로 절삭하겠다.
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.of(12, 34, 56);
		System.out.println(t);
		
		// 시간(hour) 밑으로는 전부 절삭
		t = t.truncatedTo(ChronoUnit.HOURS); // 12:00
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.of(2022, 3, 25, 12, 34, 57);
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 일(day) 밑으로는 전부 절삭
		System.out.println(dt); // 2022-03-25T00:00
		
	} // main

} // class
