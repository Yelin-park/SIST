package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 11:45:52
 * @subject p483 Math 클래스
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// Math 클래스
		// 1. 안에 있는 멤버가 전부 다 static 멤버(필드, 메서드) -> 자주 사용하니 객체 생성하지 말고 쓰자
		// 2. 수학 계산과 관련된 메서드
		// 3. 필드 2개 밖에 없다.
		System.out.println(Math.PI); // S - static, F = final 3.141592653589793
		System.out.println(Math.E); // 2.718281828459045
		
		// 4. 메서드
		System.out.println(Math.random());
		System.out.println(Math.abs(-10)); // 절대값, pow() 재귀 함수
		System.out.println(Math.pow(2, 3)); // 누승
		System.out.println(Math.max(2, 5));
		System.out.println(Math.min(2, 5));
		System.out.println(Math.sqrt(4));  // 2.0 (제곱 반환해 주는)
		
		// *** 올림(절상), 버림(절삭), 반올림
		System.out.println(Math.ceil(45.179)); // 46.0 : 소수점 첫 번째 자리를 올림(절상) -> 매개변수, 리턴값 double
		System.out.println(Math.ceil(45.779)); // 46.0 : 소수점 첫 번째 자리를 올림(절상) -> 매개변수, 리턴값 double
		System.out.println(Math.ceil(45.579)); // 46.0 : 소수점 첫 번째 자리를 올림(절상) -> 매개변수, 리턴값 double
		
		System.out.println(Math.floor(45.179)); // 45.0 : 소수점 첫 번째 자리를 버림(절삭) -> 매개변수, 리턴값 double
		System.out.println(Math.floor(45.779)); // 45.0 : 소수점 첫 번째 자리를 버림(절삭) -> 매개변수, 리턴값 double
		System.out.println(Math.floor(45.579)); // 45.0 : 소수점 첫 번째 자리를 버림(절삭) -> 매개변수, 리턴값 double
		
		System.out.println(Math.round(45.179)); // 45 : 소수점 첫 번째 자리를 반올림 -> 매개변수 double, 리턴값 int
		System.out.println(Math.round(45.779)); // 46 : 소수점 첫 번째 자리를 반올림 -> 매개변수 double, 리턴값 int
		System.out.println(Math.round(45.579)); // 46 : 소수점 첫 번째 자리를 반올림 -> 매개변수 double, 리턴값 int
		
		// [질/답] 내가 원하는 소수점 자리에서 올림, 반올림, 내림하려면 소수점 첫번째 자리로 변경(ex. 소수점 2번째를 1번째로 하려면 *10 하고 처리 후 /10)
		
	} // main

} // class
