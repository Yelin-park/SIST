package days23;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 9:52:31
 * @subject p543 예제 10-11 응용
 * @content p542 예제10-10 수업 종료 후 코딩
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// 방법1)
		/*
		String smoney = "1,234,400";
		int money = Integer.parseInt(smoney.replaceAll(",", ""));
		System.out.println(money);
		*/
		
		// 방법2)
		// df.parse(문자열)의 반환타입은 숫자형(Number)
		// Number 클래스 : 숫자 래퍼클래스의 부모클래스
		String smoney = "1,234,400";
		String pattern ="";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number num = df.parse(smoney);
			int money = num.intValue(); // num.intValue() : Number 타입을 int 타입으로 변환하여 반환해주는 메서드
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	} // main

} // class
