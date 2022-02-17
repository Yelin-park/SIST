package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 12:39:21
 * @subject 상수(constant)와 리터럴(literal)(p30)
 * @content 상수는 const라고도 함
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		// 상수? 고정된 수 + 저장 공간     <-> 변수(메모리상의 저장공간)  ex)PI(원주률값)
		// 리터럴? 고정된 수 > 3.14(실수 리터럴), 'A'(문자 리터럴), 10(정수 리터럴), true(불린 리터럴) 등등 > 값 자체
		// PI 상수 > PI는 상수, 3.141592는 리터럴이라고 한다
		
		// 원면적 : 반지름 * 반지름 * PI(3.14..)
		// 원둘레 : 2 * 반지름 * PI
		
		int r = 12; // 원의 반지름
		
		// PI 상수 > PI는 상수, 3.141592는 리터럴
		// 상수 선언 할때
		// 1) 대문자로 선언하는 것을 권장
		// 2) 상수명이 만약 first name처럼 단어+단어라면, FIRST_NAME _(언더바)를 사용하여 구분
		final double PI = 3.141592;
		// 에러메시지 : The final local variable PI cannot be assigned. It must be blank and not using a compound assignment
		// 해석 : 지역변수 PI는 final로 선언했기 때문에 값을 바꿀 수 없다. 만약 정말 값을 바꾸고 싶으면 final을 지워라
		// PI = 3.142592;
		
		/* 무수히 많은 PI를 사용
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 * r * r * 3.141592;
		 */
		
	}

}
