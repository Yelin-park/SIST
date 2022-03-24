package days25;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Yelin
 * @date 2022. 3. 24. - 오후 12:25:00
 * @subject p628 Comparator와 Comparable
 * @content
 * 			Comparable을 구현하고 있는 클래스(Person)는 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스
 * 			Comparator을 구현한 클래스는 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
 * 
 * 			비교 가능한 클래스로 만들기 위해서는 Comparable을 구현하고
 * 			비교 가능한 클래스가 아니면, 비교하기 위해서 잣대가 필요하니 Comparator로 새로운 클래스를 하나 구현하면 됨
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// public final class String implements java.io.Serializable, Comparable<String>, CharSequence { => Comparable 구현 했기 때문에 정렬 가능
		String[] m = {"tiger", "cat", "Dog", "lion"};
		System.out.println(Arrays.toString(m));
		
		
		// Comparator 인터페이스
		// 오름차순 정렬
		// Arrays.sort(m);
		
		// 내림차순 정렬
		// Arrays.sort(m, new DesendingComparator());
		
		// 대소문자 구분하지 않고 정렬
		Arrays.sort(m, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분없이 오름차순 정렬
		System.out.println(Arrays.toString(m));
		
		
		// Comparable 인터페이스
		Person[] p = {
			new Person("야리니", 40),
			new Person("익순이", 27),
			new Person("유재석", 38),
		};
		
		System.out.println(Arrays.toString(p));
		
		// 나이 순으로 정렬
		Arrays.sort(m);
		// 에러메시지 : java.lang.ClassCastException: days25.Person cannot be cast to java.lang.Comparable
		// 해석 : Comparable(정렬이 가능한 인터페이스)를 구현한 클래스가 아니라서 정렬할 수 없다.
		// 해결 : Comparable 구현
		System.out.println(Arrays.toString(p));
		
		
	} // main

} // class
// Comparator 인터페이스 구현한 클래스
class DesendingComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
} // DesendingComparator

// Ex12 할 때도 사용!
// Comparable : 정렬할 때 기준이 되도록 하는 것 -> Person이 기준이 되는 것 -> 기본 정렬기준을 구현하는데 사용
// Comparable 인터페이스 구현한 클래스
class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		// return this.age - o.age; // 같으면 0, 앞이 크면 양수, 뒤가 크면 음수
		return this.name.compareTo(o.name); // 이름 
	}

	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age; // 이름하고 나이가 같니?
		}
		return false;
	}
	
} // Person class
