package days25;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 11:19:22
 * @subject p605 큐(Queue)
 * @content
 * 			1. Queue는 인터페이스 -> 구현한 클래스 -> LinkedList
 * 				Deque 인터페이스의 조상은 Queue 인터페이스
 * 				LinkedList implements List, Deque
 * 				인터페이스 업캐스팅(가능)
 * 			
 * 			2. FIFO 구조
 * 
 * 			- add() 메서드 : 요소 추가 실패시 예외 발생
 * 			- offer() 메서드 : 요소 추가 실패시 false (성공시 true)
 * 			- remove() 메서드 : 요소 값을 가져온 뒤 제거하는 메서드, 예외 발생
 * 			- poll() 메서드 : 요소 값을 가져온 뒤 제거하는 메서드, 요소가 없을 시 null 반환
 * 			- peek() 메서드 : 요소 값을 가져오는 메서드(제거X)
 */
public class Ex04 {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		// q.add(q); // add 메서드도 있다.
		// add() 메서드 : 추가 실패시 예외 발생
		// offer() 메서드 : 추가 실패시 false 반환
		q.offer("청하");
		q.offer("이병헌");
		q.offer("전지현");
		System.out.println(q.size());
		
		// 끄집어 올 때는 poll을 많이 사용 - 요소를 가져온 뒤 제거
		String name = (String) q.poll();
		System.out.println(name); // 청하
		name = (String) q.poll();
		System.out.println(name); // 이병헌
		name = (String) q.poll();
		System.out.println(name); // 전지현
		name = (String) q.poll();
		System.out.println(name); // 요소가 없을 때는 null 반환
		
		System.out.println("==================================================");
		
		Queue q1 = new LinkedList();
		q1.offer("청하");
		q1.offer("이병헌");
		q1.offer("전지현");
		System.out.println(q1.size()); // 3
		
		// 요소 가져오기(가져온 뒤 제거 X) - peek()
		String name2 = (String)q1.peek();
		System.out.println(name2); // 청하
		name2 = (String)q1.peek();
		System.out.println(name2); // 청하
		name2 = (String)q1.peek();
		System.out.println(name2); // 청하
		
		// remove() - 요소를 가져온 뒤 제거, 없을 시 예외 발생
		String sName = (String) q1.remove();
		System.out.println(sName); // 청하
		sName = (String) q1.remove();
		System.out.println(sName); // 이병헌
		sName = (String) q1.remove();
		System.out.println(sName); // 전지현
		sName = (String) q1.remove();
		System.out.println(sName); // java.util.NoSuchElementException
		
		Queue q3 = new LinkedList();
		q3.offer("청하");
		q3.offer("이병헌");
		q3.offer("전지현");
		
		String name3;
		while (!q3.isEmpty()) {
			name3 = (String) q3.poll();
			System.out.println(name3);
		}
		/*
		 * <결과>
		 	청하
			이병헌
			전지현
		 */

	} // main

} // class
