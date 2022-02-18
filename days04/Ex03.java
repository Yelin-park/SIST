package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오전 11:53:24
 * @subject 쉬프트(shift) 연산자  >>    <<    >>>
 * @content
 */

public class Ex03 {

	public static void main(String[] args) {
		// 쉬프트(shift) 연산자  >>    <<    >>>
		System.out.println(15 >> 2); // 비트 값을 오른쪽으로 2칸 이동 > 첫 번째 비트 값이 0이면 남은 자리에 0 채우고 1이면 1로 채우기 > 00000011 >  3
		System.out.println(15 << 2); // 비트 값을 왼쪽으로 2칸 이동 > 왼쪽으로 밀때는 무조건 남은 자리 0으로 채움 > 00111100  > 60
		System.out.println(15 >>> 2); // 비트 값을 오른쪽으로 2칸 이동 > 첫 번째 비트 값과 상관없이 남은 자리는 무조건 0으로 채움 
		
		
		// 10진수 10을 0000 1010 2진수로 출력(표현)
		System.out.println(Integer.toBinaryString(10));  // "1010" String 리턴자료형
		
		// 10진수 10을 8진수로 출력
		System.out.println(Integer.toOctalString(10));  // "12" String 리턴자료형
		
		// 10진수 10을 16진수로 출력
		System.out.println(Integer.toHexString(10));  // "12" String 리턴자료형
		
		// int 10을 String "10"으로 형변환
		String n = 10 + ""; // 정수형 + ""(빈문자열) => 문자열로 변환
		
		
		// String "10"을 int 10으로 형변환
		int m = Integer.parseInt("10");
	}

}
