package days21;

import java.util.Arrays;

import com.util.Rnd;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 3:54:24
 * @subject 클래스 라이브러리(com.util.Rnd 클래스와 같은 여러 개 있는 것들을 패키지로 묶은것) => random.jar(확장자)
 * @content 패키지 com.util.Rnd 클래스 + 클래스 + 클래스 
 */
public class Ex10 {

	public static void main(String[] args) {
		int[] m = new int[20];
		m = Rnd.fillRand(m, 5, 10);
		System.out.println(Arrays.toString(m)); // [9, 9, 5, 7, 9, 10, 9, 9, 8, 7, 10, 5, 6, 5, 9, 10, 9, 7, 7, 10]

	} // main

} // class
