package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오전 11:08:23
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		Tv t1 = null;
		t1 = new Tv();
		t1.channel = 11;
		t1.power();
		
		Tv t2 = new Tv();  // 새로운 인스턴스가 생성
		t2.channel = 100;
		
		// ***** 중요 *****
		// 인스턴스는 생성되지 않고 객체만 선언
		// Tv t3 = null;
		// t3 = t2;
		
		// 위의 코딩 2줄을 한줄코딩을 하면 아래와 같다.
		Tv t3 = t2; // t2, t3은 같은 인스턴스를 참조하고 있기에 t2.channel = 100  == t3.channel = 100   
		System.out.println(t3.channel);
		
		// 인스턴스 주소값을 참조하지 못해서 GC로 인해 메모리에서 삭제되어짐
		// t1 = null;
		
	} // main

} // class
