package days25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 2:48:22
 * @subject days13.Ex09.java
 * @content
 * 			[문제] 로또번호가 오름차순 정렬
 * 					순서가 유지 안되는 LinkedHashSet을 사용했는데 이것을 정렬을 하고 싶으면 어떻게 해야할까??
 * 					Set -> List 변환 후 하면 될 거 같다....
 */
public class Ex10_03 {

	public static void main(String[] args) {
		// 컬렉션 클래스를 사용해서 2차원배열 코딩을 수정
		// 1. 게임 회수 입력? 3
		// 1 로또번호 : [11][6][10][40][41][36]
		// 2 로또번호 : [11][6][10][40][41][36]
		// 3 로또번호 : [11][6][10][40][41][36]
		
		int gameNumber = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 회수 입력하세요?");
		
		gameNumber = sc.nextInt();
		
		// ArrayList는 게임 횟수 만큼 만들고 그 안에 로또번호는 LinkedHashSet으로 넣겠다.
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<LinkedHashSet<Integer>>(gameNumber);
		
		LinkedHashSet<Integer> lotto = null; // 로또 한게임의 번호를 받는 LinkedHashSet 만들고 일단 null로 선언
		for (int i = 0; i < gameNumber; i++) { // 입력 받은 게임횟수 만큼
			 lotto = new LinkedHashSet<Integer>(); // 하나의 LinkedHashSet을 생성
			 Ex10_02.fillLotto(lotto); // 하나의 로또 번호를 만드는 매서드 사용
			 lottos.add(lotto); // 1게임 로또 번호를 lottos ArrayList에 담기
		}
		
		for (int i = 0; i < gameNumber; i++) {
			// lotto = lottos.get(i); // ArrayList에 있는 로또 1게임을 가져와 lotto LinkedHashSet에 담고
			// Ex10_02.dispLotto(lotto); // 출력하는 메서드로 로또 한 게임을 출력하기
			Ex10_02.dispLotto(lottos.get(i)); // 위의 코딩 한줄코딩
		}

	} // main
	
/*
	private static void fillLottos(HashSet[] lottos) {
		Random rnd = new Random();
		int gameNumber = lottos.length;
		HashSet<Integer> lotto = new LinkedHashSet<Integer>();
		for (int i = 0; i < gameNumber; i++) {
			lottos[i] = new LinkedHashSet<Integer>();
			while(lotto.size() < 6 ) {
				lotto.add(rnd.nextInt(45) + 1);
			} // while
			lottos[i].add(lotto);
		} // for i
		
	} // fillLottos

	private static void dipsLottos(HashSet[] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			Iterator ir = lottos[i].iterator();
			while (ir.hasNext()) {
				HashSet num = (HashSet) ir.next();
				System.out.printf("[%d]",num);
			} // while
		}

	} // dipsLottos
*/	
} // class
