package days24;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 3:39:53
 * @subject p588 Vector 컬렉션 클래스
 * @content
 * 			Stringbuffer와 StringBuilder 클래스와 차이점 동일
 * 			ArrayList와 Vector 컬렉션 클래스의 차이점 : Vector 컬렉션 클래스는 동기화 처리가 되어져 있다(멀티스레드 안전)
 * 			
 * 			반복자, 열거자 암기하기
 * 	 			반복자(Iterator)
 *				열거자(Enumeration) 
 *				반복자와 열거자의 차이점? [fail-fast]
 *				반복자(Iterator)는 fail-fast : 요소를 읽는 중에 누가 수정을 해버리면 빨리 예외를 발생시킴 -> 다시 읽어오게끔 코딩을 수정하면 됨
 *				열거자(Enumeration) 는 복사해와서 사용하기 때문에 누가 수정을 해도 모름
 */
public class Ex10 {

	public static void main(String[] args) {
		// [Vector 컬렉션 클래스] : ArrayList와 사용방법은 똑같고 차이점은 멀티스레드에 안전하다(동기화 처리되어져 있다.)
		// Collection 인터페이스
		// 	ㄴ List 인터페이스 : 순서유지O, 중복허용O
		// 	ㄴ 구현한 클래스 : ArrayList, Vector(멀티스레드 안전 == 동기화 처리되어져 있다)
		
		// Constructs an empty vector so that its internal data arrayhas size 10 and its standard capacity increment iszero.
		// 아무것도 안주면 초기용량은 10개, 아래처럼 증가치 0을 주어 코딩하는 것은 디폴트 생성자와 같은 의미
		// Vector v = new Vector(10, 0);
		Vector v = new Vector(); // 디폴트
		
		v.addElement("야리니"); // 벡터에 요소를 추가할 거면 add보단 addElement를 사용하는 것이 좋다.
		v.add("조정석");
		
		System.out.println(v.size());		// 안에 채워져 있는 객체의 수 - 0, 요소 추가 후 1개로 변경됨
		System.out.println(v.capacity());	//  용량의 수 - 10
		
		v.trimToSize(); // 객체의 수만큼 남겨두고 나머지 빈공간은 지우겠다.
		System.out.println(v.capacity()); // 2
		
		// v.setSize(6); // null로 채워서 용량(사이즈)을 6개로 수정하겠다. -> 객체의 수를 출력해도 6, 용량을 출력해도 6
		System.out.println(v.capacity()); 	// 6
		System.out.println(v.size()); 		// 6
		System.out.println(v);				// [야리니, 조정석, null, null, null, null]
		//										0요소   1요소  2요소 3요소 ...
		
		// 요소 값을 가져오기
		// get()은 Collection에서 물려받은 메서드, elementAt()은 Vector에서 생성된 메서드
		System.out.println(v.get(0)); // 야리니
		System.out.println(v.elementAt(0)); // 야리니
		
		// v.copyInto(args); // 복사하는 메서드
		
		// Enumeration 열거자 -> Enumeration(열거자)를 통해서 모든 요소를 가져오겠다.
		Enumeration en = v.elements(); // 모든 요소(element)를 반환하는 메서드
		// hasMoreElements() : 남은 요소가 더 있니? 있으면 true, 없으면 false
		// nextElement() : 다음 요소를 가져와서 반환하는 메서드
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println(name);
		}
		
		// 반복자(Iterator)
		// 열거자(Enumeration) 
		// 반복자와 열거자의 차이점? [fail-fast]
		// 반복자(Iterator)는 fail-fast : 요소를 읽는 중에 누가 수정을 해버리면 빨리 예외를 발생시킴 -> 다시 읽어오게끔 코딩을 수정하면 됨
		// 열거자(Enumeration) 는 복사해와서 사용하기 때문에 누가 수정을 해도 모름
		
		// 첫번째 요소를 가져오는 방법 : v.firstElement() == v.get(0) == v.elementAt(0)
		// 마지막 요소를 가져오는 방법 : v.lastElement(); == v.get(v.size()-1) == v.elementAt(v.size()-1)
		
		// 요소 삽입 : v.insertElementAt(요소, 위치(index)); == v.add(요소, 위치(index))
		
		// v.isEmpty(); // 비웠니?
		
		// v.remove(인덱스);
		// v.remone(객체);
		// v.removeElementAt(인덱스);
		// v.removeElement(객체);
		
		// [Object 배열로 받을 수 있는 메서드 toArray()]
		// Object[] m = v.toArray();
		// Object[] toArray() -> String[] 변환
		// String[] n = (String[])v.toArray();

	} // main

} // class
