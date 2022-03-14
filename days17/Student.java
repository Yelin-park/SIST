package days17;

// 학생 클래스 - 한 반에 30명 학생의 성적처리
public class Student {
	// 필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank;
	public double avg;
	
	// 디폴트 생성자
	public Student() {
		// super(); // 상속을 배워야 알 수 있어서 일단 넘김
	}
	
	// 생성자 오버로딩
	public Student(int no, String name, int kor, int eng, int mat, int tot, int rank, double avg) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
	}

	// 메서드
	public void printInfo() { // 매개변수는 없고 학생의 정보를 출력해주는 메서드
		System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
				no, name, kor, eng, mat, tot, avg, rank);
	}
	
} // Student
