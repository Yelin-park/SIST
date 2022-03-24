package days25;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// [문제3] ArrayList list 객체에 임의의 정수( 1~100 ) 까지의 정수  5개를 입력하고
		// 내림차순으로 정렬해서 출력하세요.
		
		ArrayList list = new ArrayList(5);
		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			list.add(rnd.nextInt(100) + 1);
		}
		
		// 정렬 가능한 클래스 객체 생성
		Comparator c = new ListDescendingCom();
		
		// 방법1)
		list.sort(c); // sort는 기본적으로 오름차순 정렬
		System.out.println(list);
		
		// 방법2)
		Collections.sort(list, c);
		System.out.println(list);
		
		// 방법3)
		Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬되어짐
		System.out.println(list);
		
		
		
		// Collections.sort(list, (i,j) -> i-j); // 람다식인데 오류나니까 확인하기
	
		
		// [문제4] java.time 패키지 클래스 사용. (   LocalDateTime )
		//		 1) 설문 시작일 22.3.15 09:00:00
		//		 2) 설문 종료일 22.3.24 09:00:00      
		//		 오늘 현재 설문 가능한여부를 출력하세요.
		
		LocalDateTime start = LocalDateTime.of(2022, 3, 15, 9, 00, 00);
		LocalDateTime end = LocalDateTime.of(2022, 3, 24, 9, 00, 00);
		LocalDateTime today = LocalDateTime.now();
		
		boolean a = today.isAfter(start) && today.isBefore(end);
		System.out.println(a ? "설문조사 가능" : "설문조사 불가능");
		

		
	} // main

} // class

class ListDescendingCom implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}


class ListDescendingCom2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			int i = (int) o1;
			int j = (int) o2;
			return j - i; // i 값이 크면 양수, 작으면 음수
			// i,j 순서를 바꿔도 되고 -1 곱해도 내림차순이 된다.
		}
		return 0;
	}
	
}

/*
[문제1] 용어 설명
ㄱ. 컬렉션 프레임워크 ( JCF ) ?
	데이터 집합(군)을 관리할 수 있는 클래스를 표준화하여 설계한 것

ㄴ. 프레임워크 ?  표준화시킨 체계
ㄷ. 컬렉션 ?  모음집
ㄹ. 컬렉션 클래스 ? 컬렉션 프레임워크의 핵심 인터페이스를 구현한 클래스

[문제2]  컬렉션 프레임워크의 핵심 인터페이스와 특징.
	List : 순서유지O, 중복허용O 
	Set : 순서유지X, 중복허용X
	Map : Key와 value 한쌍(엔트리(entry), 순서유지X, Key는 중복허용X, value는 중복허용O
	
[문제3] 
ArrayList list 객체에 임의의 정수( 1~100 ) 까지의 정수  5개를 입력하고
내림차순으로 정렬해서 출력하세요. 

[문제4]
java.time 패키지 클래스 사용. (   LocalDateTime )

 1) 설문 시작일 22.3.15 09:00:00
 2) 설문 종료일 22.3.24 09:00:00      
 오늘 현재 설문 가능한여부를 출력하세요.
*/