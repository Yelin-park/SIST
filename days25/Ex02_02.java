package days25;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 10:14:10
 * @subject LinkedList 컬렉션 클래스
 * @content 사용 예제
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 특징 : 순서유지O, 중복허용O
		// 비순차적 삽입/삭제 작업할 때 성능 우수
		LinkedList list = new LinkedList(); // 디폴트 생성자는 아무 것도 없음, 필요할 때마다 노드를 추가
		
		// 추가하기
		// list.addLast(); // 맨 마지막 노드에 추가
		list.add("야리니");
		list.add("이동욱");
		list.add("공유");
		System.out.println(list); // [야리니, 이동욱, 공유]
		
		list.addFirst("김서형"); // 맨 처음 노드에 추가
		// list.add(0, "김서형"); // 위와 같은 코딩
		System.out.println(list); // [김서형, 야리니, 이동욱, 공유]

		list.add(3, "김고은"); // 중간에 삽입 -> 성능 우수
		System.out.println(list); // [김서형, 야리니, 이동욱, 김고은, 공유]
		
		// 노드 값 가져오기
		list.get(3);
		list.getFirst(); // == list.get(0);
		list.getLast(); // == list.get(list.size()-1);
		
		// 제거하기
		// list.remove(1); // index를 직접 줘도 되고,
		list.remove("야리니"); // Object o를 줘도 됨
		System.out.println(list); // [김서형, 이동욱, 김고은, 공유]
		
		System.out.println(list.size()); // 노드(요소)의 갯수
		
		// 반복자(iterator) 출력
		// Iterator ir = list.descendingIterator(); // 내림차순 반복처리 == 뒤에서부터 읽어와서 처리하겠다.
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		} // while
		
		// p599 메서드 정리 - 큐(Queue) 설명할 때 다시 다룰 예정
		// 아래 5개 제외하고는 동일하다.
		// element()
		// offer()
		// peek()
		// poll()
		// remove()
		
		
	} // main

} // class
