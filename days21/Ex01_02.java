package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 10:16:30
 * @subject 문자열을 수정, 삭제, 추가 등등 변경 자주 -> String 클래스 X, [StringBuffer], StringBuilder 클래스 사용
 * @content 버퍼(Buffer) 라는 단어가 들어가 있으면 임시기억공간이 있다는 소리
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 문자열을 수정, 삭제, 추가 등등 변경 자주 -> String 클래스 X, StringBuffer, StringBuilder 클래스 사용
		String str1 ="안녕하세요.홍길동입니다.";
		// toString() 메서드 오버라이딩(재정의) 
		StringBuffer sb = new StringBuffer(str1);
		
		// System.out.println(sb.toString()); // 자신의 정보를 문자열로 반환하는 메서드 앞으로는 아래 코딩으로 사용
		System.out.println(sb);
		
		// 1. 안녕 + (Hello) 삽입 - insert() 메서드
		// System.out.println(sb.reverse()); // reverse() 문자열을 뒤집는 메서드
		int idx = sb.indexOf("안녕") + "안녕".length();
		System.out.println(sb.insert(idx, "(Hello)"));
		
		// 2. 홍길동 삭제  - delete() 메서드
		int start = sb.indexOf("홍길동");
		int end = start + "홍길동".length();
		System.out.println(sb.delete(start, end));
		
		// 3. 홍길동 -> 야리니 수정 - replace() 메서드 > String 클래스에 있는 메서드와 매개변수가 다름
		sb.replace(start, end, "야리니");
				
	} // main

} // class



