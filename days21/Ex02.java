package days21;

import java.util.StringTokenizer;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 11:30:45
 * @subject p514 문자열을 다루는 클래스 StringTokenizer 클래스
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 토큰
		String str ="홍길동, 길성이 ,마동석, 이하늬";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens()); // 토큰이 몇 개 만들어졌는지 갯수를 반환해주는 메서드
		// String st.nextToken(); 다음 토큰(이름)을 반환하는 메서드 -> 매개변수 X, 리턴타입 String
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken()); // 갯수보다 더 많은 토큰을 가져오자고 하면 NoSuchElementException 예외 발생
		*/
		
		// 위의 반복적인 코드를 while문으로 처리
		while(st.hasMoreTokens()) { // hasMoreTokens() : 가져올 토큰이 남아있다면 true 값을 반환
			System.out.println(st.nextToken());
		}
		
		// String.split() 문자열을 구분자(regex)를 사용해서 잘래내기 -> 권장사항(토큰으로 할 수 있지만, split()으로 사용하는 걸 권장)
		/*
		String[] names = str.split("\\s*,\\s*");   // \\s* 공백이 있던지 없던지
		for (String name : names) {
			// System.out.printf("[%s]", name.trim());
			System.out.printf("[%s]", name);
		}
		*/

	} // main

} // class
