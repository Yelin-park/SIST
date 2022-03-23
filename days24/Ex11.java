package days24;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 4:22:58
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// <E> 삭제
		List list = new ArrayList(); // 중복허용O
		list.add("한효주");
		list.add("박민영");
		list.add("송강");
		list.add("한효주"); // 중복
		
		System.out.println(list);
		
		// 한효주라는 요소를 찾는다.
		int findIdx = list.indexOf("한효주"); // 첫번째 검색된 요소의 인덱스만 반환
		System.out.println(findIdx);
		
		// 중복된 값의 인덱스를 모두 찾아서 출력 -> 직접 구현을 해야함
		ArrayList findList = myIndexOf(list, "한효주"); 
		System.out.println(findList);
		
	} // main

	private static ArrayList myIndexOf(List list, String name) {
		ArrayList findList = new ArrayList(); // 몇 개를 찾을지 모르기 때문에 ArrayList로 받기
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(name)) findList.add(i);
		} // for
		return findList;
	}

} // class
