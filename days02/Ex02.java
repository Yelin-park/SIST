package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오전 10:57:51
 * @subject 지역변수 선언 및 변수에 값 할당
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		int age;       // 나이를 저장할 age 변수를 선언
		age = 20;   // 20 나이를 age 변수에 대입(할당) > 초기화 작업
		// 에러 : The local variable age may not have been initialized
		// local variable == 지역변수
		// age 지역변수는 초기화 되지 않아서 에러가 발생했다.
		System.out.println(age); // age 변수 값을 출력

	}

}
