package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 3:42:44
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// static이 없으면 아래와 같이 사용해야 하고
		Ex09 obj = new Ex09();
		obj.drawLine();
		
		// staitc이 있으면 클래스명.정적메서드명(); 이렇게 사용해야되는데 클래스명을 생략해도 가능하다.
		Ex09.drawLine();
		drawLine();
		
	} // main
	
	private static void drawLine() {
		System.out.println("---------------------------");
	}

} // class
