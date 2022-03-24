package days25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 2:30:14
 * @subject HashSet과 LinkedHashSet 사용하기
 * @content		HashSet : 순서유지X, 중복허용X(ex. 로또번호 중복체크 할 필요없이 번호 추가할 수 있음)
 * 				LinkedHashSet : 순서유지O, 중복허용X (ex. 로또번호 발생한대로 추가하고 싶을 때 사용)
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// 로또 게임 1게임만 - days09.Ex04_02.java
		// 순서 유지X, 중복 유지X -> 중복되는 로또 번호 안들어가지니까 중복체크를 따로 할 필요가 없음
		// HashSet<Integer> lotto = new HashSet<Integer>();
		// 로또 번호가 발생하는 순서대로 추가하고 싶으면 LinkedHashSet 사용!(순서 유지O, 중복 허용 X)
		HashSet<Integer> lotto = new LinkedHashSet<Integer>(); // LinkedHashSet은 HashSet의 자식
		fillLotto(lotto);
		dispLotto(lotto);
		
	} // main
	
	// [생성된 로또 번호 출력하는 메서드]
	public static void dispLotto(HashSet<Integer> lotto) {
		// iterator 반복자 사용
		Iterator<Integer> ir = lotto.iterator();
		while (ir.hasNext()) {
			Integer num = (Integer) ir.next();
			System.out.printf("[%d]",num);
		} // while
		System.out.println();
		
	} // dispLotto

	// [로또 번호 생성하는 메서드]
	public static void fillLotto(HashSet<Integer> lotto) {
		// 중복체크할 필요없이 숫자 6개만 HashSet에 채워넣는 코딩
		Random rnd = new Random();
		while (lotto.size() < 6) {
			// lotto.add(rnd.nextInt(45) + 1);
			// 아래 코딩은 숫자가 발생한 걸 확인하기 위해서 수정
			int n = rnd.nextInt(45) + 1;
			System.out.println(n);
			lotto.add(n);
		} // while
		
	} // fillLotto

} // class
