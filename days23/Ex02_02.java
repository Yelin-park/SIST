package days23;

import java.text.DecimalFormat;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 9:26:58
 * @subject p540 형식화 클래스
 * @content DecimalFormat 클래스
 * 				1. 숫자(정수, 실수, 금액 등)를 원하는 텍스트(문자열)로 변환하는 클래스
 * 					
 */
public class Ex02_02 {

	public static void main(String[] args) {
		int no = 10;
		
		// 0010 4자리 숫자형식으로 출력
		// 방법1)
		// String sno = String.format("%04d", no);
		// System.out.println(sno);
		
		// 방법2) no 자리를 계산해서 로직으로 앞에 0이라는 문자를 부족한만큼 붙이기
		//		10으로 나눠지는 횟수에 따라서
		
		// 방법3) [DecimalFormat 사용]
		String pattern = "'#'0000.00"; // 0010.00  -> 0은 숫자가 없으면 0을 찍는다.
		// String pattern2 = "0000.##"; // 0010	-> #은 숫자가 있을때만 숫자를 찍는다.
		DecimalFormat df = new DecimalFormat(pattern);
		String sno = df.format(no);
		System.out.println(sno);
		
		// #000
		// 패턴기호 # : 10진수, 만자리의 숫자가 없을 경우엔 출력 X
		
		// '#'000
		// escape 패턴기호에서 제외시킬 때 '(홑따옴표) 사용 - > '#' 
		
	} // main

} // class
