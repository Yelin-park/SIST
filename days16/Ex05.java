package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 12:02:03
 * @subject 클래스(객체) 복사(copy)와 복제(clone)
 * @content 얕은 복제(복사)
 * 			깊은 복제(복사)
 */
public class Ex05 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(10, 20);
		
		/*
		// 1. 객체(클래스) 복사(copy)
		MyPoint p2 = p1;
		p2.setX(100);
		System.out.println(p1.getX());
		*/
		
		// 2. 객체(클래스) 복제(clone)
		// MyPoint p2 = new MyPoint(p1.getX(), p1.getY());
		MyPoint p2 = new MyPoint(p1); // 참조형 매개변수

		p2.setX(100);
		System.out.println(p1.getX()); // 10
		

	} // main

} // class
