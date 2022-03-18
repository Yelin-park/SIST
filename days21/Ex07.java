package days21;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import days20.MyPoint;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 2:22:38
 * @subject p496 java.util 패키지 안에 있는 클래스
 * @content		- 유용한(자주 사용되는) 클래스
 * 					1) Objects 클래스 : Object를 다룰 때 자주 쓰는 클래스
 * 					2) Arrays 클래스 : 배열을 다루는 기능이 구현된 클래스
 */
public class Ex07 {

	public static void main(String[] args) {
		
		
		// 2) [Arrays 클래스]
		// int[] m = {3,5,2,4,1};
		Integer[] m = {3,5,2,4,1}; // Collections.reverseOrder()로 내림차순 사용하기 위해서 래퍼클래스 배열로 변경
		
		// 1. Arrays.toString() - 배열 출력
		System.out.println(Arrays.toString(m)); // [3, 5, 2, 4, 1]
		
		// 2.Arrays.fill() - 배열의 모든 요소를 n 값으로 초기화
		// Arrays.fill(m, 100);
		System.out.println(Arrays.toString(m)); // [100, 100, 100, 100, 100]
		
		// 3.Arrays.binarySearch(배열명, 값) - 배열 안에 원하는 값이 있는지 검색하여 인덱스 값을 반환하는 메서드, 없으면 -1이 나옴
		System.out.println(Arrays.binarySearch(m, 4)); // -1 -> Arrays.fill(m, 100); 코딩 주석처리하면 3이 나옴
		
		// 4. Arrays.sort() - 오름차순정렬
		Arrays.sort(m);
		System.out.println(Arrays.toString(m)); //[1, 2, 3, 4, 5]
		
		// [문제] 내림차순(desc)으로 정렬하세요.
		// 래퍼클래스로 변경한 뒤 Collections.reverseOrder() 메서드 사용
		Arrays.sort(m, Collections.reverseOrder());
		System.out.println(Arrays.toString(m)); //[5, 4, 3, 2, 1]
		
		
		// 1) [Object 클래스]
		MyPoint p1 = null;
		MyPoint p2 = null; // new MyPoint(1,2);
		// MyPoint p2 = new MyPoint(1,2); 
		test(p1);
		test(p1, p2);
		
	} // main

	private static void test(MyPoint p1, MyPoint p2) {
		// p1 객체와 p2 객체가 같냐? -> 둘 다 null 일 때는 제외하고자 할 때
		// if( p1 != null && p1.equals(p2) ) { // 한 객체만 null이 아닌지만 확인하고 두 개의 값일 같을 때 나머지 다른 하나도 null이 아닐 것
		if(Objects.equals(p1, p2)) {
			
		} // if
		
	} // test

	private static void test(MyPoint p) {
		// 매개변수인 p가 null인지 아닌지 체크를 한 후에 null이 아닐때만 syso 코딩을 해야한다. -> 3가지 방법이 있음
		// if(p != null) {  **** 이걸 더 많이 사용함
		// if(!Objects.isNull(p)) { 널이니? 체크하는 코딩
		if(Objects.nonNull(p)) { // 널이 아니니?
			System.out.println(p.getX()); // java.lang.NullPointerException 예외 발생
		} // if
		
	} // test
	

} // class
