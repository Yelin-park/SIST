package days16;

public class MyPoint {
	
	// 필드(field) == 멤버변수
	// 필드를 초기화 하지 않으면 각 자료형의 기본값으로 초기화 되어져 있다.(지역변수는 초기화하지 않으면 오류~)
	private int x;
	private int y; // setter, getter 선언
	
	
	// Ex03. 생성자 선언 (생성자 이름은 클래스명과 동일해야함)
	// Ex06. this 설명
	//         MyPoint(10, 20)
	public MyPoint(int x, int y) { // 리턴값은 없지만 void도 적지않는다.
		this.x = x; 		
		// x = a; // x 필드를 a 값으로 초기화
		this.y = y; 	// 어떤 y가 필드 y인지, 매개변수 y인지 모름 	// y 필드를 b 값으로 초기화
		System.out.println("> MyPoint 2 생성자 호출됨");
	}
	
	// 디폴트 생성자 선언(생성자 오버로딩) - Ex02(MyPoint p1 = new MyPoint(); 코딩) 에러 발생으로 인하여 선언
	public MyPoint() { // 리턴값은 없지만 void도 적지않는다.
		System.out.println("> MyPoint 디폴트 생성자 호출됨");
	}
	
	// Ex04. 생성자 선언
	// Ex06. this - 생성자 안에서 또 다른 생성자 호출
	public MyPoint(int x) {
		// (주의) 다른 모든 코딩보다 맨 위에 코딩해야 된다.
		this(x, 100); // this의 두 번째 용도 : 생성자 안에서 또 다른 생성자 MyPoint(int x, int y)를 호출하는 this
		// x = y = n;
		// this.x = x;
		// this.y    // this의 첫 번째 용도 : 멤버(필드)를 가리키는 this
		System.out.println("> MyPoint 1 생성자 호출됨");
	}
	
	// Ex05. 참조형 매개변수 생성자 선언 -> P298 생성자를 이용한 인스턴스의 복사
	public MyPoint(MyPoint p) {
		x = p.x;
		y = p.y;
	}

	
	// Ex02.getter/setter 선언 + 자동 생성(단축키 : Alt + Shift + S)
	// getter
	public int getX() {
		return x;
	}

	// setter
	public void setX(int x) {
		// ***** this 키워드 *****
		if(x >= -100 && x <= 100) this.x = x;
		else System.out.println("x의 유효범위 값이 벗어났습니다.");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	// 메서드(method)
	public void dispPoint() {
		// 같은 클래스 안에 있기 때문에 private인 x에 접근 가능
		System.out.printf("> x = %d, y = %d\n", this.x, this.y);
	} // dispPoint
	
	// offSetPoint() 메서드를 호출한 객체 즉, p1이 this 이다.
	// p1.offSetPoint(5);
	// this.x란? p1의 x 필드
	public void offSetPoint(int pos) {
		this.x += pos;
		this.y += pos;
	}
	
	// offSetPoint() 메서드를 호출한 객체 즉, p1이 this 이다.
	// p1.offSetPoint(p2);
	// p1의 x 값에 p2의 x 값을, p1의 y 값에 p2의 y 값을 누적하겠다.
	/*
	public void offSetPoint(MyPoint p) {
		this.x += p.x;
		this.y += p.y;
	}
	*/
	
	// [암기]
	// 오버로딩 - 메서드명 동일, 매개변수 갯수/타입이 달라야 된다.
	//            but 리턴자료형만 다르다고 오버로딩이 되지는 않는다. ***
	public MyPoint offSetPoint(MyPoint p) {
		this.x += p.x;
		this.y += p.y;
		
		// return p; // p2를 돌려줌
		return this; // this의 세번 째 용도 : 단독으로 사용될 때
	}
	

} // MyPoint
