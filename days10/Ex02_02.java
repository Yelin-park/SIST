package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 10:26:19
 * @subject 제어문 + 배열 + 연산자 + 알고리즘(로직) 응용/활용 예제
 * @content String 클래스 메서드
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// "7655-8988-9234-5677";
		// ㄱ. 카드 번호를 문자열을 구분자 '-'로 잘라내기
		// ㄴ. 
		
		String card ="7655-8988-9234-5677";
		// 문자열을 다루는 메서드
		//  1. 문자열의 길이
		System.out.println(card.length());
		
		//  2. 문자열 속에서 원하는 위치의 한 문자 : charAt(index)
		
		//  3. String.format() : 어떤 데이터를 내가 원하는 형식의 문자열로 만들어서 반환해주는 메서드
		// String data = String.format("%s-%s-%s-%s\n", cardNumbers[0], cardNumbers[1], cardNumbers[2], cardNumbers[3]);
		
		//  4. String.matches(pattern) 메서드
		
		//  5. String.split() 메서드
		String regex = "-";
		String[] cardNumbers = card.split(regex);
		for (int i = 0; i < cardNumbers.length; i++) {
			System.out.println(cardNumbers[i]);
		}
		
		// 6. String.join() 메서드
		card = String.join("-", cardNumbers);
		System.out.println(card);
		
		String rrn = "830412-1700001";
		
		// 7. String.substring(시작 인덱스, 끝인덱스) End 인덱스 앞 위치값까지 읽어온다. *** beginIndex <= index < endIndex
		System.out.println(rrn.substring(0, 6));            // 830412
		System.out.println(rrn.substring(7, 14));           // 1700001
		System.out.println(rrn.substring(7)); 				// endIndex를 생략하면 문자열 끝까지를 나타낸다.
		System.out.println(rrn.substring(0, 8) + "******"); // 830412-1******
		
	} // main

} // class
