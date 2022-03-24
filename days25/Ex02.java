package days25;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오전 9:46:20
 * @subject LinkedList 컬렉션 클래스
 * @content 개념
 */
public class Ex02 {

	public static void main(String[] args) {
		// LinkedList 컬렉션 클래스
		// 불연속적 구조
		// 비순차적으로 삭제/추가 (성능좋다)
		// [] -> 하나하나를 요소(Element) == 노드(node)
		// []--[]--[]--[]--[]--[]--[]--[]--[] 단방향 링크드 리스트 : 연결 선이 끊어지면 데이터 손실
		// []==[]==[]==[]==[]==[]==[]==[]==[] 더블형(양방향) 링크드 리스트 : 연결 선이 하나 끊어지더라도 괜찮음
		// ==[]==[]==[]==[]==[]==[]==[]==[]==[]== 더블형 써클(양방향 환형) 링크드 리스트 : 연결 선이 두개가 다 끊어지더라도 맨 처음과 끝이 연결되어있어서 괜찮음
		
		Node node1 = new Node();
		node1.value = 10;
		// node1.next = null; // 다음 값이 없다는 뜻
		
		Node node2 = new Node();
		node2.value = 20;

		Node node3 = new Node();
		node3.value = 30;
		// node3.next = null; // 다음 값이 없다는 뜻
		
		Node node4 = new Node();
		node4.value = 40;
		
		// 다음 노드의 주소를 가지고 오는 작업
		node1.next = node2; // node2의 주소를 node1에 저장
		node2.next = node3; // node3의 주소를 node2에 저장
		node3.next = node4; // node4의 주소를 node3에 저장
		node4.next = null;
		
		Node node = node1; // node에 node1 주소 값을 참조시킴
		
		// 단방향 링크드 리스트 구조
		while (node != null) {
			System.out.println(node.value);
			// node.next; // node1 값이 들어가 있다면 next는 node2 주소가 들어가 있음
			node = node.next;
		} // while
		
	} // main

} // class

class Node{
	int value; // 값
	
	// 다음(next), 이전(prev) 노드의 주소값을 참조변수
	Node next = null;		// 다음 주소 하나만 있으면 단방향
	// Node preb = null;	//이전 주소도 있으면 양방향
} // Node

