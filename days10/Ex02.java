package days10;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 10:26:19
 * @subject 제어문 + 배열 + 연산자 + 알고리즘(로직) 응용/활용 예제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 결재할 때 마다 랜덤하게 특정 위치 4자리 숫자가 **** 출력(표시)
		String card ="7655-8988-9234-5677"; // 총 19자리, 3, 5-8, 
		
		String regex = "-";
		String[] cardNumbers = card.split(regex);
		
		// 0,1,2,3 중에 임의의 수(난수) 발생
		Random rnd = new Random();
		int starIndex = rnd.nextInt(4);
		cardNumbers[starIndex] = "****";

		// 각 배열의 요소 값을 '-'로 연결(결합)해서 출력...
		// System.out.printf("%s-%s-%s-%s\n", cardNumbers[0], cardNumbers[1], cardNumbers[2], cardNumbers[3]);

		// format() : 어떤 데이터를 내가 원하는 형식의 문자열로 만들어서 반환해주는 메서드
		String data = String.format("%s-%s-%s-%s\n", cardNumbers[0], cardNumbers[1], cardNumbers[2], cardNumbers[3]);
		
		// 6. String.join() 메서드
		card = String.join("-", cardNumbers);
		System.out.println(card);
		
		
		
	} // main

} // class
