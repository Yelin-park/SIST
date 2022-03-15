package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 2:11:55
 * @subject 추상클래스 / 추상메서드
 * @content 
 * 			p370 여러 종류의 객체를 배열로 다루기 (객체배열) + 초기화
 * 			p376 추상클래스 / 추상메서드
 * 
 * 			- 추상화란? 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업
 * 				모든 사원의 공통적인 멤버 클래스 : Employee
 * 				Regular
 * 				SalesMan
 * 				Temp
 */
public class Ex09 {

	public static void main(String[] args) {
		// p370 여러 종류의 객체를 배열로 다루기 (객체배열) + 초기화
		/*
		Employee [] emps = {
				new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000),
				new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000),
				new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000)
				// 5만명 사원
		};
		
		
		Employee[] emps2 = new Employee[3];
		emps2[0] = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		emps2[1] = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		emps2[2] = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		*/
		
		/*
		Player  		 추상클래스
		↑
		AudioPlayer		 추상클래스
		↑
		CDPlayer			클래스
		*/
		
		AudioPlayer player = new CDPlayer();
		player.stop();
		player.play(100);
		
		
	} // main

} // class

// 추상클래스 : 추상메서드를 1개라도 가지고 있으면 무조건 추상클래스
// 				객체 생성을 할 수 없음
abstract class Player{
	// 필드
	// 생성자
	// 메서드
	abstract void play(int pos); // 추상메서드
	abstract void stop();
} // Player class

// 부모로부터 물려받은 추상메서드를 모두 재정의 하지않으면 자식클래스도 추상클래스 되어야함
abstract class AudioPlayer extends Player{
	// 필드 선언
	// 생성자 선언
	// 메서드 선언
	
	// 2개의 추상메서드를 오버라이딩(재정의)
	public void play(int pos) {
		System.out.println("추상메서드 몸체 구현");
	}
	
} // AudioPlayer

// 부모클래스에서 추상화하지 않은 메서드를 구현해야 클래스가 되어짐
class CDPlayer extends AudioPlayer{

	// 필드 선언
	// 생성자 선언
	// 메서드 선언
	
	@Override
	void stop() {
		System.out.println("추상메서드 몸체 구현");
	}
	
} // CDPlayer

