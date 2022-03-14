package days17;

// 정규직 사원 클래스
public class Regular extends Employee {

	// [필드] - Employee - name, addr, tel, hiredate 상속됨.
	private int pay; // 기본급
	
	// [생성자 오버로딩(overloading) == 중복함수]
	// 생성자, 초기화 블럭은 상속되지 않는다.
	public Regular() {
		System.out.println("> Regular 디폴트 생성자 호출됨.");
	}
	
	public Regular(String name, String addr, String tel, String hiredate, int pay) {
		// 각각의 필드 초기화
		// 에러메시지 : The field Employee.name [is not visible] -> 멤버 변수 접근지정자 문제(private 선언했기때문에) -> getter,setter 생성
		// this.name = name;
		// ㄱ. 해결 : getter, setter 생성
		/*
		this.setName(name); // Ex08에서 이름이 나옴
		this.setAddr(addr);
		this.setTel(tel);
		this.setHiredate(hiredate);
		*/
		
		// ㄴ. 해결 : p332 super() - 조상 클래스의 생성자
		// 		super 키워드 정의와 3가지용도?
		// 		정의 : 클래스 자기 자신의 부모 주소값을 갖는 참조변수 == super 키워드(예약어)
		// 		2번째 용도 : 생성자에서 또 다른 부모 생성자를 호출할 때의 super();
		// 		다른 코딩보다 항상 첫번째 라인에 있어야 한다.
		super(name, addr, tel, hiredate); // this() 코딩처럼 자식의 생성자에서 부모의 4개짜리 생성자를 호출하는 코딩(Regular에서 Employee)
		
		this.pay = pay;
		System.out.println("> Regular 생성자 5 호출됨.");
	}
	
	// [Ex08_03 final 설명]
	// public final void dispEmpInfo() {
	// Employee 클래스에서 메서드에 final을 붙이면 아래와 같은 에러메시지 발생
	// 에러메시지 : Cannot override the final method from Employee
	// 해석 : Employee에 있는 final 메서드는 재정의 할 수 없다.
	
	// [메서드] - Employee - dispEmpInfo() 상속됨.
	// 오버라이딩(overriding) == 부모의 메서드 재정의 
	@Override // 어노테이션(Annotation) : 부모의 것을 물려받아 재정의 했다라는 뜻
	public void dispEmpInfo() {
		// 사용 못함 : this.name, this.addr, this.tel, this.hiredate);
		// 이유 : private 멤버(필드)이기 때문에 접근(Access) 못한다.
		super.dispEmpInfo(); // name, arrd, tel, hire 출력 -> super 첫번째 용도 : 부모의 멤버를 가리킬 때의 super
		System.out.printf("기본급 : %d\n", this.pay);
	}
	
	/*
	// 오버로딩 문제점 - 매개변수 갯수, 타입이 달라야 된다.
	// 쓸데없이 매개변수를 줄수는 없이 오버로딩은 하지않겠다.
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 사원주소 : %s, 연락처 : %s, 입사일자 : %s\n", this.name, this.addr, this.tel, this.hiredate);
	}
	*/
	
	/*
	// 새로운 사원정보 출력하는 메서드 문제점? 나중에 설명
	public void dispRegInfo() {
		// 사원명, 주소, 연락처, 입사일자, 기본급 출력
	}
	*/
	
	// 급여 계산하는 메서드
	public int getPay() {
		return this.pay; // 정규직 사원은 기본급(pay)
	}
	
} // Regular class
