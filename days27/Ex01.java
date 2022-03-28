package days27;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 9:21:15
 * @subject p684 제네릭 메서드
 * @content
 * 			1. 제네릭 메서드 ? 메서드의 선언부에 제네릭 타입이 선언된 메서드
 * 			2. 제네릭 타입의 선언 위치는 ? 리턴자료형 앞에 선언 
 * 				예) [접근지정자] [기타제어자] <T> 리턴자료형 메서드명([매개변수...]){
 * 					[return 리턴값];
 * 					}
 * 			3. 제네릭 메서드 왜? 선언하고 사용하는가? 코딩 확인
 * 
 *  [참고] p678 제네릭 타입이 다른 것만으로는 오버로딩이 성립되지 않는다.
 *  
 *  	제네릭 메서드 -> Collections.sort(List<T> list);
 *		
 */
public class Ex01 {

	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox();
		Juice appleJuice = Juicer.makeJuice(appleBox);
		
		// 에러메시지 : The method makeJuice(FruitBox<Apple>) in the type Juicer
		// 			  is not applicable for the arguments (FruitBox<Grape>)
		// 해석 : Juicer 메서드의 타입이 Apple인데 Grape를 넣으려고해서 안된다
		// 해결 : Juicer 메서드에 와일드카드 사용하여 해결
		FruitBox<Grape> grapeBox = new FruitBox();
		Juice grapeJuiece = Juicer.makeJuice(grapeBox);
		
		// 제네릭 메서드 호출
		Juice g = Juicer.<Grape>makeJuice(grapeBox);

		System.out.println("END");

	} // main

} // class

// 과일클래스
class Fruit{public String toString() {return "과일";}}
class Apple extends Fruit {public String toString() {return "사과";}}
class Grape extends Fruit{public String toString() {return "포도";}}

// 과일상자 -> <T extends Fruit> : Fruit에서 물려받은 어떤 타입이라도 사용을 가능하도록 하겠다.
class FruitBox<T extends Fruit>{ // 
	ArrayList<T> list = new ArrayList<T>();
} // FruitBox

// 쥬스클래스
class Juice{}

// 쥬스만드는 사람 또는 기계
class Juicer{
	
	/*
	// 와일드카드를 사용하여 모든 과일 주스를 만들 수 있는 메서드 선언
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		return new Juice();
	}
	*/
	
	// 위의 와일드 카드를 사용한 메서드를 [제네릭 메서드]로 선언할 수 있다. -> 위의 코딩과 동일한 코딩
	static<T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		return new Juice();
	}
	
	/*
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	}
	
	// 에러메시지 : Erasure of method makeJuice(FruitBox<Grape>) is the same as another method in type Juicer
	// p678 제네릭 타입이 다른 것만으로는 오버로딩이 성립되지 않는다.
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	}
	*/
} // Juicer

