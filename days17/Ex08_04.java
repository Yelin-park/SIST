package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 4:51:53
 * @subject
 * @content
 */
public class Ex08_04 {

	public static void main(String[] args) {
		/*
		Temp emp5 = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		emp5.dispEmpInfo(); // 재정의 메서드 호출
		System.out.println(emp5.getPay()); // 근무일수 * 하루일당
		*/
		
		// 업캐스팅(자동형변환)
		Employee emp5 = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		emp5.dispEmpInfo(); // 재정의 메서드 호출
		// System.out.println(emp5.getPay()); // Employee에 getPay() 메서드 없어서 호출 X, 에러 발생
		

 	} // main

} // class
