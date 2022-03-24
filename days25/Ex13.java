package days25;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 4:16:15
 * @subject p637 예제11-25
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(1);a.add(2);a.add(3);a.add(4);a.add(5);
		
		HashSet<Integer> b = new HashSet<Integer>();
		b.add(4);b.add(5);b.add(6);b.add(7);b.add(8);
		
		System.out.println(a); // [1, 2, 3, 4, 5]
		System.out.println(b); // [4, 5, 6, 7, 8]
		
		// 1. a∪b 합집합 : 1,2,3,4,5,6,7,8
		HashSet<Integer> hab = new HashSet<Integer>();
		hab.addAll(a);
		hab.addAll(b);
		System.out.println(hab); // 중복된 데이터가 안들어가져서 합집합 구하기 쉬움
		
		// 2. a∩b 교집합 : 4,5
		HashSet<Integer> kyo = new HashSet<Integer>();
		
		// 3. a-b 차집합 : 1,2,3,6,7,8
		HashSet<Integer> cha = new HashSet<Integer>();
		
		Iterator<Integer> ir = a.iterator();
		while (ir.hasNext()) {
			Integer n = (Integer) ir.next();
			// System.out.println(n);
			if(b.contains(n)) { // b에 a 값이 있니?
				kyo.add(n); // 있으면 교집합에 추가
			} else {
				cha.add(n); // 없으면 차집합에 추가
			}
		} // while
		
		System.out.println(kyo); // [4, 5]
		System.out.println(cha); // [1, 2, 3]
		
	} // main

} // class
