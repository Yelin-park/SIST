package days25;

import java.util.Stack;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 10:51:39
 * @subject p605 Stack(스택)
 * @content
 * 		 Stack 
 * 			ex) 우유 -> 마지막에 들어온거 먼저 처리(먼저 들어온 거 나중에 처리)
 * 		
 * 		Queue
 * 			ex) 주문 -> 먼저 들어온 주문 먼저 처리
 * 			대기열(큐) -> 메시지 대기열(큐) -> 메시지 큐
 * 	=====================================================================================================================
 * 			- empty() 메서드 : 비워져 있는지 확인하는 메서드
 * 			- push() 메서드 : 요소를 추가하는 메서드
 * 			- pop() 메서드 : 스택에서 요소를 가져온 뒤 제거하는 메서드
 * 			- peek() 메서드 : 스택에서 요소를 가져와 읽기만 하는 메서드
 * 			- search() 메서드 : 요소 값의 인덱스 위치를 찾는 메서드 -> 수정, 삭제할 때 사용
 */
public class Ex03_02 {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		// s.add(s); // add 메서드 사용 X !!
		// add 메서드가 있는 이유 : Vector 클래스를 물려받았고 Vector는 List, List는 Collection 물려받아서
		// 상속계층도 : Collection <- List <- Vector <- Stack
		// push() 메서드로 추가
		s.push("정경호");
		s.push("유연석");
		s.push("익순이");
		
		String name = (String) s.peek();
		System.out.println(name); // 익순이
		
		name = (String) s.peek(); 
		System.out.println(name); // 익순이
		
		System.out.println(s.empty());		// empty() : Stack 안에 아무것도 없니? -> false => Stack에서 생성된 메서드
		System.out.println(s.isEmpty());	// isEmpty() : Stack 안에 아무것도 없니? -> false => Vector에서 생성된 메서드
		
		
		// s.get(s.size()-1); // 가장 마지막 요소를 가져오는 방법인데 아래 메서드 사용하자
		String name2 = (String) s.pop(); // 가장 마지막 요소를 가져오는 메서드
		System.out.println(name2); // 익순이
		
		name2 = (String) s.pop(); // 하나 꺼내오고 나서 다시 마지막 요소 꺼내오기
		System.out.println(name2); // 유연석
		
		
		// Stack이 비워질 때 까지 요소를 가져오기 - 마지막 요소부터
		String sName;
		while (!s.empty()) {
			sName = (String) s.pop();
			System.out.println(sName);
		}
		
		// iterator() 반복자는 스택(Stack)에서 사용하면 안된다. -> Stack은 막혀있는 구조라서..
		
		int idx = s.search("익순이"); // 요소의 인덱스(위치)값을 찾는 메서드
		System.out.println(idx);
		

	} // main

} // class
