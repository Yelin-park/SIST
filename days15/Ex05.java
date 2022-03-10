package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 2:02:52
 * @subject p240 객체 배열
 * @content		수 많은 객체를 다룰 때 배열을 사용하면 편리하다.
 */
public class Ex05 {

	public static void main(String[] args) {
		// p1, p2, p3, p4, p5 ... 많은 객체를 다루고자 한다면 "객체 배열"을 사용하자
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.name = "1번 사람";
		p1.run();
		p2.name = "2번 사람";
		p2.run();
		p3.name = "3번 사람";
		p3.run();
		p4.name = "4번 사람";
		p4.run();
		p5.name = "5번 사람";
		p5.run();

	} // main

} // class
