package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오전 11:41:24
 * @subject 양수 -> 음수, 음수 -> 양수 => 절대값
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		int i = 03;
		// if(i < 0) i = i * -1;
		// 절대치 반환하는 메서드 호출
		i = abs(i);
		// i = Math.abs(i); // 절대치 반환하는 메서드
		System.out.println(i);

	} // main

	// 절대치 반환하는 메서드 선언
	private static int abs(int i) {
		if(i < 0) i = i * -1;
		return i;
	}

} // class
