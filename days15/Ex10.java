package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 4:32:54
 * @subject p277 클래스 메서드와 인스턴스 메서드
 * @content
 * 			메서드(멤버함수)
 * 				1) 클래스 메서드(static 메서드)  클래스 변수				static 키워드 설명
 * 				2) 인스턴스 메서드         		 인스턴스 변수
 * 
 * 			p280 클래스 멤버와 인스턴스 멤버간의 참조와 호출
 * 			p283 오버로딩(overloading)
 * 
 * 			p287 가변인자(variable + args(arguments 인자, 인수) == varargs)와 오버로딩 : 인자의 갯수가 다른 중복메서드
 * 				 가변배열 : days14.Ex03.java
 */
public class Ex10 {

	public static void main(String[] args) {
		// MyMath 클래스
		MyMath math = new MyMath();
		System.out.println(math.sum(1, 2));
		System.out.println(math.sum(1, 2, 3));
		System.out.println(math.sum(1, 2, 3, 4, 5, 6, 7));
		
		int[] m = {1,2,3,4,5,6,7,8,9};
		System.out.println(math.sum(m));
		
	} // main

} // class
