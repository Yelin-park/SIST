package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 12:22:23
 * @subject p490 래퍼(Wrapper) 클래스
 * @content 	p492 Number클래스
 * 				문자열 "100" -> 숫자로 변환하는 방법 3가지
 */			 
public class Ex05 {

	public static void main(String[] args) {
		// 래퍼(Wrapper)클래스
		// 기본형 8가지를 클래스(필드, 메서드)로 가공해 놓은 것을 [래퍼클래스]라고 한다.
		/*
		 * 1. boolean 	-> Boolean
		 * 2. byte		-> Byte
		 * 3. short		-> Short
		 * 4. int		-> Integer
		 * 5. long		-> Long
		 * 6. float		-> Float
		 * 7. double	-> Double
		 * 8. char		-> Character
		 */
		
		// 큰 값과 작은 값을 구해주는 메서드
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Integer.parseInt() 문자열을 int로 바꿔주는 메서드
		int n = Integer.parseInt("100");
		//						   radix											
		n = Integer.parseInt("100", 2); // 10진수 100 -> 2진수 4
		n = Integer.parseInt("100", 8); // 10진수 100 -> 8진수 10
		
		// int를 2, 8, 16 진수로 변환해주는 메서드
		Integer.toBinaryString(n); 	// 2진수
		Integer.toHexString(n);		// 8진수
		Integer.toOctalString(n);	// 16진수
		
		// Integer.valueOf() 
		int a = Integer.valueOf("100"); // 문자열을 int형으로 바꿔주는 메서드
		
		// Character.isDigit()
		System.out.println(Character.isDigit('C')); // 안에 있는 값이 숫자인지 물어보는 메서드
		
		// [Number클래스]
		// 1. 추상클래스이다.
		// 2. 숫자를 필드(멤버변수)로 갖는 래퍼클래스들의 조상이다. (byte, short, int, long, float, double)
		// 3. 2번 외에 2가지 클래스
		// 		ㄴ BigInteger 클래스 : long형보다 더 큰 정수 값의 범위을 다루는 자료형
		// 		ㄴ BigDecimal 클래스 : double형보다 더 큰 실수(부동소수점) 값의 범위를 다루는 자료형
		
		// [문자열 "100" -> 숫자로 변환하는 방법 3가지]
		// 1. Integer.parseInt("100");
		// 2. intValue()
		/*
		Integer i = new Integer("100");
		int j = i.intValue();
		int i = new Integer("100").intValue(); // 위의 코딩 한줄
		*/
		// 3. int i = Integer.valueOf("100");
		
	} // main

} // class
