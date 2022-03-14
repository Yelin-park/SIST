package days17;

// 영업직 사원 클래스
// 자식클래스를 가질 수 없는 최종(마지막) 클래스 입니다라고 선언할 때 final 키워드를 클래스 선언 부분 앞에 붙인다.
public final class SalesMan extends Regular {
	
	// [필드] - E(n,a,t,h) / R(p) 상속되어짐
	private int sales;  // 판매량
	private int comm; 	// 커미션
	
	// [생성자]
	// 디폴트 생성자
	public SalesMan() {
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}
	
	// 생성자 7
	public SalesMan(String name, String addr, String tel, String hiredate, int pay, int sales, int comm) {
		super(name, addr, tel, hiredate, pay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 생성자 7 호출됨.");
	}

	// [메서드] - E(dispEI()) / R(dispEI(재정의), getPay()) / getter,setter 상속되어짐
	// Employee의 dispEmpInfo()   ->       Regular의 dispEmpInfo() + 기본급 재정의   ->     SalesMan의 dispEmpInfo() + 판매량, 커미션 재정의
	@Override
	public void dispEmpInfo() {
		// TODO Auto-generated method stub
		super.dispEmpInfo(); // Regular의 dispEmpInfo()의 함수(기본급까지 출력하는)
		System.out.printf("판매량 : %d, 커미션 : %d\n", this.sales, this.comm);
	}

	@Override // 영업직의 급여 계산
	public int getPay() {
		return super.getPay() + this.comm * this.sales; // getPay()는 기본급
	}
	
} // SalesMan class

/*
// 에러메시지 : The type XXX cannot subclass the final class SalesMan
// 해석 : SalesMan은 최종 클래스이기 때문에 자식 클래스를 가질 수 없다.
class XXX extends SalesMan{
	
}
*/