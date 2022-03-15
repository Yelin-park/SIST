package days17;

// 사원 클래스 - 사원이라면 공통적으로 가지고 있어야할 멤버(필드, 메서드)를 구현한 클래스
//				 *** 급여 메서드 : getPay() 선언 X *** (days18.Ex04)
// 추상메서드를 1개 이상 가지고 있으면
// 그 클래스도 객체(인스턴스)를 생성할 수 없는 "추상클래스"가 된다.
// abstract 키워드를 붙인다.
public abstract class Employee { // extends Object 라는 코딩이 되어있지만 안보이는 상태
	
	// [필드]
	private String name; // 사원명
	private String addr; // 사원주소
	private String tel;  // 연락처
	private String hiredate; // 입사일자
	
	// [getter, setter]
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// [생성자]
	// 디폴트 생성자
	public Employee() {
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	// 생성자 4
	public Employee(String name, String addr, String tel, String hiredate) {
		// super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 생성자 4 호출됨.");
	}
	
	// [메서드]
	// 1. 사원 정보를 출력하는 메서드(인스턴스 메서드)
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s, 사원주소 : %s, 연락처 : %s, 입사일자 : %s\n", this.name, this.addr, this.tel, this.hiredate);
	}
	
	// 급여 계산하는 메서드(days18.Ex04 시간에 추가함) -> 추상화메서드로 변경 (아래)
	/*
	public int getPay() {
		return 0;
	}
	*/
	
	// 몸체 {} 가 구현이 안된 불완전한 메서드
	//  > abstract 키워드를 붙여서 "추상메서드"라고 한다.
	// 상속받은 자식클래스에서 반드시 오버라이딩해라(== 재정의해라 == 몸체를 구현해라)
	public abstract int getPay();

} // Employee class
