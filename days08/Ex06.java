package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 4:58:48
 * @subject 재귀호출(recursive call) p270
 *          == 재귀함수 == 재귀호출함수
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 재귀 호출 함수란? 메서드 안에서 자기 자신을 다시 호출하는 것을 "재귀 호출"이라고 하고, 재귀 호출을 하는 함수를 재귀 호출 함수라고 한다.
		disp(); // 메서드 호출 부분

	}

	// 재귀 호출
	// 재귀 호출 메서드(함수) -> 아래 disp() 메서드는 무한루프에 빠짐
	private static void disp() {
		System.out.println("disp() 메서드가 호출된다.");
		disp(); // 메서드 호출 부분
	}

}
