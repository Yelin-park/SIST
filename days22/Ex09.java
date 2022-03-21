package days22;

import java.text.DecimalFormat;

/**
 * @author Yelin
 * @date 2022. 3. 21. - 오후 4:41:28
 * @subject p540 형식화 클래스 : DecimalFormat 클래스 -> 숫자를 형식화 하는 클래스
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// DecimalFormat을 이용하여 손쉽게~
		int money = 3257600;
		
		// \u00A4 -> \
		// #,### -> 3자리씩 , 찍기
		String pattern = "\u00A4#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		
		String smoney = df.format(money);
		System.out.println(smoney);
		
		// 화폐단위 + 3자리마다 콤마
		// \3,257,600 출력
		// 방법1)
		/*
		System.out.printf("\\%,d", money);
		String smoney = String.format("\\%,d", money);
		System.out.println(smoney);
		*/
		
		// 방법2)
		// 3 2 5 7 6 0 0 
		// 006,752,3   -> 3자리씩 읽어서 , 추가
		// 그리고 반대로 출력
		/*
		StringBuffer sb = new StringBuffer(money + "");
		sb.reverse();
		for (int i = 0; i < sb.length(); i++) {
			if(i%4==2) sb.insert(i+1, ",");
		}
		String sMoney = sb.reverse().toString();
		System.out.println(sMoney);
		*/
		
		// 방법3)
		/*
		String[] sMoney = (money+"").split(""); // 한문자씩 잘림
		String sm = "";
		for (int i = sMoney.length-1, k = 0; i >= 0; i--, k++) {
			sm = sMoney[i] + sm;
			if(k % 3 == 2) sm = "," + sm;
		}
		System.out.println(sm);
		*/
		
	} // main

} // class
