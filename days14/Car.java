package days14;

// 스포츠카를 만들기 위한 클래스(설계도) 작성
public class Car {
	// 멤버 선언
	// ㄱ. 속성(특성) == 필드 선언
	String name;
	int speed;
	int wheelCount;
	
	// ㄴ. 기능(일) == 메서드 선언
	public void dispCarInfo() {
		System.out.printf(">차명:%s, 속도:%d\n", name, speed);
	}

}
