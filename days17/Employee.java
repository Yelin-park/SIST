package days17;

// 사원 클래스 - 사원이라면 공통적으로 가지고 있어야할 멤버(필드, 메서드)를 구현한 클래스
public class Employee { // extends Object 라는 코딩이 되어있지만 안보이는 상태
	
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

} // Employee class
