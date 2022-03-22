package days23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오후 4:10:19
 * @subject p559 날짜, 시간의 비교 - isAfter() / isBefore() / isEqual() 메서드
 * @content p559 예제10-22 -> 오늘 날짜가 생일 지났는지 여부 체크
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		Date d = new Date();
		d.after(when);
		d.before(when);
		d.equals(d);
		d.compareTo(when);
		*/
		
		// LocalDate + LocalTime
		LocalDateTime dt1 = LocalDateTime.now();
		// System.out.println(dt1); // 2022-03-22T16:12:42.991
		dt1 = dt1.truncatedTo(ChronoUnit.DAYS); // 일자 밑에 있는 것은 다 절삭 -> 시간 제거후 isEqual하면 true가 나옴
		System.out.println(dt1);
		LocalDateTime dt2 = LocalDateTime.of(2022, 3, 22, 19, 20, 10);
		
		System.out.println(dt1.isEqual(dt2)); // false -> 날짜는 동일하지만 시간이 달라서
		System.out.println(dt1.compareTo(dt2)); // 0(같음),  dt1이 dt2보다 안지났으면 -1, 지났으면 1
		
		System.out.println(dt1.isAfter(dt2)); // false
		System.out.println(dt1.isBefore(dt2)); // true
		
		// 설문조사기간 : 2022.3.15 ~ 2022.3.22(T00:00:00)
		// 오늘 날짜 : 2022.3.22(T16:12:39.507)인데 설문조사기간이 지났다고 나오는 이유는 [시간 차이] 때문에 -> 시간을 제거해서 날짜만 비교해야됨 
		
	} // main

} // class
