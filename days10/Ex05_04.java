package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오후 2:20:29
 * @subject 주민등록번호로 생년월일
 * @content
 */
public class Ex05_04 {

	public static void main(String[] args) {
		// days10 동일한 패키지 안에 있을 경우에는 패키지 명을 입력하지 않아도 됨
		// [days10].Ex05_02.getRRN()
		// 패키지명.클래스명.메서드명()
		String rrn = Ex05_02.getRRN(); // 990112-1411001
		System.out.println(rrn);
		// 1. 주민등록번호 -> 성별 출력
		// 2. 주민등록번호 -> 생년월일 출력
		
		String birthday = getBirth(rrn);  // 1999년 01월 12일
		System.out.println(birthday);

	} // main
	
	// 1. 기능 : 주민번호로부터 생년월일을 반환하는 메서드
	// 2. 매개변수 :  주민등록번호 rrn
	// 3. 리턴값+리턴자료형 : 생년월일 String   ex) 1999년 01월 12일
	public static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));  // 99
		int month = Integer.parseInt(rrn.substring(2,4)); // 1
		int day = Integer.parseInt(rrn.substring(4,6));   // 12
		
		// year = 99 -> 1999 / 1899 / 2099
		// 성별(ㅅ)
		// 0 9     -> 1800년대
		// 1 2 5 6 -> 1900년대
		// 3 4 7 8 -> 2000년대
		// rrn.charAt(7)-48 // '1'
		switch (rrn.charAt(7)-48) {
		case 0: case 9:
			year += 1800;
			break;
		case 1: case 2: case 5: case 6:
			year += 1900;
			break;
		default:
			year += 2000;
			break;
		}
		
		// String.format() 내가 원하는 형식의 문자열로 변환
		String birthday = String.format("%d년 %02d월 %d일", year, month, day);
		
		return birthday;
		
	} // getBirth

} // class
