package days20;

// [days20.Ex02] clone() 메서드를 사용하려면 Cloneable 인터페이스로 구현해야함
public class MyPoint implements Cloneable{
	
	private int x;
	private int y; 
	

	public MyPoint(int x, int y) { 
		this.x = x; 		
		this.y = y; 
		System.out.println("> MyPoint 2 생성자 호출됨");
	}
	
	
	public MyPoint() { 
		System.out.println("> MyPoint 디폴트 생성자 호출됨");
	}
	

	public MyPoint(int x) {
		this(x, 100);
		System.out.println("> MyPoint 1 생성자 호출됨");
	}
	
	public MyPoint(MyPoint p) {
		x = p.x;
		y = p.y;
	}

	// getter
	public int getX() {
		return x;
	}

	// setter
	public void setX(int x) {
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
		System.out.printf("> x = %d, y = %d\n", this.x, this.y);
	} // dispPoint
	
	// days20.Ex01의 toString() 메서드 오버라이딩
	@Override
	public String toString() {
		return String.format("> x = %d, y = %d\n", this.x, this.y);
	}


	public void offSetPoint(int pos) {
		this.x += pos;
		this.y += pos;
	}

	public MyPoint offSetPoint(MyPoint p) {
		this.x += p.x;
		this.y += p.y;

		return this;
	}

	// [days20.Ex02 - equals 메서드() 오버라이딩]
	@Override
	public boolean equals(Object obj) {  // Object obj = new MyPoint(1,2)   -> 업캐스팅 Object는 MyPoint 필드 사용 X
		// obj.메서드() 9개만 보임
		if(obj instanceof MyPoint) {
			// obj.메서드() + MyPoint -> 공변반환타입으로 인하여 obj.메서드 9개 외의 것도 보여짐 (원래 문법은 p.을 해야 보여짐)
			MyPoint p = (MyPoint)obj;     // 다운캐스팅 -> MyPoint 객체의 필드를 사용하기 위해서
			if(this.x == p.x && this.y == p.y) return true;
		}
		return false; // MyPoint 객체가 아닐 때는 false 리턴
	}

	// [days20.Ex02 - clone 메서드() 오버라이딩]
	// p1.clone(); 리턴 값
	@Override
	// public Object clone() { // 공변반환타입 알기 전
	// 공변반환타입으로 인한 리턴타입 변환 -> MyPoint으로 ***
	public MyPoint clone() { // throws CloneNotSupportedException -> throws 안하면 메서드 안에서 try-catch하면 오버라이딩 OK
		Object obj = null; 	  // 복제를 하고 반환하려고 받아둠
		
		try {
			// MyPoint p = new MyPoint(this); // 복제하는 코딩
			obj = super.clone(); // 위의 코딩을 하지 않고 이렇게 해도 됨. 자동으로 복제해서 넘겨줌 -> 예외발생
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		return (MyPoint)obj; // 공변반환타입으로 인한 다운캐스팅
		// return obj;
	}
	
} // MyPoint
