package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오전 11:38:24
 * @subject 상속 이해 예제
 * @content 닫기 버튼 클릭해도 안닫힘
 * 			[자바 이벤트 처리 방법] 자바 버튼 클릴할 때 클릭 이벤트 처리할 줄 알아야 함 
 * 			1. 리스너(listener) == 이벤트 발생 -> 처리 == 청취자
 * 			2. 어댑터(adapter)
 * 
 */
public class Ex04 {

	public static void main(String[] args) {
		// MyApplication.java 파일 추가
		new MyApplication(); // 객체 생성
		
		System.out.println("END");
		
	} // main

} // class
