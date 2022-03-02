package days10;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 12:33:38
 * @subject 주민등록번호로 성별
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

	String rrn = getRRN();
	System.out.println(rrn);
	
	// 1. 주민등록번호로부터 성별을 출력 ex)"남자", "여자"
	boolean gender = getGender(rrn); 
	System.out.println(gender ? "남자" : "여자");
	
	
	
	} // main
	
	// 기능 : 주민등록번호를 가지고 남자 true, 여자 false
	// 매개변수 : 체크하고자 하는 주민등록번호 rrn
	// 리턴값 + 리턴자료형 : true/false boolean
	private static boolean getGender(String rrn) {  // 남/여만 확인 가능 -> 재사용성 떨어지는 함수
		// 남자 -> 1/3/5/7/9
		/*
		// 내가 푼 코딩
		boolean gender;
		char[] ch = rrn.toCharArray();
		gender = ch[7] == 0 || ch[7] % 2 == 0 ? false : true;
		return gender;
		*/
		
		// 풀이 4) 정규표현식
		return rrn.substring(7, 8).matches("[13579]");
		
		
		/*
		// 풀이 3) substring
		if(Integer.parseInt(rrn.substring(7, 8)) % 2 == 1) return true;
		else return false;
		
		// return Integer.parseInt(rrn.substring(7, 8)) % 2 == 1; // 풀이3과 동일한 코딩 -> 이 값자체가 t/f 반환
		*/
		
		/*
		// 풀이2) charAt
		return (rrn.charAt(7)-48) % 2 == 1 ? true: false; // *** 48을 꼭 빼줘야 함.charAt(7)이 '1'이면 숫자 49이기 때문에
		// return (rrn.charAt(7)-48) % 2 == 1; // 위의 코딩과 동일한 코딩 -> 이 값자체가 t/f 반환
		*/
		
		/*
		// 풀이1) charAt
		if( (rrn.charAt(7)-48) % 2 == 1) return true;
		else return false;
		*/
		
	} // getGender

	public static String getRRN() {
		String rrn, regex = "\\d{6}-\\d{7}";;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("> 주민등록번호 입력?");
			rrn = sc.next();
		} while (!rrn.matches(regex));
		
		return rrn;
	} // getRRN

} // class
