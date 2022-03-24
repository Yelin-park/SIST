package days25;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 11:30:13
 * @subject	 p612 PriorityQueue 클래스 => Priority(우선권) + 큐(FIFO)
 * @content		List 인터페이스 - ArrayList(순서유지,중복허용O), Vector(멀티 스레드 안전), LinkedList(비순차적, 삽입삭제 성능우수), Stack(LIFO), Queue(FIFO)
 * 				p606 예제11-8 : 직접 본인이 Stack 클래스를 구현해 보자
 * 				p610 예제11-10 수업 종료 후 코딩
 * =======================================================================================================================================================
 * 		- PriorityQueue 클래스 특징 : 저장한 순서에 상관없이 [우선 순위가 높은 것부터] 꺼내온다.
 * 									Queue의 특징은 없고 우선 순위가 높은 것 부터 꺼내오는 것이 특징!
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		// <Integer> == 컬렉션 클래스 안에 Integer 값을 저장하겠다. 
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		// System.out.println(q); // [1, 2, 3, 5, 4] -> 순서는 신경 쓰지 않아도됨
		
		// 문자열인 경우 :  ㄱ이 제일 높고 ㅎ이 제일 낮다.
		// 숫자인 경우에는 오름차순 정렬해서 가져온다.
		// 숫자 1 -> 우선권이 제일 높다.
		// 숫자 5 -> 우선권이 제일 낮다.
		while (!q.isEmpty()) {
			int n = q.poll();
			System.out.println(n); // 1 2 3 4 5
		}
		
	} // main

} // class
