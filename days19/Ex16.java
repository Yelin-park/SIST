package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 3:51:46
 * @subject p434 finally 블럭
 * @content p435 예제8-19 (책은 리턴문이 없음)
 */
public class Ex16 {

	public static void main(String[] args) {
		int result = method1();
		
		System.out.println("END");

	} // main

	private static int method1() {
		try {
			System.out.println("> method1() - [1]");
			System.out.println("> method1() - [2]");
			return 1; // 리턴문을 만나서 리턴값을 가지고 호출한 곳으로 리턴되더라도 finally 블럭은 반드시 처리한다.
		} catch (Exception e) {
			System.out.println("> method1() - [3]");
			return -1;
		} finally { // finally 블럭은 반드시 처리한다.
			System.out.println("> method1() - [4]");
		}
		// return 0;
	} // method1

} // class
