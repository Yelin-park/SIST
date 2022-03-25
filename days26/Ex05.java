package days26;

import java.util.TreeMap;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 2:02:43
 * @subject p651~ 해싱과 해시함수, TreeMap 
 * @content		
 * 			p651 해싱과 해시함수
 * 				해싱 ? 해시함수를 이용해서 데이터를 해시테이블에 저장하고 검색하는 기법
 * 				해시 함수? 데이터가 저장되어 있는 곳을 알려주는 함수 -> 알려주기 때문에 대량의 데이터 중에서 원하는 데이터를 빠르게 찾을 수 있다. 
 * 
 * 			 p654 TreeMap
 * 				1. Map -> Key + Value 한쌍인 엔트리(entry) 구조로 데이터 저장, 관리
 * 				2. Tree -> 검색, 정렬, 범위검색 할 때 성능이 빠르다.
 * 
 * 			p656 예제 11-34 주말에 해보기
 */
public class Ex05 {

	public static void main(String[] args) {
		// [TreeMap 기본 설명]
		// SortedMap : Map + 정렬된 기능 => 데이터를 넣으면 자동으로 정렬 되어짐
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		// key와 value 값 추가하는 메서드
		// tm.put(key, value);
		
		// key 값을 가져오는 메서드
		// tm.get(key);
		
		// 첫번째 entry를 가져오는 메서드
		// tm.pollFirstEntry();
		
		// tm.ceilingKey(null);
		// tm.ceilingEntry(null);
		
		// tm.floorKey(null);
		// tm.floorEntry(null);
		
		// tm.firstEntry();
		// tm.firstKey();
		
		// tm.subMap(null, null); // == subSet과 동일한 메서드

	} // main

} // class
