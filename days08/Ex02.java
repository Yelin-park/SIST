package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오전 11:29:03
 * @subject 메서드(함수) 설명 p246 ~ p277 메서드는 main() 메서드 밖에서 선언해야 함
 * 			[days06.Ex06_02.isLeapYear() 메서드 선언]
 * @content
 * 			1. 메서드 정의? 프로그래밍에서 [반복되는 명령어들]을 찾아서 별도로 묶어서
 * 							필요할 때 마다 불러서 사용할 수 있도록 하는 것을 메서드(함수)라고 한다.
 * 
 * 			2. 프로그램의 구조화 ->  코드 가독성 좋아 유지 보수 용이
 * 
 * 			3. 반복되는 코딩 -> 구조화 : '메서드로 만들어서'      (재사용 코딩)
 * 
 * 			4. 함수가 기본이 되는 프로그래밍 방식을 구조적 프로그램 언어 : C언어
 * 
 * 			5. 객체가 기본이 되는 프로그래밍 방식을 객체 지향적 프로그래밍 언어 : Java, 요즘 대부분 언어
 * 
 * 			6. 메서드(함수) 선언 형식
 *          [접근제어자] [기타제어자] 리턴자료형 메서드명([매개변수..]) => 메서드 선언부(프로토 타입 prototype)
 *           {   메서드 몸체(body)                                      => 메서드 구현부
 *             // 코딩
 *              [return] [리턴값];
 *          }
 *          
 *          7. 메서드 생성/사용시 3가지 이해
 *            ㄱ. 기능 - 메서드명 작명 : 라인(선) 긋기(출력)하는 기능 drawLine
 *            ㄴ. 매개변수 - X 없다
 *            ㄷ. 리턴값/리턴자료형
 *                  X       void
 *                [접근지정자] [기타제어자]
 *                  public        static  
 *                  
 *          8. 반복적인 코딩 -> 라인 긋기(50줄) -> 메서드 선언 + 사용    
 *           
 *          9. 메서드 사용시 장점
 *             ㄱ. 코드량이 줄어든다. -> 컴파일 용량 줄어든다. -> 실행 성능 향상(빨라짐)
 *             ㄴ. 코드 가독성이 좋아지고, 유지 보수 용이    
 *             ㄷ. 팀 작업 -> 개발 생산성 향상 -> 수익 Good
 *             
 *          10. 메서드 작성(구현)   - [days06.Ex06_02.isLeapYear() 메서드 선언]
 *             1) 윤년 체크 반복 발생 - 윤년 체크 메서드 선언 후 재사용
 *             2) 기능              : 윤년체크하는 메서드  > isLeapYear
 *             	  매개변수          : 체크할 년도          > int year
 *                리턴값+리턴자료형 :
 *                   - int   return -1; return 1;             	 if( ==1) // 윤년이다.
 *                   - void   syso("평년"); syso("윤년");    	 재사용 X
 *                   - String return "평년";  return "윤년"; 	 if( .equals("윤년")
 *                   - *** boolean 윤년 true  평년 false;        if(메서드명()) {}
 *          
 *          11. 메서드(함수)명은 똑같고, '매개변수 갯수', '타입이 다른' 또 다른 함수를 중복해서 선언할 수 있다.
 *          	-> 중복함수([오버로딩] 또는 오버로드) [Overloading], Overload ***
 *                 왜? 똑같은 메서드(함수)명으로 여러개 중복 선언합니까?
 */
public class Ex02 {

	// 메서드 선언 위치[메서드 선언부]
	
	public static void main(String[] args) {
		// 부서원 정보 출력
		drawLine(); // [메서드 호출부]
					// 매개변수는 없이 메서드 이름만 가지고 메서드를 호출하는 방법 -> Call By Name
		System.out.println("부서명 : 사원명");
		drawLine(30); // 매개변수를 실제 값(Value)을 가지고 메서드를 호출하는 방법 -> Call By Value
		System.out.println("영업부 : 박민주");
		System.out.println("총무부 : 이창익");
		System.out.println("생산부 : 백경환");
		System.out.println("영업무 : 박채영");
		
		// 에러메시지 : The method drawLine(int, char) in the type Ex02 is not applicable for the arguments (int, String)
		// 해석 : 매개변수는 int, char인데 입력한 값의 자료형은 int, String이라 인자(인수, 파라미터, 매개변수)를 적용할 수 없다.
		// drawLine(30, "^");
		drawLine(30, '^'); // 매개변수를 실제 값(Value)을 가지고 메서드를 호출하는 방법 -> Call By Value
		
	} // main
	
	// 메서드 선언하는 위치 [메서드 선언부]
	// 1. 선 출력하는 
	public static void drawLine() {
		System.out.println("---------------");
	} // drawLine
	
	// 2. 내가 원하는 길이 만큼의 선을 그릴 수 있는 중복메서드(함수)
	// Duplicate method drawLine() in type Ex02
	// 동일한 메서드명으로 중복 선언 가능하다. +조건) 매개변수 갯수, 타입이 달라야 함
	// 매개변수 n만큼 (-)선을 그리기 때문에 : 선의 길이를 조절
	public static void drawLine(int n) { // int n = 30(값)
		for (int i = 0; i < n; i++) {
			System.out.print("-");	
		}
		System.out.println();
	} // drawLine
	
	// 3. 내가 원하는 모양(스타일)으로, 원하는 길이만큼 선을 그리는 중복메서드(함수)
	public static void drawLine(int n, char style) {
		for (int i = 0; i < n; i++) {
			System.out.print(style);	
		}
		System.out.println();
	} // drawLine

} // class
