package days27;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 9:41:15
 * @subject p691 열거형(enums) == 열거형(자료형)
 * @content		
 * 				1. 열거형이란? 상수의 나열(열거)
 *							 서로 관련된 상수를 편리하게 선언하고 사용하기 위한 것
 * 				
 * 				2. 열거형 선언 형식
 * 					enum 열거형이름 {상수명, 상수명, 상수명, 상수명}
 * 
 * 				3. 열거형 사용하는 방법
 * 					열거형이름.상수명
 * 
 * 				4. 열거형의 조상은 java.lang.Enum 클래스다.
 * 
 * 				5. 왜 열거형을 사용하는가?(이해필요)
 * 					> 개발 시 팀작업을 주로하는데.. 남자/여자 코딩을 하게되면 사람들이 다 다르게 한다
 * 					int gender = 1/0
 * 					boolean gender = t/f
 * 					char gender = 'm'/'f'
 * 					String gender ="남자"/"여자"
 * 
 * 					> 위와 같이 다 다르게하는걸 방지하기 위해서 표준화 필요 -> 표준화를 하기 위한 기능이 '열거형'(JDK 1.5 기능 추가)
 * 				
 */
public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println(Card.CLOVER); // 0
		int cardType = Card2.CLOVER;
		switch (cardType) {
		case Card2.CLOVER: // 상수로 선언하면 코드의 가독성 좋아진다.
			System.out.println("CLOVER 카드");
			break;
		case Card2.HEART:
			System.out.println("HEART 카드");
			break;
		case Card2.DIAMOND:
			System.out.println("DIAMOND 카드");
			break;
		case Card2.SPACE:
			System.out.println("SPACE 카드");
			break;
		default:
			break;
		}
		
	} // main

} // class

// 카드모양 - 클로버, 하트, 스페이스, 다이아
class Card2{
	
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPACE = 3;

} // Card

