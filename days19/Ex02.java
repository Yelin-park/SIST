package days19;

import java.io.Serializable;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 10:10:43
 * @subject p392 ~ p396 페이지 설명
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 스타크래프트
		// [테란 종족] SCV - 자원캐기, 수리하기

	} // main

} // class

/*
public interface Serializable{
	// 아무것도 구현된 멤버가 없음 -> interface Repairable 와 같은 의미의 인터페이스
}
*/

// [직렬화]가 가능한 클래스 -> 네트워크 수업 배울 때 다시 배울 예정
class Unit implements Serializable{
	
}// class Unit

class GroundUnit extends Unit{ // 지상유닛
	
} // GroundUnit

class AirUnit extends Unit{ // 공중유닛
	
} // AirUnit

class SCV extends GroundUnit implements Repairable{ // 지상유닛 SCV
	
	void 자원캐는메서드() {
		
	}
	
	// 인터페이스를 구현하지 않았다면 각 유닛별로 오버라이딩을 해야하는데
	// 인터페이스를 구현 했기 때문에 인터페이스 매개변수 다형성 사용가능 
	void unitRepaire(Repairable unit) {
		// 수리 작업 코딩
	}
} // SCV

// implements Repairable : SCV로 수리가 가능한 유닛인지 아닌지 알 수 있음
class Tank extends GroundUnit implements Repairable{ // 지상유닛 탱크          SCV로 수리 O
	// 인터페이스 안에 아무것도 없어서 오버라이딩 할 것도 없음
	
} // Tank

class Dropship extends AirUnit implements Repairable{ // 공중유닛 수송선		 SCV로 수리 O
	
} // Dropship

class Marine extends GroundUnit{ // 지상유닛 보병         SCV로 수리 X
	
} // Marine

interface Repairable{
	// 멤버, 추상화 메서드 선언 X
	// 인터페이스만 선언
}

