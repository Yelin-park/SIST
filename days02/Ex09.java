package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 2:52:47
 * @subject 식별자(identifier)를 명명하는 규칙
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 자바의 정석 p.25
		// 식별자(identifier)를 명명하는 규칙(이름을 짓는)
		// 1. 대소문자 구분한다. 길이는 제한이 없다.
		// String Name = "홍길동";
		// System.out.println(name);
		// 2. 단어+단어 > 캐멀표기법(단어가 바뀔 때 대문자로 시작)
		// String firstName;
		// 3. 키워드를 사용하면 안된다.
		// String public; -> X
		// int int; -> X
		// 4. 숫자로 시작할 수 없다.
		// String name01; -> O
		// String 01name; -> X
		// 5. 만약에 식별자 사이에 공백을 주고 싶을 때
		// String last_name; -> 공백 대신에 _(언더바) 사용
		// String _name; -> _(언더바), $(달러)만 특수문자 허용

	} // main

} // class
