package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 4:39:12
 * @subject 비교연산자 설명
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
		// 비교연산자 설명     >     <     >=     <=     ==(같다)   !=(다르다)
		// 결과는 true/false 논리형
		System.out.println(3 > 5); // false
		System.out.println(3 < 5); // true
		System.out.println(3 >= 5); // false
		System.out.println(3 <= 5); // true
		// [주의]
		// 1. 같다라는 비교 연산자는 == (= 2개!)
		// int x = 3;
		// System.out.println(x = 5); > 결과는 5가 나옴
		System.out.println(3 == 5); // false
		// =!은 !=와 완전히 다른 의미이다.
		System.out.println(3 != 5); // true

	}

}
