package days25;

import java.util.HashSet;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 12:45:43
 * @subject p631 Set - HashSet
 * @content
 * 			<Ex01 ~ Ex09>
 * 			List - ArrayList, Vector, LinkedList, Stack, Queue, Deque, PriorityQueue
 * 			Iterator, Enumeration, ListIterator
 * 			Comparable, Comparator
 * =============================================================================================================
 * 			1. List에서 가장 많이 쓰는 건 ArrayList이고, [Set 인터페이스를 구현한 컬렉션 클래스 중 가장 많이 쓰는 것이 HashSet 이다.]
 * 			2. Set 특징 : 순서유지X, 중복유지X -> HashSet 동일
 */
public class Ex10 {

	public static void main(String[] args) {
		// Unresolved compilation problem: Syntax error, insert "Dimensions" to complete ReferenceType
		// 해석 : 문법적으로 자료형을 넣을 수 있는 건 참조형이다. 기본형은 안되고, 참조형을 집어넣어라
		// HashSet<int> hs = new HashSet<int>();
		//<? extends Integer> 무슨 의미? 제네릭스 수업 후 알게 될 예정~
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println(hs.add(9)); // true
		System.out.println(hs.add(1)); // true
		System.out.println(hs.add(15)); // true
		System.out.println(hs.add(20)); // true
		System.out.println(hs.add(15)); // false -> 중복된 요소 값은 추가되지 않는다.
		
		// Set : 요소 추가한대로 순서 유지X
		System.out.println(hs); //[1, 20, 9, 15] -> 규칙이 없다.
		
		// hs.get(index) 메서드 X -> 순서가 없기 때문에 가져올 수 없음
		// hs.remove(index) 메서드 X -> 순서가 없기 때문에 삭제할 수 없음
		hs.remove(20); // 삭제를 하기 위해서는 Object를 매개변수로 넣어야 한다.
		System.out.println(hs); // [1, 9, 15]
		
		// hs.forEach(->);
		
		// hs.iterator() 반복 처리 가능
		
	} // main

} // class
