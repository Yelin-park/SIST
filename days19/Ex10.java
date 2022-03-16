package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 2:29:38
 * @subject p419 try-catch문 흐름(처리과정)
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		System.out.println("1 코딩");
		System.out.println("2 코딩");
		
		try {
			System.out.println("3 코딩");
			System.out.println(100 / 10);
			// System.out.println(100 / 0);
			System.out.println("4 코딩");
		} catch (Exception e) {
			System.out.println("5 코딩");
		} finally { // 반드시 있어야할 문은 아니다.
			// [ 예외 발생 여부 상관없이 항상 처리하는 블럭 : finally {} ]
			// 	ex) 파일을 열어서 읽다가 예외 상관없이 ... 파일 닫기
			//		DB Open...CRUD... Close
			System.out.println("finally {} ..."); 
		}
		
		System.out.println("6 코딩");
		System.out.println("정상적 종료!");
		
		// p422
		// e.printStackTrace() : 메서드 정보와 예외 메시지를 화면에 출력하는 메서드
		// e.getMessage()	   : 예외 메서드를 반환하는 메서드
		
	} // main

} // class
