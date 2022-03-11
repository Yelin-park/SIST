package days16;
// Ex07, Ex08 관련
// 저축 클래스
public class Save {
	
	// 필드(==멤버 변수) 선언
	// 인스턴스 변수(객체를 생성해야만 사용 가능)
	private String name; 		// 예금주
	private int money;   		// 예금액
	
	// 클래스당 하나만 생성해서 공유해서 사용하자
	// 공유변수, 정적(static)변수, 클래스변수
	private static double rate = 0.02; // 이자율
	
	// 디폴트 생성자 선언
	public Save() {
		
	}
	
	// 생성자 3(매개변수 갯수) 오버로딩
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// getter/setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// static getter, setter 메서드
	// 정적(static) 메서드
	// 프로그램이 시작하면 사용할 수 있다.
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}

	// 메서드(method)
	// 예금 정보를 출력하는 메서드 선언
	// [인스턴스 메서드] : 객체(인스턴스)를 생성해야 사용 가능
	public void dispSave() {
		System.out.printf("> 예금주: %s\t예금액: %d\t이자율: %.2f\n", this.name, this.money, this.rate);
	}
	
} // Save Class
