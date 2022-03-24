package days25;

import java.util.HashSet;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 3:50:39
 * @subject p634~p636 예제
 * @content p634 예제11-24
 */
public class Ex12 {

	public static void main(String[] args) {
		// Person hashCode 메서드 오버라이딩 테스트
		System.out.println(("홍길동" + 25).hashCode()); // 498603633
		
		// Ex09.java - Person
		HashSet<Person> hs = new HashSet<Person>();
		Person p1 = new Person("야리니", 24);
		System.out.println(p1.hashCode()); // 366712642
		hs.add(p1);
		Person p2 = new Person("정은지", 26);
		hs.add(p2);
		
		// hashCode와 equals 메서드 오버라이딩 후 p3 객체로 선언한 야리니는 추가가 되어지지 않음
		Person p3 = new Person("야리니", 24); // 같은 Person(사람) -> 해시코드 값이 달라서 다른 사람이라고 인식
		System.out.println(p3.hashCode()); // 2018699554
		hs.add(p3);
		
		System.out.println(hs);
		
		// 이름, 나이 둘 다 같으면 같은 객체로 인식을 해서 HashSet에 추가(add) 못하게 하자! -> Person 클래스에 메서드 오버라이딩

	} // main

} // class

// Ex09에 있는 Person 클래스 사용할 거에요~
// class Person {
