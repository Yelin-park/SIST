package days17;

// 상속
public class ChildStudent extends Student{
	
	// 필드
	int w_rank;
	
	// 생성자는 상속되지 않는다.
	// 디폴트 생성자
	public ChildStudent() {
		// super(); // 상속을 배워야 알 수 있어서 일단 넘김
	}
	
	// 생성자 오버로딩
	public ChildStudent(int no, String name, int kor, int eng, int mat, int tot, int rank, double avg, int w_rank) {
		// super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
		
		this.w_rank = w_rank;
	}

} //ChildStudent
