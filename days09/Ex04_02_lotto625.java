package days09;

import java.util.Random;
// util : 유용한 클래스를 모아둔 곳

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 12:02:50
 * @subject 로또 게임 만들기
 * @content [중복체크] 이전에 발생한 로또번호랑 지금 발생한 로또번호가 중복인지 체크

 */
public class Ex04_02_lotto625 {

	public static void main(String[] args) {
		// 로또 645
		
		int[] lotto = new int[6];
		
		// 로또 번호를 랜덤하게 발생시켜서 lotto 배열에 채워넣는 함수(메서드)
		fillLotto(lotto);
		
		// 로또 번호를 호출하는 메서드
		dispLotto(lotto);

	} // main
	
	// 2 [중복 체크하는 메서드]
	public static boolean isDuplicateLotto(int[] lotto, int idx, int temp) {
		boolean flag = false;
		for (int i = 0; i < idx; i++) { 
			if(temp == lotto[i]) { // 중복이냐 아니냐
				flag = true;      // 중복이면 true
				break;	
			} // if
		} // i for
		return flag;
	} // is 메서드
	
	// 3 [로또 번호 생성하는 메서드]
	private static void fillLotto(int[] lotto) {
		Random rnd = new Random();
		
		int idx = 0;
		// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
		while (idx <= 5) { // lotto[0]은 중복 검사 안해도 되서 <= 5로 설정
			int temp = rnd.nextInt(45) +1;
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
				// idx++
			}
		} //while
		
	} // fillLotto
	
	
	// 1 [생성된 로또 번호 출력하는 메서드]
	private static void dispLotto(int[] lotto) {
		// 배열명.length == 배열의 크기(길이) == 6
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // i for
		System.out.println(); // 개행
	} // dispLotto

} // class
