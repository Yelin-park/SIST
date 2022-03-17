package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 3:30:34
 * @subject String 클래스 메서드 정리
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		// 14. compareTo() 메서드 - 두 문자열을 비교하여 숫자를 돌려준다. -> 양수, 0(두 문자열이 같다), 음수 -> 누가 먼저 오는지 순서를 체크하고싶을 때 사용
		 String a = "kbs";
		 String b = "sbs"; // 두 문자열을 비교 boolean equals(), equalsIgnoreCase(), compareTo() 양수, 0(두 문자열이 같다), 음수
		 System.out.println(a.compareTo(b)); // -8 음수 -> k - s = -8
		 System.out.println(b.compareTo(a)); // 8 양수 -> s - k = 8
		 

		// 15. startWith() 메서드 - 어떠한 문자열로 시작하는지 확인해주는 메서드
		// endWith() 메서드 - 어떠한 문자열로 끝나는지 확인해주는 메서드
		/*
		 String url = "http://www.naver.com"; // 반드시 http:// 문자열로 시작을 해야지 올바른 URL이다.
		 
		 String prefix = "http://"; // 접두사
		 System.out.println(url.startsWith(prefix));
		 // 정규표현식 : ^http://.* -> http://로 시작하냐? .* : 문자가 와도좋고 안와도 좋다.
		 
		 String suffix = ".com"; // 접미사
		 System.out.println(url.endsWith(suffix));
		 */

		
		// [문제] 파일 열어서 읽기 작업을 할 때 파일의 경로가 필요
		// dir 문자열의 마지막에 \\가 있는지 없는지 확인하기
		String dir = "C:\\temp\\test";
		String filename = "aaa.html";
		String fullPath = dir + (dir.endsWith("\\") ? "" : "\\") + filename;
		System.out.println(fullPath);
		
		/*
		if (!(dir.endsWith(suffix))) {
			dir = dir + "\\";
			fullPath = dir + filename;
			System.out.println(fullPath);
		} else
			System.out.println(fullPath);
		*/
		
		// 16.join() 메서드 *** 기억훼~! JSP/Spring 할 때 자주 쓰임
		//			원하는 구분자로 연결해주는 메서드
		String[] names = {"손예진", "현빈", "유재석", "기리보이"};
		// static 메서드 - 클래스명.메서드명()
		// String result = String.join("-", names);
		// String result = "<ol><li>" + String.join("</li><li>", names) + "</ol></li>";
		// System.out.println(result);
		
		String result = "<ol>";
		for (int i = 0; i < names.length; i++) {
			result += "<li>";
			result += names[i];
			result += "</li>";
		}
		result += "</ol>";
		System.out.println(result); // <ol><li>손예진</li><li>현빈</li><li>유재석</li><li>기리보이</li></ol>
		
		
		/*
		 * <ol>
		 * 	<li>손예진</li>
		 * 	<li>현빈</li>
		 * 	<li>유재석</li>
		 * 	<li>기리보이</li>
		 * </ol>
		 */
		
		// 17. "".matches(정규표현식) - 예제 안다루심
		
	} // main

} // class
