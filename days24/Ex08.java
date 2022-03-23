package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 3:28:26
 * @subject String[] -> ArrayList 변환
 * @content 	ArrayList list = new ArrayList(Arrays.asList(String 배열명));
 * 				Arrays.asList() 사용하면된다~~
 */
public class Ex08 {

	public static void main(String[] args) {
		// (기억)
		// String[] -> ArrayList 변환
		String[] names = {"야리니", "이민기", "정경호", "마동석", "김숙"};
		// 방법1)
		
		ArrayList list1 = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list1.add(names[i]);
		}
		System.out.println(list1);
		
		// 방법2) 이렇게 사용!!!
		// List a = Arrays.asList(names);
		// ArrayList list = new ArrayList(a);
		ArrayList list2 = new ArrayList(Arrays.asList(names)); // 위에 두줄 코딩 하나로!
		System.out.println(list2);
		
	} // main

} // class
