package days20;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 12:17:02
 * @subject p463 Class 객체를 얻는 방법 ***
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// [Class 객체]를 얻는 3가지 방법
		// 1) Class getClass() -> getClass() 메서드를 가지고 Class 객체를 가지고 온다. -> 그 인스턴스의 [클래스 정보]를 가지고 오는 메서드
		/*
		Card c = new Card("HEART", 3);
		Class cls = c.getClass(); 
		System.out.println(cls.getName());  // days20.Card (==fullName)
		System.out.println(cls.toString()); // class days20.Card
		System.out.println(cls);            // class days20.Card
		*/
		
		// 2) 클래스명.class -> static 필드 -> 클래스 타입을 돌려줌, 클래스 객체를 가지고 올 수 있더라~
		/*
		Class cls = Card.class;
		Class cls2 = MyPoint.class;
		
		try {
			Card c = (Card) cls.newInstance(); // 클래스 타입을 가지고 인스턴스를 생성할 수 있다.
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(cls);  // class days20.Card
		System.out.println(cls2); // class days20.MyPoint
		*/
		
		// 3) Class 클래스의 forName("full Name") -> static 메서드
		try {
			Class cls = Class.forName("days20.Card"); // JDBC - DB연동하는 작업할 때 사용하니 기억하기
			System.out.println(cls); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} // main

} // class

final class Card{
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.kind + " : " + this.num;
	}
}