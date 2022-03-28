package days27;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 9:55:28
 * @subject 열거형(enums)
 * @content Enum : name(), ordinal(), values() 메서드 기억하기
 * 			values() : 열거형 안에 선언된 모든 상수를 반환하는 메서드
 * 			ordinal() : 열거형 안에 선언된 상수의 순서를 반환하는 메서드				
 * 
 */
public class Ex02_02 {
	
	// enum 파일을 만들지 않고 해당 클래스 안에서만 사용할 거면 아래와 같이 선언해도 됨
	// public enum Card { CLOVER, HEART, DIAMOND, SPACE };

	public static void main(String[] args) {
		
		Card c = Card.HEART;
		
		System.out.println(c.toString()); // toString() 생략해도 됨 / "HEART"
		System.out.println(c.name()); // "HEART"
		// 값을 안주면 의미상으로 -> enum Card { CLOVER = 0, HEART = 1, DIAMOND = 2, SPACE = 3 };
		System.out.println(c.ordinal()); // 1
		
		Card[] cArr = Card.values();
		for (Card card : cArr) {
			System.out.printf("%s = %d\n", card.name(), card.ordinal());
		}
		
		// switch 문
		switch (c) {
		case CLOVER:
			break;
		case HEART:
			break;
		case DIAMOND:
			break;
		case SPACE:
			break;
		default:
			break;
		} // switch

	} // main

} // class
