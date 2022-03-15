package days18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 4:24:30
 * @subject p387 인터페이스를 이용한 다형성
 * @content 실제 코드로 파악하기
 */
public class Ex14 {

	public static void main(String[] args) {
		/*
		 <E> 제네릭, 지네릭
      	ArrayList<E> 클래스
		ArrayList 클래스
		public class ArrayList
					extends AbstractList
					implements List, RandomAccess, Cloneable, java.io.Serializable
		*/
		// 추상클래스 -  AbstractList
		// 인터페이스 - List, RandomAccess, Cloneable, java.io.Serializable
		
		// List 인터페이스의 부모 인테페이스는 Collection 
		// Collection list = new ArrayList();
		
		// 인터페이스 업캐스팅
		List list = new ArrayList();
		
		disp(list);
		disp(new ArrayList());
		
		//                              인터페이스 다형성
		ArrayList xx = new ArrayList<E>(list);
		
	} // main
	
	//                       인터페이스 매개변수 다형성
	private static void disp(List arrayList) {
		
	}

} // class
