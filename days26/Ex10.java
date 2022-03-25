package days26;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 3:49:40
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		// Object 타입의 ArrayList
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("str");
		list.add(true);
		
		int n = (int) list.get(0);
		String s = (String) list.get(1);
		boolean b = (boolean) list.get(3);
		*/
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		// list.add(100); // 객체 타입의 안정성 -> String이 아닌 타입을 넣으려고 하면 에러 발생
		
		Iterator<String> ir = list.iterator(); // 인터페이스도 제네릭 인터페이스, String
		while (ir.hasNext()) {
			String s = (String) ir.next(); // 자동적으로 String, 형변환 번거로움이 줄어듬 -> 코드 간결
			System.out.println(s);
		}

	} // main

} // class
