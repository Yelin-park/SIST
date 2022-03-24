package days25;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 11:44:59
 * @subject p613 Deque([D]ouble-[E]nded [Que]ue)
 * @content		특징 : 양쪽 끝(Double-Ended)에서 추가/추출이 가능하다.
 * 				Queue <- Deque
 * 				Deque 구현한 클래스 : LinkedList, ArrayDeque
 * 
 * 				- offerLast : 끝에서 저장
 * 				- offerFisrt : 앞에서 저장
 * 				- pollLast : 끝에서 꺼내온 뒤 삭제
 * 				- pollFisrt : 앞에서 꺼내온 뒤 삭제
 */
public class Ex06 {

	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		
		// dq.offerFirst(null); // 앞에서 집어넣기
		// dq.offerLast(null);	// 뒤에서 집어넣기
		// dq.pollFirst(); // 앞에서 빼온 뒤 제거하기
		// dq.pollLast(); // 뒤에서 빼온 뒤 제거하기
		
		
		
		

	} // main

} // class
