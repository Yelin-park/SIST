package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 2:53:24
 * @subject String 클래스 메서드 정리
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// [String 클래스 메서드 정리]
		// 11. trim() 메서드 - 앞 뒤 공백 제거하는 메서드
		String str = "   abc   ";
		System.out.printf("[%s]\n", str.trim()); // abc  회원가입할 때 실수로 들어가는 공백을 지워줄 때 자주 사용함
		
		// 12. concat() 메서드 - 문자열 연결하는 메서드 - 자주 사용하지는 않음
		String a = "123";
		String b = "456";
		// String c = a + b;
		// String c = a.concat(b);

		String c = "789";
		// String result = a + b + c;
		String result = a.concat(b).concat(c);
		System.out.println(result); // 123456789
		
		// 13. indexOf() 메서드 - 원하는 문자열을 앞에서부터 찾아서 index 값을 돌려주는것
		//	   lastIndexOf() 메서드 - 원하는 문자열을 뒤에서부터 찾아서 index 값을 돌려주는것
		
		// [문제] 홍길동을 뒤에서 부터 찾아서 인덱스를 모두 출력하세요.
		String msg = "안녕하세요. 홍길동입니다. 홍길동은 무엇을 잘합니다.";
		int findIndex , fromIndex = msg.length()-1;
		while ( (findIndex = msg.lastIndexOf("홍길동", fromIndex)) != -1) {
			System.out.println(findIndex);
			fromIndex = findIndex - 1;
		}
		
		
		/*
		String msg = "안녕하세요. 홍길동입니다. 홍길동은 무엇을 잘합니다.";
		int findIndex =msg.lastIndexOf("홍길동"); // 15
		System.out.println(findIndex); 			 // 15
		
		int fromIndex = findIndex - 1;
		findIndex = msg.lastIndexOf("홍길동", fromIndex);
		System.out.println(findIndex); 			 // 7
		
		fromIndex = findIndex - 1;
		findIndex = msg.lastIndexOf("홍길동", fromIndex);
		System.out.println(findIndex);
		*/
		
		/*
		//            0          7
		String msg = "안녕하세요. 홍길동입니다. 홍길동은 무엇을 잘합니다.";
		// [문제] 홍길동을 찾아서 인덱스를 모두 출력하세요.
		int findIndex , fromIndex = 0;
		while ( (findIndex = msg.indexOf("홍길동", fromIndex)) != -1) {
			System.out.println(findIndex);
			fromIndex = findIndex + "홍길동".length();
		}
		*/
		/*
		String msg = "안녕하세요. 홍길동입니다. 홍길동은 무엇을 잘합니다.";
		int findIndex = msg.indexOf("홍길동");
		System.out.println(findIndex);
		int fromIndex = findIndex + "홍길동".length(); // 7+3 = 10
		findIndex = msg.indexOf("홍길동", fromIndex);
		System.out.println(findIndex);
		
		fromIndex = findIndex + "홍길동".length(); // 15
		findIndex = msg.indexOf("홍길동", fromIndex);
		System.out.println(findIndex); // -1
		*/
		
	} // main

} // class
