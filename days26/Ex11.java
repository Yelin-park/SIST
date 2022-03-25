package days26;

import java.util.ArrayList;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 3:56:15
 * @subject 지네릭스(Generics)
 * @content
 * 			[p672 지네릭스의 용어]
 * 			class Box<T>{
 * 				//
 * 			}
 * 			1. Box<T> : 제네릭 클래스 -> T의 Box 클래스 또는 T Box 클래스라고 읽는다.
 * 				"T의 Box 제네릭 클래스"
 * 			2. T : 타입 변수 또는 타입 매개변수(T는 타입문자)
 * 			3. Box : 원시타입(raw type)
 * 
 * 			[p673 지네릭스의 제한]
 * 			지네릭스 ? 컴파일 시 타입 결정
 * 			1.
 * 			class Box<T>{
 * 				static 필드;			-> 에러 발생
 * 				static 메서드();		-> 에러 발생
 * 			}
 * 			static 객체 생성하기 전에 호출이 가능한 것이고 지네릭스는 컴파일 시 타입을 결정 하는 것인데 객체 생성 전에 타입을 결정하지 않아서 사용할 수 X
 * 
 * 			2. T[] 배열;		-> 선언 사용 가능
 * 			   new T[3];	-> 배열 생성은 불가
 * 
 * 			p675 예제 12-1
 * 			
 * 
 */
public class Ex11 {

	public static void main(String[] args) {
		Box2<Fruit> furitBox = new Box2<>(); // 과일 박스 생성
		furitBox.add(new Fruit()); // 과일박스에 과일 추가
		furitBox.add(new Apple()); // 과일박스에 사과 추가
		furitBox.add(new Grape()); // 과일박스에 포도 추가
		
		// Box2<Grape> grapeBox = new Box2<Apple>(); // 당연히 타입 불일치 에러

		Box2<Toy> furitBox2 = new Box2<>();
		furitBox2.add(new Toy());
	} // main

} // class

// 예제 12-1
class Fruit{public String toString() {return "과일";}}
class Apple extends Fruit implements Eatable{public String toString() {return "사과";}}
class Grape extends Fruit{public String toString() {return "포도";}}
class Toy{public String toString() {return "장난감";}}

// 제네릭 클래스
class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() {return list.size(); }
	public String toString() {return list.toString(); }
} // Box2 제네릭 클래스
