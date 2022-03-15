package days18;

import java.util.Calendar;

import days17.Regular;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오전 11:26:59
 * @subject p351-2 private 접근지정자 생성자 (== 생성자 앞에 선언하는 접근지정자)
 * @content 
 * 			public
 * 			default
 * 			[private 접근지정자를 사용하는 이유? 싱글톤을 사용하기 위해(인스턴스를 1개만 생성하기 위해)]
 * 				생성자의 접근 제어자를 private으로 지정하면, 외부에서 생성자에 접근할 수 없으므로
 *				인스턴스를 생성할 수 없게 된다. 그래도 클래스 내부에서는 인스턴스의 생성이 가능하다
 *				대신 인스턴스를 생성해서 반환해주는 public메서드를 제공함으로써 외부에서 이 클래스 의 인스턴스를 사용하도록 할 수 있다.
 *				이 메서드는 public인 동시에 static이어야 한다
 */
public class Ex06 {

	public static void main(String[] args) {
		// [싱글톤(Singleton.java) ==> 객체를 1개만 생성하겠다(의도)]
		
		// new Singleton(); -> 코딩에 의해서 디폴트 생성자를 자동으로 호출한다.
		// 생성자가 하나도 없을 때 컴파일러가 디폴트 생성자를 추가
		
		// private 생성자를 선언하면 new 클래스명() 객체(인스턴스) 생성을 못하게 하겠다.
		// 왜?? 클래스 선언해 두고 왜 객체 생성 못하게 막느냐?
		//		추상클래스라면 미완성클래스이기 때문에 객체 생성을 막는 것은 이해가 된다.
		// 		객체를 1개만 생성하겠다(의도) **
		// 			예) 반 - 야간자율학습(30명) 중 조퇴 -> 반장에게 말하기 단, 반장은 한 명이어야 됨(관리자는 1명)
		// 자바 애플리케이션 -- 데이터베이스연동   - CRUD 작업  -  작업을 하는 DBconn.java 클래스 생성  -  DBconn.java 싱글톤 쓰고 있으면 다 쓸 때까지 대기
		
		// Singleton s1 = new Singleton();
		// int hashCode = s1.hashCode();
		// System.out.println(hashCode);

		// 추상메서드가 1개도 없는데 추상클래스로 선언이 가능할까요? 가능하다.
		// 추상클래스로 선언하는 이유? 객체(인스턴스) 생성해서 사용하지 마세요 라는 의미
		
		// 366712642 해시코드 값이 같다 == 같은 인스턴스(객체)
		// 해시코드 : 인스턴스가 가지고 있는 주소값
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode()); // 366712642
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.hashCode()); // 366712642
		
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3.hashCode()); // 366712642
		
		/*
		// 인스턴스가 각각 생성되고 있음을 해시코드 값으로 확인
		Regular r1 = new Regular();
		System.out.println(r1.hashCode()); // 1829164700
		Regular r2 = new Regular();
		System.out.println(r2.hashCode()); // 2018699554
		Regular r3 = new Regular();
		System.out.println(r3.hashCode()); // 1311053135
		*/
		
		// 1. 객체 생성할 필요가 없어서 -> private Math() {} 선언이 되어있어서 객체 생성 X
		// 2. 모든 멤버가 static이기 때문에 클래스명.멤버 접근(사용)
		// Math m = new Math();
		// Math.random();
		// Math.PI;
		
		// Calendar c = new Calendar();    private 생성자 선언해서 객체 생성 X
		Calendar c = Calendar.getInstance();

	} // main

} // class
