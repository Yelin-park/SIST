package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 3:31:52
 * @subject p429 예제8-12
 * @content
 */
public class Ex14 {

	public static void main(String[] args) throws Exception { // main() 메서드까지 throws 하는 것은 프로그램 종료시까지 예외처리를 안하겠다.
		// try {
			method1();
		// } catch (Exception e) {
		//	e.printStackTrace();
		// }

	} // main

	private static void method1() throws Exception {
		// try {
			method2();
		// } catch (Exception e) {
		// 	e.printStackTrace();
	    // }
		System.out.println("> method1() 호출됨");
	}

	private static void method2() throws Exception {  // 예외처리를 떠넘겨라~
		System.out.println("> method2() 호출됨");
		throw new Exception();  // 컴파일러가 예외 처리를 체크 -> "checked 예외"
	}

} // class
