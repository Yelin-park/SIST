package days06;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 4:01:25
 * @subject Ch04 제어문
 * @content 윤년/평년 의미 파악 ->  요구분석서
 *          유효성 검사(ex. 비밀번호 4~8자리, 특수문자1, 대문자1 필수사항)
 *            1) String.matches(regex) 메서드
 *            2) 입력이 잘못되었을 경우에는 다시 년도 값을 입력받도록 처리
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 년도를 입력받아서 윤년/평년 출력하는 코딩
		int year; // 입력 ex) 1921, 2021 .. 정수로 입력받기
		
		// 입력한 값에 대한 [유효성 검사]를 한 후에 year 변수 대입
		Scanner sc = new Scanner(System.in);
		// year = sc.nextInt();
		// 우선 문자열 "2021" => sYear 변수에 저장
		
		// [String.matches(regex) 메서드] boolean sYear.matches(String regex);
		// ***** String regex 정규표현식 / regex == Regular Expression 줄임말 *****
		// 1. 기능 : 주어진 매개변수인 정규표헌식(regex)에 일치하는 체크하는 메서드
		// 2. 매개변수 : String regex 정규표현식 / regex == Regular Expression 줄임말
		// 3. 리턴값(리턴자료형) : boolean true/false
		// String regex = "[0-9]+"; // [0-9] 숫자가 1개 이상 나와야 하는 정규표현식 ([+] : 반복횟수 1번 이상~)
		String regex = "\\d+"; // == String regex = "[0-9]+"; 같은 의미의 코딩
		String sYear;
		
		// 입력이 잘못되었을 경우에는 다시 년도 값을 입력받도록 처리
		do {
			System.out.print("> 년도를 입력하세요: ");
			sYear = sc.next();
		} while ( !sYear.matches(regex)); // 'sYear.matches(regex) == false'와 같은 코딩 > dowhile은 조건식이 true이면 do {}블럭이 실행되니까
		
		// (알림) 입력을 잘못했습니다. -- 전공자들 해보세요~
		
		year = Integer.parseInt(sYear);
		
		if (year % 100 != 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년(leap year)");
		} else {
			System.out.println("평년(common year)");
		}
		
		
		// [요구 분석서]
		// 1. 윤년(leap year)? 태양력에서 2/29까지 있는 년도
        //                   치윤법(?)에 따라 400년에 97년을 윤년 : 400년 중 97년을 윤년 : 
		// 1년 == 365일                    / 율리우스력(1년에 0.0078일의 오차가 있음)
		// (정확)1년 == 365.2422일         / 1년에 0.25일
		//       2년 == 365.4844일
		//       3년 == 365.7266일
		//       4년 == 365.9688일         / 4년마다 1일  > 2/29(윤년)
		
		// "그레고리오력(치윤법 사용) 윤년을 치환하는 법(규칙)    1년 == 365.2425일  > 0.0003일 오차
		// ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
		//    4/8/12/16/20.../100/200..400/800    4의 배수 년도 -> 윤년    
		//     year % 4 == 0
		
		// ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, (떨어지지않으면 윤년)
		//    .../100(평년)/200(평년)/ ..400/800
		//    year % 100 != 0
		
		// ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다.
		//    ..400(윤년)/800(윤년)
		//    year % 400 == 0
		
		// 400년이되면 97번의 윤년이 발생
		// 한국은 1896년부터 태양력(그레고리오력)을 사용하고 있다.

		// 2. 평년(common year)? 태양력에서 2/28까지 있는 년도

	}

}
