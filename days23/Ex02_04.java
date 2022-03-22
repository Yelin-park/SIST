package days23;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 10:12:51
 * @subject
 * @content 뭔가 이상하니 확인
 */
public class Ex02_04 {

	public static void main(String[] args) {
		String smoney = "1,234,567.89";
		double money;

		// 방법2)
		String pattern = "#,###,##";
		DecimalFormat df = new DecimalFormat(pattern);
		try {
			Number num = df.parse(smoney);
			money = num.doubleValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*
		// 방법1) 
		money = Double.parseDouble(smoney.replaceAll("[\\,]", ""));
		System.out.println(money);
		*/

	} // main

} // class
