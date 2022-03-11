package days16;

import days15.Student;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오전 9:03:15
 * @subject 객체 배열 초기화 설명
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 1. 객체 배열(클래스 배열)
		// 2. 객체 배열 초기화 설명
		
		/*
		// 객체 선언 및 생성(인스턴스)
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		*/
		
		/*
		Student[] s = new Student[3];  // 객체 배열(클래스 배열) 선언
		s[0] = new Student();          // new연산자로 인스턴스 생성
		s[1] = new Student();
		s[2] = new Student();
		*/
		
		
		// 객체 배열 초기화 *****    -> 위의 코딩과 동일한 의미
		Student[] s = {
				new Student(),
				new Student(),
				new Student()
		};
		
		
		
		/*
		// 배열 초기화   첨자값 == 인덱스 == index
		int[] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[3] = 3;
		*/
		// 배열 초기화 한 줄 코딩 (위의 코드와 동일한 코딩)
		// int[] m = {1, 2, 3};
		
		
		
	} // main

} // class

/*
 * [어제 수업 복습 개념]
 * 1. 클래스 앞에 붙는 접근지정자
 * 	 - public : 패키지 내부/외부 어디서든 상속과 참조가 가능한 경우
 *   - default : 패키지 내부에서 상속과 참조가 가능한 경우
 *   - private : 중복클래스 선언할 때 사용가능(독립적 클래스 사용x) 같은 클래스 내에서 상속과 참조가 가능한 경우
 *   - protected : 중복클래스 선언할 때 사용가능(독립적 클래스 사용x) 패키지 내부에서 상속과 참조가 가능한 경우 / 패키지 외부에서 상속만 가능한 경우
 *   
 * 2. 멤버(필드, 메서드, 생성자) 앞에 붙는 접근지정자
 *  - public : 패키지 내부/외부 어디서든 참조(접근) 가능
 *  - default : 패키지 내부에서 참조(접근) 가능
 *  - private : 같은 클래스 내에서 참조(접근) 가능
 *  - protected : 패키지 내부에서 참조(접근) 가능 + 상속(다른 패키지의 자손 클래스에서 참조(접근) 가능)
 *  
 * 3. 멤버를 사용하는 방법
 * 	new 연산자로 동적 메모리 영역에 생성 -> 즉, 인스턴스화 코딩을 해야 멤버 사용 가능하다. 객체로 인스턴스 참조
 * 	객체명.속성명
 * 	객체명.메서드명();
 * 
 * 4. Tv t3 = t2; 코딩의 의미
 * 	t2의 인스턴스의 주소값을 t3도 가지겠다.
 * 
 * 5. 기본형 매개변수, 참조형 매개변수, 참조형 리턴타입에 대한 설명 ***
 * 		
 * 6. 클래스배열 == 객체배열에 대해 설명
 * 		수 많은 객체를 다룰 때 배열을 사용하면 편리하다.
 * 		ex) Tv t1 = new Tv();
 * 			Tv t2 = new Tv();
 * 			Tv t3 = new Tv();
 * 		위와 같은 코딩을 아래와 같이 배열에 담아 사용할 수 있다.
 * 		Tv[] tvs = new Tv[3];   > tvs는 객체명이 아니라 배열명이다.
 * 		tvs[0] = new Tv(); 각 배열의 요소에 인스턴스 생성을 해줘야 한다.
 * 
 * 7. 한 반에 30명 학생의 이름, 국어, 영어, 수학, 총점, 평균, 등수 처리 예제
 * 
 * 8. 변수의 종류 3가지
 *    클래스 변수
 *    인스턴스 변수
 *    지역 변수
 * 
 * 9. 메서드의 종류 2가지
 * 		클래스 메서드
 *  	인스턴스 메서드
 * 
 * 10. 가변인자 설명
 *    메서드 매개변수에 여러 개의 인자를 주어질 때 인자의 갯수만큼 선언할 필요 없이 가변인자를 주어지면 배열 형태로 변환이 되어 처리하기 쉽다.
 *    ex) int... m 
 */
