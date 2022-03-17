package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오전 11:06:22
 * @subject java.lang패키지와 유용한 클래스 중 p456 clone() 메서드 설명
 * @content Ex01 이어서 하는 것
 * 			 equals 메서드 다시 설명
 * 			 p457 공변 반환타입 (자식클래스의 필드가 보이는 이유)
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		// [equals 메서드 재설명]
		MyPoint p1 = new MyPoint(1, 2);
		MyPoint p2 = new MyPoint(1, 2);
		// p1 x,y 좌표와 p2 x,y 좌표가 같은지 확인..
		System.out.println(p1.equals(p2)); // false -> 오버라이딩 -> true
		// Object.equals() 메서드는 인스턴스의 참조주소값을 비교하기 때문에 false 결과 값이 나옴
		// MyPoint.equals() 메서드 오버라이딩 : 참조주소값이 다르더라도 두 좌표의 x,y 값이 같다면 같은 좌표라고 나태내고싶다. -> true 반환
		*/
		
		// 복제(clone)
		MyPoint p1 = new MyPoint(1, 2);
		// MyPoint p2 = p1;  // 같은 주소를 가르키는 복사
		/*
		// p1을 p2에 복제했다. -> 값은 같지만 해시코드 값이 다름
		MyPoint p2 = new MyPoint(p1);
		System.out.println(p1); // > x = 1, y = 2
		System.out.println(p2); // > x = 1, y = 2
		System.out.println(p1.hashCode()); // 1252169911
		System.out.println(p2.hashCode()); // 2101973421
		*/
		
		
		// 5. [Object.clone() 메서드] : 복제 메서드 오버라이딩
		// p457 공변반환타입
		// MyPoint p2 = (MyPoint)p1.clone(); // clone() 메서드가 리턴값을 Object로 돌려주기 때문에 다운캐스팅 필요
		MyPoint p2 = p1.clone();			 // 공변반환타입으로 인하여 위의 코딩이 수정됨
		System.out.println(p2);
		System.out.println(p1.hashCode()); // 1252169911
		System.out.println(p2.hashCode()); // 2101973421
		
	} // main

} // class
