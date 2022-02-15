package days01;

/**
 * @author Yelin
 * @date 2022. 2. 15. - 오후 4:26:36
 * @subject 자바프로그램의 기본 구조
 * @content
 *                클래스 선언 설명
 *                System 클래스 설명
 *                main() 메서드 설명
 *                
 */

// 자바 프로그램의 기본 구조
// 1. 시작 개체로 사용할 클래스 선언
// 2. 시작 개체 안에 main() 메서드 선언
public class Ex03{
	public static void main(String[] args) { // java.exe 자바 인터프리터
		// 프로그램 시작
		
		// 본인 이름을 화면에 출력하는 작업
		// 표준 입력 장치 (키보드)
		// 표준 출력 장치 (모니터, 프린터기)
		// 자바에서 표준 입출력을 할 수 있는 물건? System 물건(클래스)
		// System 기능 : A부분 입력(in), 출력(out)
		// System.in 표준 입력
		// 일 : println() -> 망치질 하겠다.
		// 출력할 값 : "박예린"
		
		// System 클래스 설명서
		System.out.println("박예린");
		// 명령 종결 연산자 = ;(세미콜론)
		
		// 설명) 벽에 못을 하나 박아라(일)
		//        물건 : 망치(Object, 객체, 개체, 클래스)
		//        기능 : A 부분(못을 박는 기능), B 부분(못을 빼는 기능)
		//          일 : 망치질 하겠다.
		// 필요한 물건(값) : 못
		// 창고에 가서 망치를 찾아 A부분으로 망치질하다("못");
		
	} // 프로그램 종료
}

// 왜? 시작개체, main() 메서드가 항상 필요한가?
// 1. Hello.java 소스파일
//     본인 이름 출력 코딩
// 2. javac Hello.java 컴파일 -> Hello.class 클래스 파일 생성, 바이트코드
// 3. java Hello 실행(내부적으로는 Hello.class 파일을 찾음) -> 자바 인터프리터가 Hello 시작 개체 찾아서 -> main() {
//                                                                                Hello 클래스 선언                                 프로그램 시작, 종료 기능(일)
//     Ctrl + F11
//     박예린