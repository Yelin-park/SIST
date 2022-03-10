package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 3:14:24
 * @subject [멤버(필드, 메서드) 선언시 앞에 붙는 접근지정자의 종류와 설명]
 * @content p348 접근제어자 == 접근지정자
*
	// 접근제어자(access modifier) == 접근지정자
	// [멤버(필드, 메서드, 생성자(constructor)) 선언시 앞에 붙는 접근지정자의 종류와 설명]
	// 	1) public   	: 패키지 내부/외부 어디서나 접근(참조) 가능
	// 	2) default  	: 같은 패키지 내에서만 접근(참조) 가능
	// 	3) private		: 같은 클래스(파일) 내에서만 접근(참조) 가능
	// 	4) protected	: 같은 패키지 내에서만 접근(참조) 가능 + 상속(다른 패키지의 자손 클래에서 접근(참조) 가능)

	// 범위 : public -> protected -> default -> private

	// 지역변수는 접근 지정자를 붙이지 않는다.
 */
public class Ex07 {

	public static void main(String[] args) {
		// [테스트]
		// (조건) 같은 패키지 내부(days15), 같은 클래스 내부
		Time t = new Time();
		// 에러메시지 : The field Time.hour [is not visible] *****
		// 원인 : 접근지정자 때문에 보이지 않는다.
		// t.hour = 12;		   // private X
		t.minute = 35;  	   // default O
		t.miliseconds = 1234;  // public  O
		t.nanoseconds = 1234;  // public  O
		
	} // main

} // class

