package days24;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오전 11:17:25
 * @subject p584 ArrayList 컬렉션 클래스
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [ArrayList 컬렉션 클래스]
		// 1. 가장 많이 사용되는 컬렉션 클래스
		// 2. List 인터페이스를 구현한 클래스
		// 3. 특징 : 순서유지O, 중복허용O
		
		// 배열(array)의 단점
		// 1. 배열 크기 자동 증가 X -> 크기만큼 값을 넣을 수 있고, 더 집어넣을 수 없음
		// 2. 배열안에 값을 삽입(insert) X -> 배열 크기 증가 + 뒤로 미는(쉬프트) 작업 + 값 저장(할당)
		// 3. 삭제(remove) X
		// 4. 등등(추가, 변경, 삭제 등등 불편) 불편
		// int[] m = new int [3];
		
		// <E> == Element : 지네릭스(generics), 제네릭 -> Chapter12 배울 때 다시
		// ArrayList list = new ArrayList(); // 초기 용량은 10개
		ArrayList list = new ArrayList(3); // 용량 3개 지정
		
		// [요소(Element) 추가]
		list.add(100); // int -> (오토박싱) -> Integer -> (업캐스팅) -> Object
		list.add(200);
		list.add(300);
		
		list.add(400); // 초기 용량 3개보다 더 많은 갯수 -> 자동으로 크기가 증가 된다.(배열보다 편리)
		
		System.out.println(list.size()); // 저장된 객체 갯수 반환하는 메서드 size() - 용량이 아니라 추가된 값의 갯수를 반환
		
		// [요소(element) 출력하는 작업 : get() 매서드 이용 -> dispList() 메서드 구현]
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		
		// 1번째 위치(index)에 500 값을 [삽입]
		list.add(1, 500);
		
		// [500 값을 삭제(제거)]
		// 수정 또는 삭제를 하려면 먼저 수정, 삭제하려는 값이 있는지 유무 확인 -> [검색 작업 우선!!]
		
		// System.out.println(list.contains(500) ? "있다" : "없다");
		// contains() 메서드는 boolean 형으로 돌려줌 -> 몇 번째 위치(index) 값을 알아야 수정, 삭제 가능
		
		System.out.println(list.indexOf(500)); // 찾으면 찾은 index 값을 돌려주고, 없으면 -1 돌려줌
		int findIndex = list.indexOf(500);
		
		if (findIndex == -1) { // 찾는 값이 없다.
			System.out.println("arraylist에서 찾는 값(객체)은 없습니다.");
			return; // 프로그램 종료
		} else { // 찾는 값이 있다. -> 제거 작업하기
			list.remove(findIndex); // int indext
			// list.remove((Number)500); // Object o
			// list.remove(new Integer(500)); // Object o
		}
		
		// [모든 요소를 삭제]
		// list.clear();
		
		// [문제] 300을 찾아서 있으면 3으로 수정, 없으면 300 추가
		int fIdx = list.indexOf(300);
		if(fIdx != -1) { // 있으면
			// list.remove(findIndex);
			// list.add(findIndex, new Integer(3));
			list.set(fIdx, 3);
		} else { // 없으면
			list.add(new Integer(300));
		}
		
		dispList(list);
		System.out.println(list.toString()); // [100, 200, 3, 400]  Arrays.toString(m);
		
		// [문제] list에서 200보다 같거나 큰 요소는 삭제
		// Chapter14 람다와 스트림		[수업X]   -> 개별적으로 꼭 공부하기
		list.removeIf(  (t) -> Integer.parseInt(t.toString()) >= 200   ); // 아래 코딩을 람다로 하면 이렇게 된다.
		
		// 익명클래스 사용
		list.removeIf( // true가 반환되면 삭제
			// 익명클래스 형식  new 인터페이스(){} / new 부모클래스(){}
			// <T> == Type
			new Predicate() { // == 익명클래스
				@Override
				public boolean test(Object t) { // t는 요소
					return Integer.parseInt(t.toString()) >= 200; // t를 문자열로 받아서 int로 변환 후 200보다 크거나 같으면 true 반환 
				}
			}
		);
		
		
		
		// 강사님 풀이
		int size = list.size(); // list size 변수 선언
		for (int j = size-1; j >= 0; j--) { 		
			if( (int)list.get(j) >= 200) { // int로도 형변환 가능
				list.remove(j);
			}
		}
		
		for (int i = 0; i < list.size(); i++) { // 자동으로 사이즈 줄게 하는 코딩
			if( (int)list.get(i) >= 200) { // int로도 형변환 가능
				list.remove(i);
				i--;
			}
		}
		
		System.out.println(list.toString()); // [100, 3]
		
		
	} // main
	
	private static void dispList(ArrayList list) {
		int listSize = list.size(); // 변수를 선언해서 넣는 것이 좋음
		// for (int i = 0; i < list.size(); i++) { // 돌 때 마다 메서드 호출하기 때문에..
		for(int i = 0; i < listSize; i++) {
			System.out.println(list.get(i));
		}
	}

} // class
