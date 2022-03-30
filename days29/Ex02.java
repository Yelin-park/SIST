package days29;

import java.io.Serializable;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 10:31:58
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 1. 부모가 직렬화가 가능한 클래스로 선언이 되면, 자식은 자동으로 직렬화가 가능한 클래스가 된다.

	} // main

} // class
/*
// 직렬화가 가능한 클래스
class Parent implements Serializable{
	public String name;
}

class Child extends Parent { // implements Serializable 선언 X
	public int age;
}
*/