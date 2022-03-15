package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 2:45:06
 * @subject p379 추상클래스와 추상메서드 예제
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // main

} // class

// 모든 유닛이 가지는 공통적인 멤버를 추상클래스에 담기
abstract class Unit{
	int x, y; // 현재 위치 저장할 필드
	abstract void move(int x, int y);
	abstract void stop();
} // Unit

class Marine extends Unit{
	// int x, y; // 현재 위치 저장할 필드
	// void move(int x, int y) {}
	// void stop() {}
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
}

class Tank extends Unit{
	// int x, y; // 현재 위치 저장할 필드
	// void move(int x, int y) {}
	// void stop() {}
	
	void changeMode() {}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

class DropShip extends Unit{
	// int x, y; // 현재 위치 저장할 필드
	// void move(int x, int y) {}
	// void stop() {}
	
	void load() {}
	void unload() {}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}