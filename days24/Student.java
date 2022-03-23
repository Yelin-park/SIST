package days15;

// [클래스 - 사용자 정의 타입(user defined type)]
public class Student {
	// 필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	// 디폴트 생성자 추가(days16.Ex06 관련)
	public Student() {
		// super(); // 상속을 배워야 알 수 있어서 일단 넘김
	}
	
	// 생성자 오버로딩
	public Student(int no, String name, int kor, int eng, int mat, int tot, int rank, int wrank, double avg) {
		// super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.wrank = wrank;
		this.avg = avg;
	}


	// 메서드
	public void printInfo() { // 매개변수는 없고 학생의 정보를 출력해주는 메서드
		System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n", 
				no, name, kor, eng, mat, tot, avg, rank, wrank);
	}

	// days24.days07 관련 Generated toString() - 자기 자신의 정보를 반환하는 메서드
	@Override
	public String toString() {
		return String.format("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n", 
				no, name, kor, eng, mat, tot, avg, rank, wrank);
				//"Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				//+ tot + ", rank=" + rank + ", wrank=" + wrank + ", avg=" + avg + "]";
	}
	

} // Student
