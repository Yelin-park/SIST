package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오전 11:13:51
 * @subject 지역변수(local variable)의 개념
 * @content 그 지역 안에서만 사용할 수 있는 변수({} 범위연산자 안에서만 사용할 수 있음)
 *          지역변수는 반드시 초기화해야지 사용할 수 있다 *          
 */
public class Ex03 {

	public static void main(String[] args) {
		// 지역변수 { 열고 } 닫는 부분까지 사용 가능
		String name = "박예린";
		
		// ; > 종결 연산자
		// . > 멤버 연산자
		// {} > 범위 연산자
		{
			// 지역변수 선언
			int age = 20;
			System.out.println(age);
			System.out.println(name);
		}
		
		// 에러메시지 : age cannot be resolved to a variable
		// 해석 : age 변수를 확인할 수 없다.
		// System.out.println(age);
		System.out.println(name);
	}
}
