package days09;

import java.util.Random;
// util : 유용한 클래스를 모아둔 곳

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오후 12:02:50
 * @subject 로또 게임 만들기
 * @content [중복체크] 이전에 발생한 로또번호랑 지금 발생한 로또번호가 중복인지 체크

 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 로또 645
		// ㄱ.  (int)(Math.random()*45) +1
		// ㄴ.  rnd.nextInt(45)+1  
		
		// Random 클래스(물건) jdk1.5 부터 생김
		// Returns a pseudorandom, uniformly distributed int valuebetween 0 (inclusive) and the specified value (exclusive)
		// rnd.nextInt(45) : 0 <= ~ < 45 사이에 있는 정수 값을 돌려줌
		Random rnd = new Random();
		
		/*
		// rnd.nextInt(45) + 1를 사용하여 6개의 값 출력
		for (int i = 0; i < 6; i++) {
			System.out.println(rnd.nextInt(45) + 1);
		}
		*/
		
		
		// 배열 선언 후 초기화 X
		// *** 참조형은 초기화 하지 않아도 기본 값으로 초기화 되어져있다.
		// int[] 기본값은 0 이다.
		int[] lotto = new int[6];
		
		// 로또 번호를 랜덤하게 발생시켜서 lotto 배열에 채워넣는 함수(메서드)
		fillLotto(lotto);
		
		int idx = 0;
		// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
		while (idx <= 5) {
			int temp = rnd.nextInt(45) +1;
			
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
				//idx++;
			}
		} //while
		
		// 로또 번호를 호출하는 메서드 > 배열이라는 참조형이 매개변수로 들어가있음 : Call By Reference
		dispLotto(lotto);
		
	} // main
	
	// [생성한 로또번호가 중복이 없는지 체크하는 메서드]
	public static boolean isDuplicateLotto(int[] lotto, int idx, int temp) {
		boolean flag = false;
		for (int i = 0; i < idx; i++) {
			if(temp == lotto[i]) {
				flag = true;
				break;	
			} // if
		} // i for
		return flag;
	}
	
	// [로또 번호 생성하는 메서드]
	// 기능 : 로또 번호를 생성하는 기능
	// 매개변수 : int[] lotto
	// 리턴값(리턴자료형) : void
	private static void fillLotto(int[] lotto) {
		Random rnd = new Random();
		
		int idx = 0;
		// 몇 번만에 배열을 다 채울 수 있는지 모르니까(채워질때까지)while 쓰기
		while (idx <= 5) {
			int temp = rnd.nextInt(45) +1;
			
			if(!isDuplicateLotto(lotto, idx, temp)) {
				lotto[idx++] = temp;
				//idx++;
			}
		} //while
		
		/*  다른 사람이 만든 코드 [O]
		private static void fillLotto(int[] lotto) {
		    Random rnd = new Random();
		    
		     lotto[0] = rnd.nextInt(45)+1; //
		    
		    // 채워넣는 배열의 위치(인덱스, 첨자값)
		    for (int i = 1; i < lotto.length; i++) {          // i =  0 [1] 2 3 4 5
		       
		       lotto[i] = rnd.nextInt(45)+1; //                   *** lotto[0] = 7            lotto[1]= 7

		        // 채워져 있는 배열의 요소 == 중복 체크
		       for (int j = 0; j < 1; j++) { // lotto[0] ~ [i-1] 까지 [i]와 중복 되었나 체크

		          if (lotto[0] == lotto[1]) {
		             System.out.printf("lotto[%d] %d\n", j, lotto[j]); // [디버깅] 중복된 수 확인용
		             System.out.printf("lotto[%d] %d 중복\n \n", i, lotto[i]); // [j]와 [i] 번째에 중복
		             i--; // i 번째 다시 시행 위함
		             break; // 중복 있을경우 i - 1 시키고 안쪽 for문 탈출

		          } // if
		       } // for2
		    } // for1
		
		/*
		// 다른 사람 코드 [O]
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} // if
			} //for
		} // for
		*/
		
		/*
		// 내가 풀다만 코드
		lotto[0] = rnd.nextInt(45) + 1;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
			for (int j = 0; j <= i; j++) {
				if(lotto[i] == lotto[j]) {
					j--;
				} // if
			} // for
		} // for
		*/
		
		/*
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rnd.nextInt(45) + 1;
		}
		*/
	
	} // fillLotto
	
	
	// [생성된 로또 번호 출력하는 메서드]
	private static void dispLotto(int[] lotto) {
		// 배열명.length == 배열의 크기(길이) == 6
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // i for
		System.out.println(); // 개행
	} // dispLotto

} // class
