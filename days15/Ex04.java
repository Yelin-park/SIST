package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 12:07:15
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 객체 선언 및 생성(인스턴스 생성)
		Tv t1 = new Tv();
		
		System.out.println(t1.channel); // 0
		
		// 참조타입의 매개변수 메서드 호출 : Call By Reference
		changeTv(t1); // 호출이 끝나고 난 뒤 사라짐
		
		System.out.println(t1.channel); // 

	} // main

	//							   Tv t1 = t1;  같은 t1은 아님!!! Tv t1의 주소값을 t1에 담겠다.
	private static void changeTv(Tv t1) {
		t1.channel = 100;
		
	} // changeTv 

} // class
