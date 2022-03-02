package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 4:42:03
 * @subject
 * @content
 */
public class Ex05_08 {

	public static void main(String[] args) {
		
		String rrn = Ex05_02.getRRN();
		
		// [주민등록번호 검증 규칙]
		// 951217 - 2 1 6 4   3  1 8
		// 012345 6 7 8 9 10 11 12 13
		// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ + 8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) % 11}
		// 즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		// 입력받은 주민번호 검증
		// "올바른 주민등록번호 입니다."
		// "잘못된 주민등록번호 입니다."
		
	      int ㄱ = Integer.parseInt(  rrn.substring(0, 1) );
	      int ㄴ = Integer.parseInt(  rrn.substring(1, 2) );
	      int ㄷ = Integer.parseInt(  rrn.substring(2, 3) );
	      int ㄹ = Integer.parseInt(  rrn.substring(3, 4) );
	      int ㅁ = Integer.parseInt(  rrn.substring(4, 5) );
	      int ㅂ = Integer.parseInt(  rrn.substring(5, 6) );
	      //            -                                                 6,7
	      int ㅅ = Integer.parseInt(  rrn.substring(7, 8) );
	      int ㅇ = Integer.parseInt(  rrn.substring(8, 9) );
	      int ㅈ = Integer.parseInt(  rrn.substring(9, 10) );
	      int ㅊ = Integer.parseInt(  rrn.substring(10, 11) );
	      int ㅋ = Integer.parseInt(  rrn.substring(11, 12) );
	      int ㅌ = Integer.parseInt(  rrn.substring(12, 13) );

		int ㅍ = 11-((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ + 8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
		
		/*
		// 내가 푼 코딩ㅋㅋㅋㅋ
		int check = 11 - ((Integer.parseInt(rrn.substring(0,1)) * 2 + Integer.parseInt(rrn.substring(1,2)) * 3 + Integer.parseInt(rrn.substring(2,3)) * 4 + Integer.parseInt(rrn.substring(3,4)) * 5 + Integer.parseInt(rrn.substring(4,5)) * 6 + Integer.parseInt(rrn.substring(5,6)) * 7 + Integer.parseInt(rrn.substring(7,8)) * 8 + Integer.parseInt(rrn.substring(8,9)) * 9 + Integer.parseInt(rrn.substring(9,10)) * 2 + Integer.parseInt(rrn.substring(10, 11)) * 3 + Integer.parseInt(rrn.substring(11,12)) * 4 + Integer.parseInt(rrn.substring(12,13)) * 5) % 11 );
		if(check == 10) check = 0;
		if(check == 11) check = 1;
		String sCheck = check == Integer.parseInt(rrn.substring(13)) ? "올바른 주민등록번호 입니다." : "잘못된 주민등록번호 입니다.";
		System.out.println(sCheck);
		*/


		
		
		
		
	} // main

} // class
