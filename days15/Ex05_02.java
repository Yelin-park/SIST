package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 2:02:52
 * @subject p240 객체 배열
 * @content		수 많은 객체를 다룰 때 배열을 사용하면 편리하다.
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		// Person p1 = null; 	 	// 인스턴스 생성X
		// p1.name = "1번 사람";    // java.lang.NullPointerException
		// p1.run();
		
		// p1, p2, p3, p4, p5 ... 많은 객체를 다루고자 한다면 "객체 배열"을 사용하자
		// 자료형[] 배열명 = new 자료형[배열크기];
		
		Person[] ps = new Person[5]; // ps는 객체가 이니고 Person 타입의 배열임!

		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Person(); // ***** 인스턴스 생성 *****  배열도 인스턴스 생성을 해줘야 에러가 안남
			ps[i].name = (i+1) + "번 사람";
			ps[i].run();
		}
		
		
	} // main
	

} // class
