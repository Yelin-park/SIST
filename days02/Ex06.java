package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 2:02:59
 * @subject 문자, 문자열 설명
 * @content
 *         A
 *         'A'
 *         "A"
 *         차이점
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 문자랑 문자열 차이
		 * 한문자 + 한문자 + 한문자 .. 문자 나열된 것을 문자열
		 * 자바 문자열 "" printf() 출력서식 %s
		 * 자바 문자 ''printf() 출력서식 %c
		 */

		/*
		 * A > 클래스명, 변수명 등등의 식별자 이름으로 인식(identifer)
		 * 'A'
		 * "A" = 'A' + '\0'(Null 문자)
		 */
		System.out.printf("한문자 - %c\n", 'A'); // 한문자
		System.out.printf("문자열 - %s", "A"); // 문자열

	}

}
