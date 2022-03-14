package days17;

// 임시직 사원 클래스
public class Temp extends Employee{
	
	// [필드] - E(n,a,t,h)상속되어짐
	private int days; // 근무일수
	private int payOfDay; // 하루 일당
	
	// [생성자]
	// 디폴트 생성자
	public Temp() {
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}
	
	// 생성자 6
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate); 
		
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("> Temp 생성자 6 호출됨.");
	}
	
	// [메서드] - E(dispEI()) 상속되어짐
	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf("근무일수 : %d, 하루일당 : %d\n", this.days, this.payOfDay);
	}
	
	public int getPay() {
		return this.days * this.payOfDay; // 임시직 급여 = 근무일수 * 하루일당
	}

} // Temp class
