package days23;

import java.text.MessageFormat;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 11:37:35
 * @subject p549 MessageFormat 클래스
 * @content		- 어떤 데이터를 형식(양식)에 맞춰서 출력하는 클래스
 */
public class Ex05 {

	public static void main(String[] args) {
		// 
		String name = "yaliny";
		int age = 18;
		boolean gender = false;
		
		// [MessageFormat 클래스]를 사용하면 어떤지 비교해보자~
		// 		=> %d, %c, %f와 같은 것이 아니라 {0}, {1} 숫자를 넣어서 사용
		
		// 아래와 같이 코딩을 하지 않아도 된다. -> 이유는?
		/*
		String pattern = "";
		MessageFormat mf = new MessageFormat(pattern);
		String message = mf.format(null);
		System.out.println(message);
		*/
		
		// 이유 답 => static 메서드이기 때문에
		String message = MessageFormat.format("이름 : {0}, 나이 : {1}, 성별 : {2}", name, age, gender ? "남자" : "여자");
		System.out.println(message); // 이름 : yaliny, 나이 : 18, 성별 : 여자

		
		// 이름 : yaliny, 나이 : 18살, 성별 : 여자
		/*
		// 방법1)
		String message = String.format("이름 : %s, 나이 : %d살, 성별 : %s", name, age, gender ? "남자" : "여자");
		System.out.println(message);
		*/
		
		
	} // main

} // class
