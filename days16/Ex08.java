package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 3:21:00
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * [질문1] static 변수(== 클래스 변수)를 왜 선언해서 사용하나요?
		 * 		 > Save.rate 필드처럼 객체를 생성하기 전에도 클래스당 하나만 생성해서 모든 객체에서 공유해서 사용하기 위해서
		 * 
		 * [질문2] static 메서드(== 정적 메서드)를 왜 선언해서 사용하나요?
		 * 			1) 객체를 생성하기 전에 static 클래스 변수는 메모리에 할당되고 '클래스명.클래스변수'를 사용할 수 있다.
		 * 				만약 private로 선언되었다면, access(접근)할 수 없다. 
		 * 			2) static + getter, setter  => 접근하기 위해서 getter, setter도 static으로!
		 * 				클래스명.정적메서드(); (getter, setter == 정적메서드)
		 * 			3) 자주 사용되는 메서드는 static 메서드로 선언한다. (객체를 생성해서 사용X)
		 * 				클래스명.static메서드(); ex) MyMath.sum();
		 * 
		 */
		
		System.out.println(MyMath.sum(1,2,3,4,5));
		int[] m = {1,2,3,4,5,6,7,8,9};
		System.out.println(MyMath.sum(m));
		
	} // main

} // class

class MyMath {

	public static int sum(int...m) { // 가변인자 int... == int[] 
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}
	
} // MyMath

