package days15;

// 시간을 관리할 수 있는 클래스
public class Time {
	// 필드
	private int hour;		 // 시간
	int minute;		 		 // 분
	protected int second;	 // 초
	public int miliseconds;  // 밀리세컨드 == 1/1000초
	public int nanoseconds;  // 나노세컨드 == 1/10^9초(10의 9승 분의 1초)
	
	// 메서드
	public void printTime() {
		// public int temp; // -> 지역변수 앞에는 접근지정자 붙일 수 없음
		int temp;  // local variable(지역변수)
		
		hour = 12; // private 같은 클래스 내부에서 접근 가능
		
	}

} // Time
