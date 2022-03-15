package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 2:44:56
 * @subject p348 - 접근지정자 + 멤버(필드, 메서드)	(-> 앞에 붙는 접근지정자) days15.Ex07
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// p348 - 접근지정자 + 멤버(필드, 메서드)	(-> 앞에 붙는 접근지정자) days15.Ex07
		
		// 범위가 넓은쪽 public > protected > (default) > private
		// 	1) public   	: 패키지 내부/외부 어디서나 접근(참조) 가능
		//	2) protected	: 같은 패키지 내에서만 접근(참조) 가능 + 상속개념(상속 관계가 있는 자식클래스에서 접근 가능)
		// 	3) default  	: 같은 패키지 내에서만 접근(참조) 가능
		// 	4) private		: 같은 클래스(파일) 내에서만 접근(참조) 가능
		
		// AccessModifier.java
		// days18.AccessModifier
		// 같은 패키지 안에 다른 클래스 코딩
		AccessModifier am = new AccessModifier();
		// am.pub;		am.pro;		am.def;   ->  접근가능


	} // main

} // class
