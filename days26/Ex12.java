package days26;

import java.util.ArrayList;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 4:22:27
 * @subject p676 제한된 제네릭 클래스
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// 제한된 제네릭 클래스 : class Box<T extends B>
		
		Box2<Toy> box = new Box2<Toy>();
		box.list.add(new Toy()); // Box2 필드에 ArrayList 타입의 list 멤버 변수가 있음
		box.list.add(new Toy());
		box.list.add(new Toy());
		
		/*
		//         T 타입은 반드시 Fruit 과일의 자식들만 사용하도록 제한하는 제네릭 클래스 선언
		FruitBox<Fruit> box2 = new FruitBox<>(); // Fruit는 Eatable 인터페이스를 구현하지 않아서 에러 발생 -> 인터페이스 구현하면 에러 사라짐
		box2.list.add(new Apple());
		box2.list.add(new Apple());
		box2.list.add(new Apple());
		// 에러 메시지 : The method add(Apple) in the type ArrayList<Apple> is not applicable for the arguments (Grape)
		// 해석 : ArrayList에 Apple 타입 지정했는데 왜 포도 집어넣냐?
		box2.list.add(new Grape());
		*/
		
		// Eatable 인터페이스를 구현한 클래스만 타입으로 지정가능
		// Apple 클래스를 Eatable 인터페이스를 구현하면 타입 지정 가능
		FruitBox<Apple> box4 = new FruitBox<>();
		
		// FruitBox의 제네릭 타입을 Fruit 상속받아서 Fruit 클래스 또는 Fruit 자식클래스의 타입만 넣을 수 있다.
		// FruitBox<Toy> box2 = new FruitBox<>();
		// FruitBox<Member> box3 = new FruitBox<>();

	} // main

} // class

interface Eatable{}

// 제한된 제네릭 클래스
// 과일 클래스를 물려받은 자식이면서 Eatable 인터페이스를 구현한 클래스 타입을 사용하겠다.
class FruitBox<T extends Fruit & Eatable>{ // <T extends Fruit> : Fruit에서 물려받은 어떤 타입이라도 사용을 가능하도록 하겠다.
	
	ArrayList<T> list = new ArrayList<T>();
	
} // FruitBox
