package days25;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 4:29:07
 * @subject p638 TreeSet 컬렉션 클래스
 * @content		Set - HashSet, LinkedHashSet, TreeSet
 * 				1. TreeSet 특징
 * 					1) Set의 특징인 순서유지X, 중복허용X
 * 					2) 이진 검색 트리(binary search tree)를 사용해서 데이터를 저장
 * 					3) 이진 검색 트리로 저장되기 때문에 [정렬, 검색 범위검색] 하는데 성능이 뛰어나다.
 * 					4) 링크드 리스트처럼 노드가 서로 연결된 구조 []--[]--[]--[] / []==[]==[]==[]
 * 					5) 최상위 노드를 "root" 노드, 부모-자식 관계, 형제 노드 관계
 * 					6) class TreeNode{
 * 						TreeNode 왼쪽자식노드;
 * 						Object value;
 * 						TreeNode 오른쪽자식노드;
 * 					  }
 */
public class Ex14 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts); // [1, 4, 5, 7, 9] 
		System.out.println(ts.first());	 // 1 -> 정렬이 되어서 추가가 되기 때문에 first 값이 1
		System.out.println(ts.last());	 // 9 -> 정렬이 되어서 추가가 되기 때문에 last 값이 9
		
		// Set 계열 : 정렬된 Set 계열을 가져온다
		SortedSet<Integer> ss = ts.subSet(1, 7); // 1과 7사이의 값을 가져온다.
		System.out.println(ss);
		
		System.out.println(ts.higher(1)); // 1에서 가장 가까운 큰 값
		System.out.println(ts.floor(3)); // 3이 있으면 3을 반환, 없으면 작은 값을 가진 객체 중에 가장 가까운 값
		System.out.println(ts.ceiling(3)); // 3이 있으면 3을 반환, 없으면 가장 큰 값을 가진 객체 중에 가장 가까운 값 
		

	} // main

} // class
