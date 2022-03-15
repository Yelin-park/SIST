package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오전 10:20:53
 * @subject	p354 다형성
 * @content 
 * 			p344 제어자(modifier)? 클래스, 변수, 메서드를 선언할 때 함께 사용하여 부가적인 의미를 부여하는 것
 * 				2가지 종류 : 접근 지정자, 기타제어자
 */
public class Ex03 {

	public static void main(String[] args) {
		// p354 [다형성]? 다양한 성질
		// - OOP 중요한 특징 중 하나 ***
		// - 여러 가지 형태를 가질 수 있는 능력을 의미
		
		// 예) 쉬는 시간에 			사람(학생)들에게  객체				화장실갔다오세요(일/기능)  메서드
		//                              ㄴ 남학생(실체) - 남자화장실 이용
		//                              ㄴ 여학생(실체) - 여자화장실 이용
		// 예) 초등학교 수학 시험 시간
		//		각 [도형]의 면적을 구하세요(일/기능) 메서드
		//			ㄴ		삼각형(실체) - 1/2 * 가로 * 세로
		//			ㄴ		사각형 		 - 가로 * 세로
		//			ㄴ			원 		 - 반지름 * 반지름 * PI
		//			ㄴ		마름모 		 - 마름모 공식
		
		// - 다형성을 구현하는 기술 : 업캐스팅(다운캐스팅), 오버라이딩 / 오버로딩
		// - 자바에서 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현하였다.
		
		
		//  참조변수          여러 타입의 객체
		Employee emp2 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		Employee emp4 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		Employee emp5 = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		
		emp2.dispEmpInfo();
		emp4.dispEmpInfo();
		emp5.dispEmpInfo();
		// 사원들 정보를 출력하세요() - dispEmpInfo() 메서드를 호출
		// 참조변수는 Employee이지만 Regular / SalesMan / Temp 타입으로 메서드 호출
		// 자식 클래스의 객체를 생성(실제 객체)해서 부모 클래스를 참조하더라도 실제 객체인 자식 클래스의 메서드를 사용하게 된다.
		
		// [다형성으로 사용하는 이유]
		// 객체 배열 초기화
		Employee [] emps = {
				new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000),
				new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000),
				new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000)
				// 이외에 5만명 사원이 있다고 가정
		};
		
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].getPay()); // Employee에 getPay() 메서드를 추가했더니 사용가능
			// emps[i].dispEmpInfo(); // 각각 생성한 객체의 dispEmpInfo() 메서드를 사용
		}
		

	} // main

} // class
