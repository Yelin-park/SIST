package days15;

// [클래스 - 사용자 정의 타입(user defined type)]
public class Student {
	// 필드
	int no;
	String name;
	int kor, eng, mat, tot, rank;
	double avg;
	
	
	// 메서드
	public void printInfo() { // 매개변수는 없고 학생의 정보를 출력해주는 메서드
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", no, name, kor, eng, mat, tot, avg, rank);
	}

} // Student
