package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오전 11:09:13
 * @subject 유효성 검사 
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		// 1. 주민등록번호 입력 유효성 검사 000000-0000000
		// String regex = "\\d{6}-\\d{7}";
		
		// 2. 국어 점수 입력 유효성 검사
		// 4번 가장 좋은 코딩
		String regex ="[1-9]?\\d|100"; // 0 ~ 100 정수
		
		// 3번
		//                    [1-9]\\d  => 10~99
		// String regex ="\\d|[1-9]\\d|100";
		
		// 2번
		// String regex = "\\d{1,2}|100";
		
		// 1번
		// String regex = "\\d|//d{2}"; == //d{1,2}  == 숫자 1자리가 와도 되고 3자리가 와도 된다.
		
		// 내가 한 코딩
		// String regex = "\\d|//d{2}|//d[100]";
		
		
		// [과제] 검색 > 정규표현식을 분석(이해) > 이해한대로 카톡을 보내기
		// 회원가입을 할 때 비밀번호의 유효성 검사를 할 때 사용할 예정..
		String password;
		// 5 ~ 15 자리수
		// 알파벳 대소문자, 숫자, 특수문자가 각각 최소한 1개 이상은 들어가야 한다.
		// (제외) $문자
		
		
		
		
		
		

	} // main

} // class
