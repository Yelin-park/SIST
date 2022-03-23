package days24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 12:40:28
 * @subject p584 ArrayList 컬렉션 클래스
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 컬렉션 프레임워크(JCF)
		// 컬렉션 프레임워크(JCF)의 핵심 인터페이스 : Collection - List, Set / Map
		// 										 	위의 인터페이스 특징 살펴봄
		
		// 컬렉션 클래스
		// 1. ArrayList 컬렉션 클래스 Ex05.java
		ArrayList team1 = new ArrayList();
		team1.add("유재석");
		team1.add("김숙");
		team1.add("도경환");
		team1.add("박지성");
		team1.add("이민기");
		team1.add("정경호");
		
		ArrayList team2 = new ArrayList();
		team2.add("안정환");
		team2.add("김필");
		team2.add("마동석");
		team2.add("박나래");
		team2.add("이효리");
		team2.add("김지민");
		
		// [addAll() 메서드]
		ArrayList class5 = new ArrayList();
		class5.addAll(team1); // team1 명단 전체를 추가
		class5.addAll(team2); // team2 명단 전체를 추가
		System.out.println(class5.toString());
		
		// [removeAll() 메서드]
		// class5.removeAll(team2); // team2 명단 전체를 제거
		System.out.println(class5.toString());
		
		// [retainAll() 메서드]
		// class5.retainAll(team2); // team2 명단을 제외하고 나머지는 제거
		System.out.println(class5.toString());
		
		// 이름을 오름차순으로 정렬 - Collections 클래스의 sort() 메서드 사용
		ArrayList class5Clone = (ArrayList) class5.clone();
		Collections.sort(class5Clone); // [김숙, 김지민, 김필, 도경환, 마동석, 박나래, 박지성, 안정환, 유재석, 이민기, 이효리, 정경호]
		System.out.println(class5Clone);
		
		// [모든 학생 이름을 출력] ***[암기]***
		// Iterator == 반복자 == 반복해서 처리할 수 있는 객체
		Iterator ir = class5.iterator();
		
		// boolean hasNext() : 다음 요소를 가지고 있니? 있으면 true, 없으면 false 
		// next() : 다음 요소를 읽어오는 메서드
		while (ir.hasNext()) {
			String name = (String) ir.next(); // Object -> String 다운 캐스팅
			System.out.println(name);
		} // while
		
		
	} // main

} // class
