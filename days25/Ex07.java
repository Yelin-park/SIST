package days25;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 12:05:34
 * @subject p614 Iterator, ListIterator, Enumeration
 * @content		인터페이스 - 컬렉션에 저장된 요소를 접근(가져오기)하는데 사용
 * 				Enumeration은 Iterator의 구버전 == 구버전의 반복자
 * 				Iterator == 반복자, fail-fast(읽어오다가 수정한다고 판단되면 예외 발생)
 * 				ListIterator는 Iterator의 기능을 향상시킨 것
 * 
 * 				Iterator 반복자 - 단방향(뒤로 돌아가서 다시 읽을 수 없음)
 * 				(향상된 기능) ListIterator - 뒤로 돌아가서 다시 읽을 수 있음
 * 							previous() 메서드를 사용하여
 */
public class Ex07 {

	public static void main(String[] args) {
		// <String>을 안주면 숫자, 문자열, 문자, 불린, 실수 다 담을 수 있음
		// <String>을 주면 String만 담을 수 있다.
		Vector<String> list = new Vector<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		// 1. Enumeration 열거자 사용
		Enumeration<String> en = list.elements();
		while (en.hasMoreElements()) {
			String str1 = (String) en.nextElement();
			System.out.println(str1);
		} 
		System.out.println("==============================");
		
		// 2. Iterator 반복자 사용 : 스레드를 사용해야 중간에 수정했을 때 예외가 발생하는 것을 확인할 수 있음 -> 스레드 배울 때 다시!
		//		단방향(뒤로 돌아가서 다시 읽을 수 없음)
		Iterator<String> ir1 = list.iterator();
		while (ir1.hasNext()) {
			String str2 = (String) ir1.next();
			System.out.println(str2);
		}
		System.out.println("==============================");
		
		// 3. ListIterator 사용 : 뒤로 돌아가서 다시 읽을 수 있음
		ListIterator<String> ir2 = list.listIterator();
		while (ir2.hasNext()) {
			String str2 = (String) ir2.next();
			System.out.println(str2);
		}
		
		// System.out.println(ir2.previous()); // E
		// System.out.println(ir2.previous()); // D
		// System.out.println(ir2.previous()); // C
		
		System.out.println("==============================");
		while (ir2.hasPrevious()) { // 이전에 읽을 값이 있니?
			String str3 = (String) ir2.previous(); // 있으면 뒤에 있는 값을 읽어와라
			System.out.println(str3);
		}
		
	} // main

} // class
