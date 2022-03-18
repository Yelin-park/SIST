package days21;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 2:56:45
 * @subject p500 Random 클래스
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// 종자값을 주어진 값(seed)로 변경한다.
		long seed = System.nanoTime(); 
		Random rnd = new Random(seed); // 기본 값을 안주면 long seed(무작위 숫자) 나노시간으로 long형을 준다.
		
		// 0 <= 임의의값(난수) < bound
		int bound = 101;
		rnd.nextInt(bound); // 0~정수~100
		
		rnd.nextBoolean(); // 임의의 true/fasle 돌려줌(무작위)
		
		rnd.nextInt(); // -21억~21억 사이의 숫자를 임의로 돌려줌
		
		// rnd.nextBytes(byte[]); 
		
	} // main

} // class
