package days27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 10:21:20
 * @subject [열거형 활용하는 예제] - 왜 쓰면 좋은지 보여주는 예제
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(1, "야리니", 90, 89, 78, 257, 85.66, 1));
		list.add(new Student(2, "꼬여사", 80, 89, 78, 247, 82.66, 1));
		list.add(new Student(3, "문방구", 90, 99, 78, 267, 88.66, 1));
		
	    // 정렬
	    // 1. 성정(tot) : list.sort(new StudentComparator(StudentSortOptions.SCORE ));
	    // 2. 이름(name) : list.sort(new StudentComparator(StudentSortOptions.NAME ));
	    // 3. 학번(no) : list.sort(new StudentComparator(StudentSortOptions.NO ));
	    
	    // list.sort(new StudentComparator(StudentSortOptions.NAME ));
	    // list.sort(new StudentComparator(StudentSortOptions.SCORE ));
	    list.sort(new StudentComparator(StudentSortOptions.NO ));
	    
	    System.out.println(">모든 학생 정보 출력<");
	    Iterator<Student> ir = list.iterator();
	    while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		} // while
	    
	} // main

} // class

// 열거형
enum StudentSortOptions{SCORE, NAME, NO};

class StudentComparator implements Comparator<Student>{
	// 멤버변수 -> compare 메서드에서 사용하기 위해서
	private StudentSortOptions sortOption;
	
	// 열거형 생성자
	public StudentComparator(StudentSortOptions sortOption) {
		this.sortOption = sortOption;
	}

	@Override
	public int compare(Student o1, Student o2) {
		switch (sortOption) {
		case NAME:
			String name1 = o1.getName();
			String name2 = o2.getName();
			return name1.compareTo(name2);
		case SCORE:
			return Integer.compare(o1.getTot(), o2.getTot());
		case NO:
			return Integer.compare(o1.getNo(), o2.getNo());
		default:
			return Integer.compare(o1.getNo(), o2.getNo()); // 기본값은 NO로 정렬
		} // switch
	
	} // compare
	
} // StudentSortOptions

class Student{
	// fields
	private int no, kor, eng, mat, tot, rank;
	private String name;
	private double avg;
	
	// 디폴트 생성자
	public Student() {
		super();
	}

	// 생성자
	public Student(int no, String name, int kor, int eng, int mat, int tot, double avg, int rank) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.name = name;
		this.avg = avg;
	}

	// getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat +
				", tot=" + tot + ", avg=" + avg + ", rank=" + rank + "]"; }
	
} // Student
